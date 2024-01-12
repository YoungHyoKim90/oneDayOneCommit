package M2024_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class LoginFilterExample {

    private Map<String, String> userCredentials;

    public LoginFilterExample() {
        userCredentials = new HashMap<>();
    }

    // 임의의 문자 및 숫자열 생성 메서드
    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            randomString.append(characters.charAt(randomIndex));
        }

        return randomString.toString();
    }

    // 사용자 추가 메서드
    private void addUser(String username, String password) {
        userCredentials.put(username, password);
    }

    // 로그인 검증 메서드
    private boolean authenticate(String username, String password) {
        return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
    }

    public static void main(String[] args) {
        LoginFilterExample loginFilter = new LoginFilterExample();
        Scanner scanner = new Scanner(System.in);

        // 사용자 추가
        loginFilter.addUser("user1", loginFilter.generateRandomString(8));
        loginFilter.addUser("user2", loginFilter.generateRandomString(8));
        loginFilter.addUser("user3", loginFilter.generateRandomString(8));

        // 로그인 시도
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        // 로그인 검증
        if (loginFilter.authenticate(username, password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }

        scanner.close();
    }
}

