package M2024_08;

import java.util.Scanner;

public class Knapsack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt(); // 물건의 수
        int K = sc.nextInt(); // 준서가 버틸 수 있는 무게

        int[] weights = new int[N];
        int[] values = new int[N];

        // 물건의 무게와 가치 입력 받기
        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }

        // dp 배열 선언 및 초기화
        int[] dp = new int[K + 1];

        // DP 테이블 채우기
        for (int i = 0; i < N; i++) {
            int weight = weights[i];
            int value = values[i];
            // 현재 물건의 무게를 기준으로 뒤에서부터 DP 테이블 업데이트
            for (int w = K; w >= weight; w--) {
                dp[w] = Math.max(dp[w], dp[w - weight] + value);
            }
        }

        // 결과 출력
        System.out.println(dp[K]);

        sc.close();
    }
}
