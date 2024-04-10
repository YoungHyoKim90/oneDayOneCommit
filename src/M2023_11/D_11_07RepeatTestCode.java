package M2023_11;

import java.util.Scanner;

public class D_11_07RepeatTestCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner 객체 생성
		
		System.out.println("문자 혹은 문장을 입력해 주세요.");
		String str = sc.next();
		System.out.println("복사할 횟수를 입력해 주세요.");
		int num = sc.nextInt();
		
		//반복문을 통해 입력받은 문자 혹은 문장을 반복 출력
		for(int i = 0 ; i < num ; i++) {
			System.out.println("for문을 통한 반복 실행" + (i+1) + "번째");
			System.out.println(str);
			sc.close();
		}
//	System.out.println(str.repeat(num)); 자바 11버전부터 사용이 가능... 까비	
	}

}
