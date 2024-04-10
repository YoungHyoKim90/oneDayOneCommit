package M2024_04;

import java.util.Scanner;

public class BipartiteMatch2 {
    static final int MAX = 1000;
    static int countA, countB;
    static int[] matchA = new int[MAX];
    static int[] matchB = new int[MAX];
    static int[][] adj = new int[MAX][MAX];
    static int[] visited = new int[MAX];

    // 깊이 우선 탐색을 수행하여 증가 경로를 찾는 함수
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

    // 이분 매칭을 수행하는 함수
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

    // 초기화 함수
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
        int T = scanner.nextInt(); // 테스트 케이스 개수 입력

        for (int test_case = 1; test_case <= T; test_case++) {
            countA = scanner.nextInt(); // A 집합의 정점 수 입력
            countB = scanner.nextInt(); // B 집합의 정점 수 입력

            initialize(); // 초기화 수행

            int adjCount = scanner.nextInt(); // 이분 그래프의 간선 수 입력

            // 인접 행렬 정보 입력
            for (int i = 0; i < adjCount; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                adj[a - 1][b - 1] = 1; // 인덱스를 0부터 시작하므로 1을 빼고 저장
            }

            // 결과 출력
            System.out.printf("#%d %d\n", test_case, bipartiteMatch());
            System.out.println("Clear Graph"); // "Clear Graph" 출력하여 현재 테스트 케이스의 그래프 종료를 나타냄
            scanner.close();
        }
    }
}
