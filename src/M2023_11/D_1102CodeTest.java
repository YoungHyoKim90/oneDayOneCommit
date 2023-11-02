package M2023_11;

public class D_1102CodeTest {
/*
 * #include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(const char* myString) {
    // 입력 문자열의 길이를 구합니다.
    int len = strlen(myString);

    // 결과 문자열을 저장할 동적 할당 배열을 선언합니다.
    char* result = (char*)malloc(len + 1);  // +1은 문자열 끝의 널 문자('\0')를 포함합니다.

    // 문자열을 변환하고 결과 문자열에 복사합니다.
    for (int i = 0; i < len; i++) {
        if (myString[i] == 'a') {
            result[i] = 'A';
        } else if (myString[i] >= 'A' && myString[i] <= 'Z') {
            result[i] = myString[i] + ('a' - 'A');
        } else {
            result[i] = myString[i];
        }
    }

    result[len] = '\0';  // 결과 문자열의 끝에 널 문자를 추가합니다.

    return result;
}

int main() {
    const char* myString = "Hello World! abcde";
    char* result = solution(myString);

    printf("%s\n", result);

    free(result);  // 동적 할당 메모리 해제
    return 0;
}

 */
}
