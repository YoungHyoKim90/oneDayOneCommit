package M2023_11;

import java.util.Scanner;

//문제 설명 
//문자열 str과 정수 n이 주어집니다.
//str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
//제한사항
//1 ≤ str의 길이 ≤ 10
//1 ≤ n ≤ 5
//입출력 예
//입력 #1
//string 5
//출력 #1
//stringstringstringstringstring
// 분석 및 설계 -> 문자열을 입력받고, 숫자를 입력하면  n번의 반복문을 통해 해당 문자열을 입력받은 숫자만큼 출력.

public class D_1107CodingTestSolution5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner 객체를 생성
        
        String str = sc.next(); // String str변수를 선언하고 입력값 저장.
        int n = sc.nextInt(); // int n 변수를 선언하고 입력된 값 저장.
        int strLeng = str.length();
        //System.out.println(strLeng); // strLeng변수가 str.length();를 잘 받는지 확인.
        
        if(strLeng >= 1 && strLeng <= 10 && n >= 1 && n <=5 ) {
        	for(int i = 0; i < n ; i++) {
        		System.out.print(str);
        	}
        }else {
        	System.out.println("값을 잘못 입력하였습니다.");
        }
    }
}

/*

	그외 방법
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n));
    }
} 
=> repeat 은 java 11부터
str.repeat(n) => str변수를 n번 반복합니다. 이걸사용하고, length를 사용하여,
얼마나 긴 길이가 만들어졌는지도 알수 있다.
*/
