package fashionmanager.dto;

import lombok.*;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;


@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberRightDTO{
    private int memberNum;
    private String memberId;
    private String memberPwd;
    private String memberEmail;
    private String memberName;
    private int memberAge;
    private char memberGender;
    private int memberHeight;
    private int memberWeight;
    private String memberStatus;
    private int memberReportCount;
    private int memberDailyReportCount;
    private int memberGoodCount;
    private int memberMonthlyGoodCount;
    private int memberCheerCount;
    private boolean memberMessageAllow;

    private int memberStateNum;
    private String memberStateName;

//    @Override
//    public boolean isAccountNonExpired() {
//        return UserDetails.super.isAccountNonExpired();
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return UserDetails.super.isAccountNonLocked();
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return UserDetails.super.isCredentialsNonExpired();
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return UserDetails.super.isEnabled();
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of();
//    }
//
//    @Override
//    public String getPassword() {
//        return "";
//    }
//
//    @Override
//    public String getUsername() {
//        return "";
//    }
}
