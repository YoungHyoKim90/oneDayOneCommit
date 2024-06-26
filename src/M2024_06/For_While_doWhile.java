package M2024_06;

import java.util.Scanner;

/**
 * for문, while문, do-while문, break문, continue문
 * 
 * @author PigYoung90 반복문에는 for문, while문, do-while문 있다. 반복문은 제어문 처음으로 되돌아가 반복
 *         실행하는데 이것을 루핑(looping)이라고 한다. for문, while문, do-while문 for문은 반복 횟수 알고
 *         있을 때 주로 사용 while문은 조건에 따라 반복할 때 주로 사용 do-while문은 while 문과 유사하나 조건을
 *         나중에 검사
 * 
 */
public class For_While_doWhile {

	/*
	 * 구성 
	 *  for ( 1. 초기화식; 2조건식; 3증감식) {
	 *  4실행문 ( 조건식이 true일 경우)
	 *  }
	 *  1 -> 2 -> 4 -> 3 -> 2 이런식
	 *  
	 *  while( 1. 조건식) {
	 *  2. 실행문
	 *  }
	 *  1 -> 2 -> 1 -> 2 이런식
	 */
	
	public static void main(String[] args) {
		
		//for문은 주어진 횟수만큼 반복하고 싶을 경우 사용한다. 예를 들어
		int sum =0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("1~5의 합 =" + sum);
		// 해당 내용으로 1~5까지 더한 값이 sum의 최종값이 된다. 이를 for문으로 만들면
		sum = 0;
		int count = 1;
		int sumORG= sum;
		for (int i =1; i<6; i++) {
			System.out.println(count + "번째 계산"); // 몇번 돌아가는 알기 위해 작성
			System.out.println(sum+"에 "+i+"를 더했습니다.");
			sum = sum + i;
			count++;
		}
		System.out.println(sumORG+"부터 " + (count-1) + "까지의 합은 " + sum +"입니다.");
		
		System.out.println("---------------------------------------");
		
		//다시 응용 scanner로 데이터값 받아서 해보기.
		
		System.out.println("합계를 계산해주는 코드입니다. 숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int inputValue = scan.nextInt() ;
		
		System.out.println("입력하신 숫자는 " + inputValue  + "입니다.");
		
		sum = 0;
		count = 1;
		sumORG= sum;
		for (int i =1; i<(inputValue+1); i++) {
			System.out.println(count + "번째 계산"); // 몇번 돌아가는 알기 위해 작성
			System.out.println(sum+"에 "+i+"를 더했습니다.");
			sum = sum + i;
			count++;
		}
		System.out.println(sumORG+"부터 " + (count-1) + "까지의 합은 " + sum +"입니다.");
	}
	
}
