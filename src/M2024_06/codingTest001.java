package M2024_06;

import java.util.Arrays;

public class codingTest001 {
    private static final int MOD = 998244353;

    public static int solution(int q, int[] a) {
        int n = a.length;
        int[][] dp = new int[n + 1][q + 1];

        // dp 초기화
        dp[0][0] = 1;

        // dp 갱신
        for (int j = 1; j <= q; j++) {
            for (int i = 0; i < n; i++) {
                for (int l = 0; l <= i; l++) {
                    for (int r = i; r < n; r++) {
                        boolean valid = true;
                        for (int k = l; k <= r; k++) {
                            if (a[k] > a[r]) {
                                valid = false;
                                break;
                            }
                        }
                        if (valid) {
                            dp[r + 1][j] = (dp[r + 1][j] + dp[l][j - 1]) % MOD;
                        }
                    }
                }
            }
        }

        return dp[n][q];
    }

    public static void main(String[] args) {
        // 테스트 케이스
        System.out.println(solution(2, new int[]{1, 2})); // 4
        System.out.println(solution(3, new int[]{3})); // 19
        System.out.println(solution(5, new int[]{1, 4, 4})); // 157740
        System.out.println(solution(50, new int[]{1, 6, 5, 2, 4})); // 61953538
    }
}

