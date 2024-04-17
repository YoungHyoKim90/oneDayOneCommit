package M2024_01;

import java.util.Scanner;
import java.util.Random;

public class SimpleJavaCode2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (loginFilter(username, password)) {
            System.out.println("Login successful!");
            String randomString = generateRandomString();
            System.out.println("Generated random string: " + randomString);
            scanner.close();
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }

    public static boolean loginFilter(String username, String password) {
        // 간단한 로그인 필터 로직을 구현
        return username.equals("admin") && password.equals("password");
    }

    public static String generateRandomString() {
        // 임의의 문자열 생성 로직을 구현
        int length = 8;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }

        return randomString.toString();
    }
}

