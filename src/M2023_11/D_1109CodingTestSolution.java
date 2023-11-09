package M2023_11;
/*
 * minimum spanning tree

개요
최소비용 신장트리(minimum spanning tree)는 네트워크(가중치가 간선에 할당된 그래프)에 있는 모든 정점들을 가장 적은 비용으로 연결하는 트리를 말한다.

예시문제
주어진 weighted graph에 대해 Minimum Spanning Tree를 구하고, 연결된 모든 Edge의 weight 합을 출력하시오.
첫째 줄에는 테스트 케이스의 수 T 및 Vertex의 개수 V가 들어온다. 두 번째 줄부터는 V x V개의 숫자가 들어오며, 이는 edge[i][j]의 weight를 나타내는 숫자이다 (단, V는 100을 넘지 않는다고 가정한다)

입력
1 5 // T - test case, V - Vertex 개수
0 2 0 6 0
2 0 3 8 5
0 3 0 0 7
6 8 0 0 9
0 5 7 9 0

출력
#1 16
 */
public class D_1109CodingTestSolution {

	/*
	 * import java.util.Scanner;
 
class Solution
{
    static int V;
    static int[][] graph = new int[100][100];
 
 
    static int minKey(int[] key, int[] mstSet)
    {
        int min = 2147483647;
        int min_index = -1;
 
        for (int v = 0; v < V; v++)
        {
            if (mstSet[v] == 0 && key[v] < min) 
            {
                min = key[v];
                min_index = v;
            }
        }
 
        return min_index;
    }
 
    static void printMST(int[] parent)
    {
        int weightSum = 0;
        for (int i = 1; i < V; i++)
        {
            weightSum += graph[i][parent[i]];
        }
        System.out.printf("%d\n", weightSum);
    }
 
    static void primMST()
    {
         int[] parent = new int[100];
         int[] key = new int[100];
         int[] mstSet = new int[100];
 
         for (int i = 0; i < V; i++) 
         {
            key[i] = 2147483647;
            mstSet[i] = 0;
         }
 
         key[0] = 0;
         parent[0] = -1;
 
        for (int count = 0; count < V-1; count++)
        {
            int u = minKey(key, mstSet);
            mstSet[u] = 1;
            for (int v = 0; v < V; v++)
            {
                if (graph[u][v] != 0 && mstSet[v] == 0 && graph[u][v] <  key[v])
                {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }
 
         printMST(parent);
    }
     
     
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++)
        {
            V = sc.nextInt();
            for (int i = 0; i < V; i++) 
            {
                for (int j = 0; j < V; j++) 
                {
                    graph[i][j] = sc.nextInt();
                }
            }
            System.out.printf("#%d ", test_case);
            primMST();
        }
        sc.close();
    }
}
	 */
}
