package M2024_04;

import java.util.Scanner;
import java.util.Arrays;

/*
 * 입력으로 테스트 케이스 수, 그리고 각 테스트 케이스별로 정점 수와 간선 수를 받아들입니다. 그리고 각 간선의 정보를 받아 최소 신장 트리(Minimum Spanning Tree)의 총 가중치를 계산하고 출력합니다. Kruskal 알고리즘을 사용하여 최소 신장 트리를 구성합니다.
 */
class MinimumSpanningTree_Kruskal {

	static class Edge implements Comparable<Edge> {
		int x, y, w;

		public Edge(int x, int y, int w) {
			this.x = x;
			this.y = y;
			this.w = w;
		}

		@Override
		public int compareTo(Edge other) {
			return Integer.compare(this.w, other.w);
		}
	}

	static final int MAXV = 100005;
	static final int MAXE = 500005;

	static Edge[] edge = new Edge[MAXE];
	static Edge[] tmp = new Edge[MAXE];

	static int[] disjoint_set = new int[MAXV];

	static int find_root(int x) {
		if (disjoint_set[x] == x)
			return x;

		disjoint_set[x] = find_root(disjoint_set[x]);

		return disjoint_set[x];
	}

	static void mergeSort(int s, int e) {
		if (s < e) {
			int m = (s + e) / 2;
			mergeSort(s, m);
			mergeSort(m + 1, e);
			int left = s, right = m + 1, pointer = s;
			while (left <= m && right <= e) {
				if (edge[left].w <= edge[right].w) {
					tmp[pointer++] = edge[left++];
				} else {
					tmp[pointer++] = edge[right++];
				}
			}
			while (left <= m)
				tmp[pointer++] = edge[left++];
			while (right <= e)
				tmp[pointer++] = edge[right++];
			for (int i = s; i <= e; i++) {
				edge[i] = tmp[i];
			}
		}
	}

	static void kruskal(int V, int E) {
		int mstTotalWeight = 0;

		for (int i = 0; i < E; i++) {

			int groupX = find_root(edge[i].x);
			int groupY = find_root(edge[i].y);

			if (groupX == groupY) {
				continue;
			}

			mstTotalWeight += edge[i].w;

			disjoint_set[groupY] = groupX;
			System.out.println("Union " + groupX + " - " + groupY);
		}

		System.out.println(mstTotalWeight);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int TC = scanner.nextInt();
		for (int t = 0; t < TC; t++) {

			int V = scanner.nextInt();
			int E = scanner.nextInt();

			for (int i = 1; i <= V; i++) {
				System.out.println("Draw vertex " + i);
				disjoint_set[i] = i;
			}

			for (int i = 0; i < E; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				int w = scanner.nextInt();
				edge[i] = new Edge(x, y, w);
			}

			Arrays.sort(edge, 0, E);

			System.out.print("#" + (t + 1) + " ");
			kruskal(V, E);
		}

		scanner.close();
	}
}
