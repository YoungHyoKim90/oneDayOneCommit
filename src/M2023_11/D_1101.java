package M2023_11;
import java.util.Scanner;
/**
 * Dynamic Programming
 * 동적 계획법(Dynamic programming)은 복잡한 문제를 풀기위해서 간단한 여러 개의 하위 문제로 나누어 푼 다음, 그것을 결합하여 목적에 도달하는 방법이다.
 * N개의 숫자 쌍이 주어진다. 숫자 쌍은 두 개의 숫자로 이루어져 있으며, 첫 번째 숫자를 x라고 하고, 두 번째 숫자를 y라고 했을 때 (x, y)로 표현할 수 있다. 이때 x는 1 또는 2로만 주어지고 y값은 1부터 100이하의 정수만 주어진다. 
 * N개의 숫자 쌍의 일부를 선택하여 x값들의 합을 Sx라고 하고, 
 * 선택되지 않은 나머지 숫자 쌍들의 y값들의 합을 Sy라고 할때, Sx ≥ Sy 를 만족해야 한다.
 * 예를 들어 N이 5인 숫자 쌍이 (x0, y0), (x1, y1), (x2, y2), (x3, y3), (x4, y4) 와 같이 주어진 경우 0, 2, 4번째 숫자 쌍을 선택했을 경우 x0+x2+x4 ≥ y1+y3 가 성립되어야 한다. 주어진 N개의 숫자 쌍 중, 
 * 위의 규칙에 맞게 숫자 쌍을 선택하는 방법 중, 선택된 숫자 쌍의 x의 합이 최소가 되는 경우를 찾고, 이 경우의 x의 합을 구하라.
 * 1) N은 1이상 1,000 이하의 정수. (1 ≤ N ≤ 1,000)
 * 2) 숫자 쌍 (x, y) 의 x, y 는 각각 1 ≤ x ≤ 2와 1 ≤ y ≤ 100를 만족하는 정수
 * @author PigYoung90
 *
 */
public class D_1101 {

	    static final int MAX_X = 2;
	    static final int MAX_N = 1001;
	 
	    static int N;
	    static int num_pair[][] = new int[MAX_N][2];
	 
	    static int dp[][] = new int[MAX_N][MAX_X * MAX_N];
	 
	    static int max(int a, int b)
	    {
	        return (a > b) ? a : b;
	    }
	 
	    static int solve() 
	    {
	        int ans = 0;
	 
	        for (int i = 0; i < MAX_N; i++)
	        {
	            for (int j = 0; j < MAX_X * MAX_N; j++)
	            {
	                dp[i][j] = 0;
	            }
	        }
	 
	        for (int i = 0; i < N; i++)
	        {
	            ans += num_pair[i][0];
	        }
	 
	        for (int i = 0; i < N; i++) 
	        {
	            for (int j = 0; j < ans; j++) 
	            {
	                dp[i][j] = -1;
	            }
	        }
	 
	        dp[0][ans] = 0;
	        dp[0][ans - num_pair[0][0] + num_pair[0][1]] = num_pair[0][0];
	 
	        for (int i = 1; i < N; i++) 
	        {
	            int sum = num_pair[i][0] + num_pair[i][1];
	            for (int j = 0; j <= ans; j++) 
	            {
	                if (dp[i - 1][j] != -1)
	                {
	                    int diff = j - sum;
	                    if (diff >= 0)
	                    {
	                        dp[i][diff] = max(dp[i][diff], dp[i - 1][j] + num_pair[i][0]);
	                    }
	                    dp[i][j] = dp[i - 1][j];
	                }
	            }
	        }
	        int max_value = -1;
	        for (int i = 0; i < N; i++) 
	        {
	            for (int j = 0; j <= ans; j++) 
	            {
	                max_value = max(max_value, dp[i][j]);
	            }
	        }
	        return ans - max_value;
	 
	    }
	 
	    public static void main(String[] args) throws Exception 
	    {
	        Scanner sc = new Scanner(System.in);
	        int T;
	        T = sc.nextInt();
	        for (int test_case = 1; test_case <= T; test_case++) 
	        {
	            N = sc.nextInt();
	 
	            for (int i = 0; i < N; i++) 
	            {
	                num_pair[i][0] = sc.nextInt();
	                num_pair[i][1] = sc.nextInt();
	            }
	            System.out.println("#" + test_case + " " + solve());
	        }
	        sc.close();
	    }
	
	
}
