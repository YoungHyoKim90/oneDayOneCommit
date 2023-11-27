package M2023_11;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HorseRaceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 5마리의 말을 나타내는 배열
        // 각 말은 0부터 시작하며, 경주가 끝날 때까지 이동 거리를 누적할 것입니다.
        int[] horses = new int[5];

        // 게임 시작을 알리는 메시지 출력
        System.out.println("경마 게임을 시작합니다!");

        // 게임 루프
        while (!isRaceFinished(horses)) {
            // 각 말에 대해 이동 거리를 랜덤하게 설정
            for (int i = 0; i < horses.length; i++) {
                int distance = random.nextInt(3) + 1; // 1부터 3까지의 랜덤한 값으로 이동 거리 설정

                // 말이 3칸을 이동할 때 특정 메시지 출력
                if (distance == 3) {
                    System.out.println((i + 1) + "번 말이 속도를 내네요!");
                }

                // 말의 위치가 비슷하게 이동할 때 메시지 출력
                for (int j = 0; j < horses.length; j++) {
                    if (i != j && horses[i] == horses[j]) {
                        System.out.println((i + 1) + "번 말이 " + (j + 1) + "번 말과 비슷한 위치에 있습니다!");
                    }
                }

                horses[i] += distance;
            }

            // 말의 현재 위치 출력
            displayHorsePositions(horses);

            // 일시정지를 위해 대기
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 경주가 끝났음을 알리는 메시지 출력
        System.out.println("경주가 종료되었습니다!");

        // 경주 결과 출력
        displayRaceResult(horses);

        scanner.close();
    }

    // 말들의 현재 위치를 출력하는 함수
    private static void displayHorsePositions(int[] horses) {
        int trackLength = 20; // 경주 트랙 길이
        for (int i = 0; i < horses.length; i++) {
            System.out.print(i + 1 + "번 말: ");
            for (int j = 0; j < trackLength; j++) {
                if (horses[i] == j) {
                    System.out.print("0");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    // 경주가 끝났는지 확인하는 함수
    private static boolean isRaceFinished(int[] horses) {
        int maxDistance = 20; // 말들이 도달해야 하는 최대 거리
        for (int distance : horses) {
            if (distance >= maxDistance) {
                return true; // 최대 거리에 도달한 말이 있으면 true 반환
            }
        }
        return false; // 모든 말이 최대 거리에 도달하지 않았으면 false 반환
    }

    private static void displayRaceResult(int[] horses) {
        System.out.println("경주가 종료되었습니다! 결과는 다음과 같습니다:");

        // 각 말의 최종 위치를 출력하여 순위를 표시합니다.
        int[] sortedHorses = Arrays.copyOf(horses, horses.length);
        Arrays.sort(sortedHorses);

        for (int i = sortedHorses.length - 1; i >= 0; i--) {
            int horseIndex = findHorseIndex(horses, sortedHorses[i]) + 1;
            System.out.println(horseIndex + "번 말이 " + (sortedHorses.length - i) + "등에 위치했습니다.");
        }
    }

    private static int findHorseIndex(int[] horses, int distance) {
        for (int i = 0; i < horses.length; i++) {
            if (horses[i] == distance) {
                return i;
            }
        }
        return -1; // 발견되지 않으면 -1 반환
    }
}


