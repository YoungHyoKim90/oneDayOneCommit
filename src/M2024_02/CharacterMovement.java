package M2024_02;

import java.util.Scanner;

public class CharacterMovement {
    public static void main(String[] args) {
        // 캐릭터의 초기 위치 설정
        int x = 0;
        int y = 0;

        // 콘솔에서 입력 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            // 현재 위치 출력
            System.out.println("현재 위치: (" + x + ", " + y + ")");

            
            // 사용자로부터 이동 방향 입력 받기
            System.out.print("이동 방향을 입력하세요 (상: W, 하: S, 좌: A, 우: D): ");
            String direction = scanner.nextLine().toUpperCase(); // 입력값을 대문자로 변환하여 처리

            
            // 캐릭터 이동 처리
            switch (direction) {
                case "W":
                    y++;
                    break;
                case "S":
                    y--;
                    break;
                case "A":
                    x--;
                    break;
                case "D":
                    x++;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    continue; // 이동하지 않고 반복문 다시 시작
            }

            // 새로운 위치 출력
            System.out.println("이동 후 위치: (" + x + ", " + y + ")");

            // 사용자가 종료를 원하면 반복문 종료
            System.out.print("계속 이동하시겠습니까? (Y/N): ");
            String choice = scanner.nextLine().toUpperCase();
            if (!choice.equals("Y")) {
                break;
            }
        }

        // 프로그램 종료 메시지 출력
        System.out.println("프로그램을 종료합니다.");
    }
}

