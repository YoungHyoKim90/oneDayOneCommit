package M2023_11;
import java.util.Scanner;
import java.util.Random;

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
                horses[i] += distance;
            }

            // 말의 현재 위치 출력
            displayHorsePositions(horses);

            // 사용자가 다음 단계를 진행할 준비가 되었다는 메시지 출력
            System.out.println("Enter를 눌러 다음 단계로 진행하세요.");
            scanner.nextLine(); // 사용자 입력 대기
        }

        // 경주가 끝났음을 알리는 메시지 출력
        System.out.println("경주가 종료되었습니다!");
        scanner.close();
    }

    // 말들의 현재 위치를 출력하는 함수
    private static void displayHorsePositions(int[] horses) {
        // 여기에 말들의 현재 위치를 출력하는 코드를 작성하세요
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

}
