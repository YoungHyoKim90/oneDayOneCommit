package M2023_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginSystem {
    private static Map<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) {
        // 사용자 데이터베이스에 가상의 사용자 추가
        userDatabase.put("user1", "password1");
        userDatabase.put("user2", "password2");
        userDatabase.put("user3", "password3");

        Scanner scanner = new Scanner(System.in);

        System.out.print("사용자 이름: ");
        String username = scanner.nextLine();

        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        if (isAuthenticated(username, password)) {
            System.out.println("로그인 성공!");
            // 로그인 성공 시 추가 작업 수행
        } else {
            System.out.println("로그인 실패. 사용자 이름 또는 비밀번호를 확인하세요.");
        }
        scanner.close();
    }

    private static boolean isAuthenticated(String username, String password) {
        // 사용자가 입력한 사용자 이름이 데이터베이스에 있는지 확인하고, 해당 비밀번호가 일치하는지 확인
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }
}

