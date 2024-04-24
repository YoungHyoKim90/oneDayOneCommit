package M2024_04;

import java.util.Scanner;

public class permutation_Combination {

	    static final int MAX_STRING_LENGTH = 10;
	    static int stackTop = 0;
	    static char[] combinationStack = new char[MAX_STRING_LENGTH];
	     
	    static void printCString(char[] str)
	    {
	        for (int i = 0; i < str.length && str[i] != 0; i++)
	        {
	            System.out.print(str[i]);
	        }
	        System.out.print("\n");
	    }
	 
	    static void swap(char[] str, int x, int y)
	    {
	        char temp = str[x];
	        str[x] = str[y];
	        str[y] = temp;
	    }
	 
	    static void permutation(char[] str, int l, int r)
	    {
	        if (l == r)
	        {
	            printCString(str);
	        }
	        else
	        {
	            for (int i = l; i <= r; i++) 
	            {
	                swap(str, l, i);
	                permutation(str, l+1, r);
	                swap(str, l, i); //backtrack
	            }
	        }
	    }
	 
	    static void push(char ch) 
	    {
	        combinationStack[stackTop++] = ch;
	        combinationStack[stackTop] = '\0';
	    }
	 
	    static void pop() 
	    {
	        combinationStack[--stackTop] = '\0';
	    }
	 
	    static void combination(char[] str, int length, int offset, int k) 
	    {
	         
	        if (k == 0) 
	        {
	            printCString(combinationStack);
	            return;
	        }
	        for (int i = offset; i <= length - k; ++i) 
	        {
	            push(str[i]);
	            combination(str, length, i+1, k-1);
	            pop();
	        }
	    }
	     
	     
	    public static void main(String args[]) throws Exception
	    {
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        for (int test_case = 1; test_case <= T; test_case++)
	        {
	            String input = sc.next();
	            int N = sc.nextInt();
	            int K = sc.nextInt();
	            char[] str = input.toCharArray();
	             
	            System.out.printf("#%d\n", test_case);
	            str[N] = 0;
	            permutation(str, 0, N-1);
	            combination(str, N, 0, K);
	        }
	        sc.close();
	    }
	}