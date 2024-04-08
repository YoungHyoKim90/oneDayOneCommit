package M2024_04;

import java.util.Scanner;

public class BipartiteMatch {
    // 상수 선언
    static final int MAX = 1000;
    // A와 B의 정점 수
    static int countA, countB;
    // A와 B의 매칭 상태를 저장하는 배열
    static int[] matchA = new int[MAX];
    static int[] matchB = new int[MAX];
    // 인접 행렬과 방문 여부를 저장하는 배열
    static int[][] adj = new int[MAX][MAX];
    static int[] visited = new int[MAX];

    // 깊이 우선 탐색을 수행하는 함수
    static int dfs(int a) {
        // 이미 방문한 정점이라면 탐색 종료
        if (visited[a] == 1) {
            return 0;
        }

        // 현재 정점 방문 표시
        visited[a] = 1;

        // 현재 정점과 매칭할 수 있는 B의 정점을 찾음
        for (int b = 0; b < countB; ++b) {
            // 현재 정점과 연결되어 있고, 매칭되지 않았거나 새로운 매칭을 찾을 수 있다면
            if (adj[a][b] == 1 && (matchB[b] == -1 || dfs(matchB[b]) == 1)) {
                // 매칭 정보 갱신
                matchA[a] = b;
                matchB[b] = a;
                return 1; // 매칭 성공
            }
        }

        return 0; // 매칭 실패
    }

    // 이분 매칭을 수행하는 함수
    static int bipartiteMatch() {
        int size = 0; // 매칭된 쌍의 수 초기화
        for (int start = 0; start < countA; ++start) {
            // 매번 탐색을 시작하기 전에 방문 여부 초기화
            for (int i = 0; i < countA; i++) {
                visited[i] = 0;
            }
            // 현재 정점에서 매칭이 가능하다면 크기 증가
            if (dfs(start) == 1) {
                size++;
            }
        }
        return size; // 이분 매칭 결과 반환
    }

    // 초기화 함수
    static void initialize() {
        // 매칭 정보 초기화
        for (int i = 0; i < countA; i++) {
            matchA[i] = -1;
            // 인접 행렬 초기화
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
            countA = scanner.nextInt(); // A의 정점 수 입력
            countB = scanner.nextInt(); // B의 정점 수 입력

            initialize(); // 초기화 수행

            int adjCount = scanner.nextInt(); // 연결된 간선 수 입력

            // 인접 행렬 정보 입력
            for (int i = 0; i < adjCount; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                adj[a - 1][b - 1] = 1; // 인덱스를 0부터 시작하므로 1을 빼고 저장
            }

            // 결과 출력
            System.out.printf("#%d %d\n", test_case, bipartiteMatch());
            System.out.println("Clear Graph");
        }
    }
}
