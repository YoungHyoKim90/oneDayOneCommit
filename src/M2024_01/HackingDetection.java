package M2024_01;

import java.util.Scanner;

public class HackingDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("로그인을 시도하세요:");

        // 사용자의 시도를 입력 받음
        String userInput = scanner.nextLine();

        // 간단한 예시로 "admin"이라는 문자열이 입력되면 경고 출력
        if (userInput.equals("admin")) {
            System.out.println("경고: 해킹 시도 감지!");
        } else {
            System.out.println("로그인 시도가 정상 처리되었습니다.");
        }

        scanner.close();
    }
}

