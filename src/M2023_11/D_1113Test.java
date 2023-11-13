package M2023_11;
//none Here
public class D_1113Test {
/*
 * Permutation & Combination

개요
순열조합(permutation combination), 순열은 순서가 부여된 임의의 집합을 다른 순서로 뒤섞는 연산이며, 조합은 집합에서 일부 원소를 취해 부분 집합을 만드는 방법을 말한다.

예시문제
주어진 문자열 str (길이 n)에 대해 아래 두 가지를 차례로 출력하시오. 1. str의 n개 character를 일렬로 배열하는 모든 경우를 출력하시오. 2. str의 n개 character 중 k개를 취하는 모든 경우를 출력하시오. (제한사항: 주어진 string에 동일한 알파벳이 중복으로 포함되지 않음. String의 maximum size는 10. k <= n.)

입력
1 // # of test case
ABCD
3 // n
2 // k

출력
#1
ABC
ACB
BAC
BCA
CBA
CAB
AB
AC
BC

Reference Code
JAVA
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
import java.util.Scanner;
 
class Solution
{
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
 */
}
