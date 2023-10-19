package M2023_10;
import java.util.Scanner;

/*
 * topological sorting
 * 위상 정렬(topological sorting)은 유향 그래프의 정점(vertex)을 간선의 방향을 거스르지 않도록 나열하는 것을 의미한다.
 * 위와 같은 그래프에서 숫자가 있는 원은 정점(Vertex)라고 하고, 정점과 정점을 잇는 연결선을 간선(Edge)이라고 한다. N(<=25)개의 정점과 M(<=25)개의 간선이 주어졌을 때, 도착점 D 까지의 위상정렬을 구하시오.
 */

public class D_1019TopologicaSlorting {

	 
	class Queue 
	{
	    int[] queue;
	    int front;
	    int rear;
	    public Queue(int capacity)
	    {
	        queue = new int[capacity];
	        front = rear = 0;
	    }
	     
	    boolean has_item()
	    {
	        return rear > front;
	    }
	     
	    int dequeue()
	    {
	        front++;
	        return queue[front-1];
	    }
	     
	    void enqueue(int item)
	    {
	        queue[rear++] = item;
	    }
	}
	 
	class Stack 
	{
	    int[] stack_set;
	    int last;
	    public Stack(int capacity)
	    {
	        stack_set = new int[capacity];
	        last = 0;
	    }
	     
	    boolean has_item()
	    {
	        return last > 0;
	    }
	     
	    int peek()
	    {
	        return stack_set[last-1];
	    }
	     
	    int pop()
	    {
	        return stack_set[--last];
	    }
	     
	    void mark_duplicate(int item)
	    {
	        for (int i = 0; i < last; i++)
	        {
	            if (stack_set[i] == item)
	            {
	                stack_set[i] = Solution.DUPLICATE;
	            }
	        }
	    }
	     
	    void push(int item)
	    {
	        mark_duplicate(item);
	        stack_set[last++] = item;
	    }
	}
	 
	class Node
	{
	    int item;
	    Node prev;
	     
	    public Node(int item)
	    {
	        this.item = item;
	    }
	     
	    void reset()
	    {
	        prev = null;
	    }
	     
	    void push(Node other)
	    {
	        if (prev == null)
	        {
	            prev = other;
	            return;
	        }
	        Node head = this;
	        while (head.prev != null)
	        {
	            head = head.prev;
	        }
	        head.prev = other;
	    }
	}
	 
	 
	class Solution
	{
	    static final int MAX_N = 25;
	    static final int MAX_M = 25;
	     
	    static final int CONNECTED = 1;
	    static final int NOT_CONNECTED = 0;
	    static final int NOT_UPDATED_YET = 0;
	    static final int NOT_VISITED = -1;
	    static final int DUPLICATE = -2;
	     
	    static int[][] map = new int[MAX_N][MAX_N];
	    static int[] count = new int[MAX_N];
	    static Node[] nodes = new Node[MAX_N];
	    static Stack stack;
	    static Queue queue;
	     
	    static void reset()
	    {
	        for (int i = 0; i < MAX_N; i++) 
	        {
	            for (int j = 0; j < MAX_N; j++) 
	            {
	                map[i][j] = 0;
	            }
	        }
	         
	        for (int i = 0; i < MAX_N; i++)
	        {
	            count[i] = 0;
	        }
	         
	        stack = new Stack(MAX_N);
	        queue = new Queue(MAX_N);
	         
	        for (int i = 0; i < MAX_N; i++)
	        {
	            nodes[i].reset();
	        }
	    }
	     
	    static boolean connected(final int src, final int dest)
	    {
	        return map[src][dest] == CONNECTED;
	    }
	     
	 
	    static void traverse(final int idx)
	    {
	        stack.push(nodes[idx].item);
	        Node cur = nodes[idx].prev;
	        while (cur != null) 
	        {
	            traverse(cur.item);
	            cur = cur.prev;
	        }
	    }
	     
	    public static void main(String args[]) throws Exception
	    {
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	 
	        for (int i = 0; i < MAX_N; i++)
	        {
	            nodes[i] = new Node(i);
	        }
	         
	        for (int test_case = 1; test_case <= T; test_case++)
	        {
	            int n = sc.nextInt();
	            int m = sc.nextInt();
	            int dest = sc.nextInt();
	            reset();
	            for (int i = 0; i < m; i++)
	            {
	                int from = sc.nextInt();
	                int to = sc.nextInt();
	                map[from-1][to-1] = CONNECTED;
	                count[to-1]++;
	            }
	            for (int i = 0; i < n; i++)
	            {
	                if (count[i] == 0)
	                {
	                    queue.enqueue(i);
	                }
	            }
	            while (queue.has_item())
	            {
	                int src = queue.dequeue();
	                for (int i = 0; i < n; i++){
	                    if (connected(src, i))
	                    {
	                        Node node = new Node(src);
	                        nodes[i].push(node);
	                        count[i]--;
	                        if (count[i] == 0)
	                        {
	                            queue.enqueue(i);
	                        }
	                    }
	                }
	            }
	            System.out.printf("#%d ", test_case);
	            if (nodes[dest-1].prev == null)
	            {
	                System.out.printf("Not reached");
	            } else
	            {
	                traverse(dest - 1);
	                while (stack.has_item())
	                {
	                    int item = stack.pop();
	                    if (item == DUPLICATE)
	                    {
	                        continue;
	                    }
	                    System.out.printf("%d ", item + 1);
	                }               
	            }
	            System.out.printf("\n");
	        }
	        sc.close();
	    }
	}

}

