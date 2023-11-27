//package M2023_10;
//
//import java.util.Scanner;
//
////Linked List는 각 노드가 데이터와 포인터를 가지고 한 줄로 연결되어 있는 방식으로 데이터를 저장하는 자료 구조이다.
//
//public class D_1018_LinkedList {
//
//	class ListNode
//	{
//	    int data;
//	    ListNode prev;
//	    ListNode next;
//	 
//	    ListNode(int _data) 
//	    {
//	        data = _data;
//	        prev = null;
//	        next = null;
//	    }
//	 
//	    static ListNode list_insert(ListNode _head, ListNode new_node)
//	    {
//	        ListNode next = _head.next;
//	 
//	        _head.next = new_node;
//	        new_node.next = next;
//	        new_node.prev = _head;
//	     
//	        if (next != null)
//	        {
//	            next.prev = new_node;
//	        }
//	 
//	        return new_node;
//	    }
//	 
//	    static int list_erase(ListNode head, int _data)
//	    {
//	        ListNode it = head.next;
//	        int ret = 0;
//	 
//	        while (it != null)
//	        {
//	            if (it.data == _data)
//	            {
//	                ListNode prev = it.prev;
//	                ListNode next = it.next;
//	                it = it.next;
//	 
//	                prev.next = next;
//	                if (next != null)
//	                {
//	                    next.prev = prev;
//	                }
//	             
//	                ret++;
//	            }
//	            else
//	            {
//	                it = it.next;
//	            }
//	        }
//	 
//	        return ret;
//	    }
//	};
//	 
//	class Solution3
//	{
//	    public static void main(String args[]) throws Exception
//	    {
//	        Scanner sc = new Scanner(System.in);
//	 
//	        int T = sc.nextInt();
//	 
//	        for (int test_case = 1; test_case <= T; test_case++)
//	        {
//	            int N = sc.nextInt();
//	 
//	            ListNode head = new ListNode(0);
//	 
//	            System.out.printf("#%d", test_case);
//	            for (int i = 0; i < N; i++)
//	            {
//	                int mode = sc.nextInt();
//	                int data = sc.nextInt();
//	 
//	                if (mode == 1)
//	                {
//	                    ListNode node = new ListNode(data);
//	 
//	                    ListNode.list_insert(head, node);
//	                }
//	                else if (mode == 2)
//	                {
//	                    System.out.printf(" %d", ListNode.list_erase(head, data));
//	                }
//	            }
//	 
//	            System.out.printf("\n");
//	        }
//	    }
//	 
//	}
//	
//
