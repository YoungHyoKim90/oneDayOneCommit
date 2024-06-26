package M2024_06;

/**
 * if문, if-else문, if-else if-else문, switch문
 * 
 * @author PigYoung90 자바 프로그램은 main( ) 메소드의 시작 중괄호 {에서 끝 중괄호 }까지 위에서부터아래로 실행하는
 *         흐름을 가지고 있다. 이러한 실행 흐름을 개발자가 원하는 방향으로 바꿀 수 있도록 해주는 것을 흐름 제어문 혹은 제어문이라고
 *         한다. 제어문의 종류에는 조건문과 반복문이 있다. 조건문 조건식에 따라 다른 실행문을 실행하기 위해 사용 if문 : 조건식
 *         결과의 true. false 여부에 따라 실행문 결정 switch문 : 변수의 값에 따라 실행문 결정
 * 
 */
public class IfElseSwichTest {

	public static void main(String[] args) {
		// if문 구조

		boolean trueValue = true;
		boolean falseValue = false;

		if (trueValue) {
			System.out.println("trueValue = " + trueValue + "일 떄, if 조건문 1 단계");
		}
		System.out.println("trueValue = " + trueValue + " 일 때, if 조건문 2 단계");

		System.out.println("------------------------------");

		if (falseValue) {
			System.out.println("falseValue = " + falseValue + "일 떄, if 조건문 1 단계");
		}
		System.out.println("falseValue = " + falseValue + " 일 때, if 조건문 2 단계");

		System.out.println("------------------------------");

		if (trueValue) {
			System.out.println("trueValue = " + trueValue + "일 떄, if_else 조건문 1 단계");
		} else {
			System.out.println("trueValue = " + trueValue + " 일 때, if_else 조건문 2 단계");
		}

		System.out.println("------------------------------");

		if (falseValue) {
			System.out.println("falseValue = " + falseValue + "일 떄, if_else 조건문 1 단계");
		} else {
			System.out.println("falseValue = " + falseValue + " 일 때, if_else 조건문 2 단계");
		}

		System.out.println("------------------------------");

		int intValueOne = 1;
		int intValueTwo = 2;
		int intValueThree = 3;

		System.out.println("intValueOne------------------------------");
		switch (intValueOne) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");

		default:
			System.out.println("1,2,3 이외의 값입니다.");
			break;
		}
		System.out.println("intValueTwo------------------------------");
		switch (intValueTwo) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");

		default:
			System.out.println("1,2,3 이외의 값입니다.");
			break;
		}
		System.out.println("intValueThree------------------------------");
		switch (intValueThree) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;

		default:
			System.out.println("1,2,3 이외의 값입니다.");
			break;
		}

		System.out.println("intValueThree------------------------------ break 명령어가 없는 경우");
		switch (intValueThree) {
		case 1:
			System.out.println("1입니다.");
		case 2:
			System.out.println("2입니다.");

		case 3:
			System.out.println("3입니다.");
		default:
			System.out.println("1,2,3 이외의 값입니다.");
		} // break; 가 없으면 그냥 default의 내용을 실행시킴.
		System.out.println("끝");

		/*
		 * If문: if( 조건식 ) { … }을 말하며 조건식이 true가 되면 중괄호 내부를 실행
		 * If-else문: if( 조건식 ) { … } else { … }를 말하며 조건식이 true가 되면 if 중괄호 내부를 실 행하고,
		 * false가 되면 else 중괄호 내부를 실행
		 * if-else if-else문: if( 조건식1 ) { … } else if( 조건식2 ) { … } else { … }를 말하며 조건식1
		 * 이 true가 되면 if 중괄호 내부를 실행하고, 조건식2가 true가 되면 else if 중괄호 내부를 실 행한다. 조건식1과 조건식2가
		 * 모두 false가 되면 else 중괄호 내부가 실행된다.
		 * switch문 : switch( 변수 ) { case 값1: … case 값2: … default: … }를 말하며 변수의 값이 값1이면
		 * 첫 번째 case 코드를 실행하고, 값2이면 두 번째 case 코드를 실행한다. 값1과 값2가 모두 아니면 default 코드를 실행한다.
		 */
	}
}
