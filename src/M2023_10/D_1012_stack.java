package M2023_10;

import java.util.Scanner;

//Stack은 한 쪽 끝에서만 자료를 넣거나 뺄 수 있는 
//선형 구조(LIFO - Last In First Out)로 데이터를 저장하는 형식을 말한다.
//상자에 물건을 넣는것처럼 생각하면된다. 제일 먼저 넣은 물건은 제일 마지막에 빠져나오고, 제일 마지막에 넣은 물건은 제일 먼저 뺄수 있는 것처럼된 구조이다.

public class D_1012_stack { 

	
    static final int MAX_N = 100;
    
    static int top;
    static int stack[] = new int[MAX_N];
 
    static void stackInit()
    {
        top = 0;
    }
 
    static boolean stackIsEmpty()
    {
        return (top == 0);
    }
 
    static boolean stackIsFull()
    {
        return (top == MAX_N);
    }
 
    static boolean stackPush(int value)
    {
        if (stackIsFull())
        {
            System.out.println("stack overflow!");
            return false;
        }
        stack[top] = value;
        top++;
 
        return true;
    }
 
    static Integer stackPop()
    {
        if (top == 0) 
        {
            System.out.println("stack is empty!");
            return null;
        }
 
        top--;      
        Integer value = new Integer(stack[top]);
 
        return value;
    }
 
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
 
            stackInit();
            for (int i = 0; i < N; i++) 
            {
                int value = sc.nextInt();
                stackPush(value);
            }
 
            System.out.print("#" + test_case + " ");
 
            while (!stackIsEmpty())
            {
                Integer value = stackPop();
                if (value != null)
                {
                    System.out.print(value.intValue() + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
