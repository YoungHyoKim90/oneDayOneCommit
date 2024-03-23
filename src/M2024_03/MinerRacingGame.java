package M2024_03;

import java.util.Random;
import java.util.Scanner;

public class MinerRacingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("광부 경마 게임에 오신 것을 환영합니다!");
        System.out.println("5명의 광부가 경주에 참여합니다.");

        // 광부들의 초기 위치를 나타내는 배열
        int[] miners = {0, 0, 0, 0, 0};

        // 경주 시작 메시지 출력
        System.out.println("게임을 시작합니다! 광부를 선택하세요 (1~5):");
        int userChoice = scanner.nextInt();
        if (userChoice < 1 || userChoice > 5) {
            System.out.println("잘못된 선택입니다. 1부터 5까지의 숫자 중 하나를 선택하세요.");
            return;
        }

        // 경주 시작
        while (true) {
            // 광부들의 이동
            for (int i = 0; i < miners.length; i++) {
                miners[i] += random.nextInt(3) + 1; // 1~3 사이의 랜덤한 이동
            }

            // 현재 광부들의 위치 출력
            for (int i = 0; i < miners.length; i++) {
                System.out.println("광부 " + (i + 1) + ": " + miners[i]);
            }

            // 경주 종료 조건 확인
            for (int i = 0; i < miners.length; i++) {
                if (miners[i] >= 10) {
                    System.out.println("축하합니다! " + (i + 1) + "번 광부가 경주에서 1등했습니다!");
                    return;
                }
            }

            // 사용자가 선택한 광부의 위치 출력
            System.out.println("당신이 선택한 광부의 위치: " + miners[userChoice - 1]);
            System.out.println("다음 라운드를 시작합니다. 엔터를 누르세요.");
            scanner.nextLine(); // 엔터 대기
            scanner.nextLine(); // 다음 라운드로 넘어가기 위해 다시 엔터 대기
            System.out.println();
        }
    }
}
