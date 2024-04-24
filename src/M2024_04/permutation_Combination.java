package M2024_04;

import java.util.Scanner;

public class permutation_Combination {

    // 최대 문자열 길이
    static final int MAX_STRING_LENGTH = 10;
    // 조합에 사용할 스택과 스택의 최상위 인덱스
    static int stackTop = 0;
    static char[] combinationStack = new char[MAX_STRING_LENGTH];
     
    // 문자 배열을 출력하는 함수
    static void printCString(char[] str) {
        for (int i = 0; i < str.length && str[i] != 0; i++) {
            System.out.print(str[i]);
        }
        System.out.print("\n");
    }

    // 두 문자의 위치를 바꾸는 함수
    static void swap(char[] str, int x, int y) {
        char temp = str[x];
        str[x] = str[y];
        str[y] = temp;
    }

    // 순열을 구하는 함수
    static void permutation(char[] str, int l, int r) {
        if (l == r) {
            // 기저 사례: l과 r이 같을 때 현재 순열 출력
            printCString(str);
        } else {
            for (int i = l; i <= r; i++) {
                swap(str, l, i); // l번째 문자를 i번째 문자와 교환
                permutation(str, l + 1, r); // 다음 위치에 대해 순열 구하기
                swap(str, l, i); // 원래 상태로 되돌리기 (백트래킹)
            }
        }
    }

    // 스택에 문자를 추가하는 함수
    static void push(char ch) {
        combinationStack[stackTop++] = ch;
        combinationStack[stackTop] = '\0'; // 문자열의 끝을 표시
    }

    // 스택에서 문자를 제거하는 함수
    static void pop() {
        combinationStack[--stackTop] = '\0';
    }

    // 조합을 구하는 함수
    static void combination(char[] str, int length, int offset, int k) {
        if (k == 0) {
            // 기저 사례: k가 0일 때 현재 조합 출력
            printCString(combinationStack);
            return;
        }
        for (int i = offset; i <= length - k; ++i) {
            push(str[i]); // 현재 문자를 스택에 추가
            combination(str, length, i + 1, k - 1); // 다음 문자에 대해 조합 구하기
            pop(); // 스택에서 문자 제거 (백트래킹)
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수 입력
        for (int test_case = 1; test_case <= T; test_case++) {
            String input = sc.next(); // 문자열 입력
            int N = sc.nextInt(); // 문자열의 길이 입력
            int K = sc.nextInt(); // 조합의 길이 입력
            char[] str = input.toCharArray(); // 문자열을 문자 배열로 변환

            System.out.printf("#%d\n", test_case);
            str[N] = 0; // 문자열의 끝을 표시하기 위해 null 문자 추가
            permutation(str, 0, N - 1); // 순열 구하기
            combination(str, N, 0, K); // 조합 구하기
        }
        sc.close();
    }
}
