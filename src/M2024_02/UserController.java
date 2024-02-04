package M2024_02;

public class UserController {
    private UserModel userModel;
    private UserView userView;

    public UserController(UserModel userModel, UserView userView) {
        this.userModel = userModel;
        this.userView = userView;
    }

    public void setUserDetails(String username, String email) {
        userModel.setUsername(username);
        userModel.setEmail(email);
    }

    public void updateUserView() {
        userView.printUserDetails(userModel.getUsername(), userModel.getEmail());
    }
}
