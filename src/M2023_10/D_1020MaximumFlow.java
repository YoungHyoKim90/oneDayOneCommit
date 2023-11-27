//package M2023_10;
//import java.util.Scanner;
////Maximum flow
////Network flow란 각각의 간선에 정해진 용량보다 작은 유량이 주어진 방향그래프를 말하며,
////Maximum flow란 위 수원지(S)에서 수요지(T)까지 공급할 수 있는 최대 유량을 말한다.
//public class D_1020MaximumFlow {
//
//	 
//	class Queue 
//	{
//	    int[] queueArray;
//	    int capacity;
//	    int front;
//	    int rear;
//	     
//	    public Queue(int capacity)
//	    {
//	        queueArray = new int[capacity];
//	        this.capacity = capacity;
//	        front = rear = 0;
//	    }
//	     
//	    void push(int item)
//	    {
//	        if ((rear + 1) % capacity == front)
//	        {
//	            return;
//	        }
//	        queueArray[rear] = item;
//	        rear = (rear + 1) % capacity;
//	    }
//	     
//	    void pop()
//	    {
//	        if (front == rear)
//	        {
//	            return;
//	        }
//	        front = (front + 1) % capacity;
//	    }
//	     
//	    int getFront()
//	    {
//	        return queueArray[front];
//	    }
//	     
//	    boolean isEmpty()
//	    {
//	        return (rear == front);
//	    }
//	}
//	 
//	class Solution
//	{
//	    static final int MAX_V = 10;
//	    static final int INF = 987654321;
//	    static int V;
//	 
//	    static int networkFlow(int source, int sink, int[][] capacity)
//	    {
//	        int[][] flow = new int[MAX_V][MAX_V];
//	        int[] parent = new int[MAX_V];
//	        int totalFlow = 0;
//	        while (true)
//	        {
//	            for (int p = 0; p < V; p++)
//	            {
//	                parent[p] = -1;
//	            }
//	 
//	            Queue q = new Queue(MAX_V);
//	             
//	            parent[source] = source;
//	            q.push(source);
//	 
//	            while (!q.isEmpty()) 
//	            {
//	                int here = q.getFront(); q.pop();
//	                for (int there = 0; there < V; ++there) 
//	                {
//	                    if (capacity[here][there] - flow[here][there] > 0 && parent[there] == -1)
//	                    {
//	                        q.push(there);
//	                        parent[there] = here;
//	                    }
//	                }
//	            }
//	            if (parent[sink] == -1)
//	            {
//	                break;
//	            }
//	 
//	            int amount = INF;
//	            for (int p = sink; p != source; p = parent[p]) 
//	            {
//	                if (capacity[parent[p]][p] - flow[parent[p]][p] > amount) 
//	                {
//	                    amount = amount;
//	                }
//	                else {
//	                    amount = capacity[parent[p]][p] - flow[parent[p]][p];
//	                }
//	            }
//	 
//	            for (int p = sink; p != source; p = parent[p]) 
//	            {
//	                flow[parent[p]][p] += amount;
//	                flow[p][parent[p]] -= amount;
//	            }
//	            totalFlow += amount;
//	        }
//	        return totalFlow;
//	    }
//	     
//	    public static void main(String args[]) throws Exception
//	    {
//	        Scanner sc = new Scanner(System.in);
//	        int T = sc.nextInt();
//	 
//	        for (int test_case = 1; test_case <= T; test_case++)
//	        {
//	            int [][]capacity = new int[MAX_V][MAX_V];
//	            V = sc.nextInt();
//	            int E = sc.nextInt();
//	            for (int i = 0; i < E; i++)
//	            {
//	                int here = sc.nextInt();
//	                int there = sc.nextInt();
//	                int C = sc.nextInt();
//	                capacity[here][there] = C;
//	            }
//	            int answer = networkFlow(0, V - 1, capacity);
//	            System.out.printf("#%d %d\n", test_case, answer);
//	        }
//	        sc.close();
//	    }
//	}
//	
//}
