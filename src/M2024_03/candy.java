package M2024_03;
import java.util.Scanner;

public class candy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt(); // 첫 번째 상자의 사탕 개수
            int B = scanner.nextInt(); // 두 번째 상자의 사탕 개수
            int C = scanner.nextInt(); // 세 번째 상자의 사탕 개수

            int result = solve(A, B, C);
            System.out.println(result);
        }

        scanner.close();
    }

    public static int solve(int A, int B, int C) {
        // B에서 A 사이의 차이
        int diff1 = B - A;
        // C에서 B 사이의 차이
        int diff2 = C - B;

        // 조건을 만족하는지 확인
        if (diff1 < 0 || diff2 < 0) {
            // 조건을 만족하지 못하면 -1 반환
            return -1;
        }

        // 최소한의 사탕을 먹어야 하는 개수는 B를 A + diff1로 만들고,
        // C를 B + diff2로 만드는 경우이므로 diff1 + diff2를 반환
        return diff1 + diff2;
    }
}
