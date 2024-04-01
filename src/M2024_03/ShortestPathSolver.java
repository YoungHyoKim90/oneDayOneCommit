package M2024_03;

import java.util.Scanner;

class ShortestPathSolver {
    static final int N = 100;
    static final int INF = 100000;
    static int[][] graph = new int[N+1][N+1];
    static boolean[] visited = new boolean[N+1];
    static int[] distance = new int[N+1];
    static int vertices;
    static int edges;
    static int startingPoint;
    static int endingPoint;

    public static void dijkstra() {
        int currentVertex = 0;
        distance[startingPoint] = 0;
        for (int i = 1; i <= vertices; i++) {
            int minDistance = INF;
            for (int j = 1; j <= vertices; j++) {
                if (!visited[j] && minDistance > distance[j]) {
                    minDistance = distance[j];
                    currentVertex = j;
                }
            }

            visited[currentVertex] = true;

            for (int j = 1; j <= vertices; j++) {
                if (distance[j] > distance[currentVertex] + graph[currentVertex][j]) {
                    distance[j] = distance[currentVertex] + graph[currentVertex][j];
                }
            }
        }
    }


    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int testCase = 1; testCase <= testCases; testCase++) {
            vertices = scanner.nextInt();
            startingPoint = scanner.nextInt();
            endingPoint = scanner.nextInt();
            edges = scanner.nextInt();

            for (int i = 1; i <= vertices; i++) {
                for (int j = 1; j <= vertices; j++) {
                    if (i != j) {
                        graph[i][j] = INF;
                    }
                }
            }

            for (int i = 1; i <= edges; i++) {
                int from = scanner.nextInt();
                int to = scanner.nextInt();
                int value = scanner.nextInt();
                graph[from][to] = value;
            }

            for (int i = 1; i <= vertices; i++) {
                distance[i] = INF;
                visited[i] = false;
            }

            dijkstra();
            System.out.printf("#%d %d\n", testCase, distance[endingPoint]);
        }
        scanner.close();
    }
}

