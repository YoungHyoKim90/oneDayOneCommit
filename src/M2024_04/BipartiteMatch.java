package M2024_04;

import java.util.Scanner;

public class BipartiteMatch {
    static final int MAX = 1000;
    static int countA, countB;
    static int[] matchA = new int[MAX];
    static int[] matchB = new int[MAX];
    static int[][] adj = new int[MAX][MAX];
    static int[] visited = new int[MAX];

    static int dfs(int a) {
        if (visited[a] == 1) {
            return 0;
        }

        visited[a] = 1;

        for (int b = 0; b < countB; ++b) {
            if (adj[a][b] == 1 && (matchB[b] == -1 || dfs(matchB[b]) == 1)) {
                matchA[a] = b;
                matchB[b] = a;
                return 1;
            }
        }

        return 0;
    }

    static int bipartiteMatch() {
        int size = 0;
        for (int start = 0; start < countA; ++start) {
            for (int i = 0; i < countA; i++) {
                visited[i] = 0;
            }
            if (dfs(start) == 1) {
                size++;
            }
        }
        return size;
    }

    static void initialize() {
        for (int i = 0; i < countA; i++) {
            matchA[i] = -1;
            for (int j = 0; j < countB; j++) {
                adj[i][j] = 0;
            }
        }

        for (int i = 0; i < countB; i++) {
            matchB[i] = -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            countA = scanner.nextInt();
            countB = scanner.nextInt();

            initialize();

            int adjCount = scanner.nextInt();

            for (int i = 0; i < adjCount; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                adj[a - 1][b - 1] = 1;
            }

            System.out.printf("#%d %d\n", test_case, bipartiteMatch());
            System.out.println("Clear Graph");
        }
    }
}
