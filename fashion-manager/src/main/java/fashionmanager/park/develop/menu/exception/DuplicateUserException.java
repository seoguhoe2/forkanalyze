package fashionmanager.park.develop.menu.exception;

// 회원 중복 예외
public class DuplicateUserException extends RuntimeException {
    public DuplicateUserException(String message) {
        super(message);
    }
}