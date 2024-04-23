package M2024_04;

import java.util.Scanner;

class countingSort {
 
    static final int MAX_N = 100;
    static final int MAX_DIGIT = 10;
 
    static int N;  // # of data set
    static int arr[];
    static int cnt[] = new int[MAX_DIGIT];
    static int sortedArr[];
 
    static void calculateDigitNumber()
    {
        for (int i = 0; i < N; i++)
        {
            cnt[arr[i]]++;
        }
 
        for (int i = 1; i < MAX_DIGIT; i++)
        {
            cnt[i] = cnt[i-1] + cnt[i];
        }
    }
 
    static void executeCountingSort()
    {
        for (int i = N-1; i >= 0; i--)
        {
            sortedArr[--cnt[arr[i]]] = arr[i];
        }
    }
 
    public static void main(String arg[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++) 
        {
            N = sc.nextInt();
             
            arr = new int[N];
            sortedArr = new int[N];
 
            for (int i = 0; i < N; i++)
            {
                arr[i] = sc.nextInt();
            }
 
            // initialize
            for (int i = 1; i < MAX_DIGIT; i++)
            {
                cnt[i] = 0;
            }
 
            calculateDigitNumber();
            executeCountingSort();
 
            //print the sorted digits
            System.out.print("#" + test_case + " ");
            for (int i = 0; i < N; i++) 
            {
                System.out.print(sortedArr[i] + " ");
            }
            System.out.println();
        }
         
        sc.close();
    }
}