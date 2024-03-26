package M2023_10;

import java.util.Scanner;
/*
Recursion


개요
재귀는 수학이나 컴퓨터 과학 등에서 자신을 정의할 때 자기 자신을 재참조하는 방법을 뜻한다. 주로 이 방법은 함수에 적용한 재귀 함수(Recursion Function)의 형태로 많이 사용된다.


예시문제
주어진 수의 Factorial 값을 구해 아래와 같이 출력하시오. 주어지는 수는 1 이상 20 이하의 수이다.
*/

public class D_1025RecursionFunction {

	static long factorial(int num) {
		int count =1;
		if (num == 0) {
			count++;
			System.out.println("factorial if문 실행중 입니다.");
			System.out.println(count + "번 실행되었습니다.");
			return 1;
		} else {
			count ++ ;
			System.out.println("factorial else문 실행중입니다.");
			System.out.println(count + "번 실행되었습니다.");
			return num * factorial(num - 1);
		}
	}

	public static void main(String arg[]) throws Exception {
		int count =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Scanner실행되었습니다. 원하는 T의 숫자를 입력해 주세요.");
		int T = sc.nextInt();
		System.out.println(T+"를 입력받았습니다.");

		for (int test_case = 1; test_case <= T; ++test_case) {
			count ++;
			System.out.println("main의 for문이  " + count + "번 실행되었습니다.");
			System.out.println("num값을 입력해주세요.");
			int num = sc.nextInt();
			System.out.println(num + "을 입력받았습니다.");
			System.out.println("-------------------");
			System.out.println("num 값은 : " + num + " T 값은 : " + T);
			long value = factorial(num);
			System.out.println("long value = factorial(" + num + "); 를 실행하였습니다.");

			System.out.println("#" + test_case + " " + num + "! = " + value);
		}
		System.out.println("해당 프로그램을 종료합니다.");
		sc.close();
	}
}
