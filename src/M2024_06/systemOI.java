package M2024_06;

import java.util.Scanner;

public class systemOI {

	public static void main(String[] args) {
		
		String strValue = "가나다라마";
		
		System.out.println("strValue = " + strValue);
		// 시스템의 표준 출력 장치로 출력(모니터)
		System.out.print("strValue = " + strValue);
		
		System.out.printf("형식: %s", "prinln, print, printf");
		// 개발자가 원하는 형식화된 문자열을 출력한다. 전체 출력 자리수 및 소수 자릿수는 제한된다.
		// conversion에는 제공되는 값의 타입에 따라 d(정수), f(실수), s(문자열)을 입력하여 사용한다.
		System.out.println();
		System.out.printf("이름 : %6s, 나이 : %6d, 학점 : %6f" , "김예시" , 25 , 3.3);
		
		System.out.println();
		System.out.println("원하는 값을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		//시스템의 표준 입력 장치(키보드)에서 읽음
		String inputData = scan.nextLine();
		System.out.println("-----------------");
		System.out.println("입력한 값은 " + inputData + "입니다.");
		scan.close();
		System.out.println("종료합니다.");
		
	}
	
}
