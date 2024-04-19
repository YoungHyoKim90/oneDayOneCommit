package M2024_04;

import java.util.Scanner;

public class TopologicalSort {
    static class EDGE {
        int s, e, prv;
    }

    static final int MAXN = 50005;
    static final int MAXM = 150005;

    static EDGE[] E = new EDGE[MAXM];
    static int[] to = new int[MAXN];
    static int[] deg = new int[MAXN];
    static int[] Q = new int[MAXN];
    static int N, M;
    static int fr, re;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            N = scanner.nextInt();
            M = scanner.nextInt();

            for (int i = 1; i <= N; i++) {
                to[i] = -1;
                System.out.println("Make Vertex " + i);
            }

            for (int i = 1; i <= M; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                E[i] = new EDGE();
                E[i].s = x;
                E[i].e = y;
                E[i].prv = to[x];
                to[x] = i;

                deg[y]++;
            }
            fr = 0;
            re = -1;
            for (int i = 1; i <= N; i++) {
                if (deg[i] == 0) {
                    Q[++re] = i;
                }
            }

            int tc = 0;
            System.out.print("#" + (++tc));

            while (fr <= re) {
                int x = Q[fr++];
                System.out.print(" " + x);
                for (int i = to[x]; i != -1; i = E[i].prv) {
                    int y = E[i].e;
                    if (--deg[y] == 0) {
                        Q[++re] = y;
                    }
                }
            }

            System.out.println();
            scanner.close();
        }
    }
}

