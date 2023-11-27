//package M2023_10;
//#include <stdio.h>
//#include <stdbool.h>
//#include <stdlib.h>
//
//public class D_1023_CodeTest01 {
//
//	int solution(int a, int b) {
//	    int answer = 0;
//	    if (a % 2 == 1 && b % 2 == 1) {
//	        answer = a * a + b * b;
//	    }
//	    // a와 b 중 하나만 홀수라면 2 * (a + b) 점을 얻습니다.
//	    else if (a % 2 == 1 || b % 2 == 1) {
//	        answer = 2 * (a + b);
//	    }
//	    // a와 b 모두 홀수가 아니라면 |a - b| 점을 얻습니다.
//	    else {
//	        answer = abs(a - b);
//	    }
//	    return answer;
//	}
//}
