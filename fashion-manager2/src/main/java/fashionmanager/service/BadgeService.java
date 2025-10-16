package fashionmanager.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import fashionmanager.mapper.UserMapper;
import fashionmanager.mapper.UserStructMapper;
import fashionmanager.dto.UserDTO;
import fashionmanager.entity.Badge;
import fashionmanager.entity.User;
import fashionmanager.repository.BadgeRepository;
import fashionmanager.repository.UserRepository;

@Service
public class BadgeService {

    private final UserRepository userRepository;
    private final BadgeRepository badgeRepository;
    private final UserMapper userMapper;
    private final UserStructMapper userStructMapper;
    public BadgeService(UserRepository userRepository, BadgeRepository badgeRepository, UserMapper userMapper, UserStructMapper userStructMapper) {
        this.userRepository = userRepository;
        this.badgeRepository = badgeRepository;
        this.userMapper = userMapper;
        this.userStructMapper = userStructMapper;
    }


    // 회원에게 칭호 부여

    @Transactional
    public UserDTO assignBadge(int userNum, int badgeNum) {
        User user = userRepository.findById(userNum)
                .orElseThrow(() -> new RuntimeException("회원 없음"));

        Badge badge = badgeRepository.findById(badgeNum)
                .orElseThrow(() -> new RuntimeException("뱃지 없음"));

        user.getBadges().add(badge);
        User savedUser = userRepository.save(user);

        // MapStruct로 엔티티 → DTO 변환

        return userStructMapper.toDto(savedUser);
    }


    // 회원에게서 칭호 삭제
    @Transactional
    public void removeBadge(int userNum, int badgeNum) {
        User user = userRepository.findById(userNum)
                .orElseThrow(() -> new RuntimeException("회원 없음"));
        Badge badge = badgeRepository.findById(badgeNum)
                .orElseThrow(() -> new RuntimeException("뱃지 없음"));

        user.getBadges().remove(badge); // 관계 해제
        userRepository.save(user);

        System.out.println("남은 뱃지 = " + user.getBadges());

    }
}