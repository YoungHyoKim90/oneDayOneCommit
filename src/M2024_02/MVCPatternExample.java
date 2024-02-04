package M2024_02;

public class MVCPatternExample {
    public static void main(String[] args) {
        // 모델, 뷰, 컨트롤러 생성
        UserModel userModel = new UserModel();
        UserView userView = new UserView();
        UserController userController = new UserController(userModel, userView);

        // 사용자 정보 설정
        userController.setUserDetails("john_doe", "john@example.com");

        // 뷰 업데이트
        userController.updateUserView();
    }
}

