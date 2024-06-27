package M2024_06;

/**
 * null, NullPointException
 * 
 * @author PigYoung90 기본 타입, 참조 타입, 메모리 사용 영역, 번지 비교 기본 타입 (primitive type) 정수,
 *         실수, 문자, 논리 리터럴 저장 참조 타입 (reference type) 객체(object)의 번지를 참조하는 타입 배열,
 *         열거, 클래스, 인터페이스
 * 
 */
public class null_test {

	// 기본타입엔 정수, 실수, 논리 타입이 있다.
	// 참조타입엔 배열타입, 열거타입, 클래스, 인터페이스가 있다.

	public static void main(String[] args) {

		// 기본타입은 힙영역에서 참조하여 스택영역에서 사용된다. -> 즉 주소가 있다.
		// 기본타입변수
		int age = 25;
		double price = 100;

		// 참조타입
		String name = "자바";
		String hobby = "독서";

		System.out.println(age);
		System.out.println(price);
		System.out.println(name);
		System.out.println(hobby);

		// 메모리 사용 영역 (Runtime Data Area)
		/*
		 * 메소드 영역 (Method Area) -클래스별로 정적 필드(static field), 상수(constant),
		 * 생성자(constructor) 메소드(method) 코드 등을 분류해 저장 힙 영역 (Heap Area) -객체와 배열이 생성되는 영역
		 * JVM 스택 영역 -메소드가 호출되면 프레임이 추가되고, -메소드 종료되면 프레임이 제거됨
		 */
		
		// JVM 스택 영역
		/*
		 * 메소드를 호출할 때마다 프레임이 추가되고, 메소드가 종료되면 해당 프레임이 제거
		 */
		char v1 = 'A'; //1
		
		if (v1 == 'A') { //2
			int v2 = 100;
			double v3 = 3.14;
		}
		boolean v4 = true; //3
		
		// -> 1의 프레임이 생성 및 실행 v1 A
		// -> 2의 프레임이 생성 및 실행 v3 3.14 | v2 100 | v1 A
		// -> 3의 프레임이 생성 및 실행 v4 true | v1 A
		// 메소드가 종료되면 해당 프레임이 제거된다.
		
		//참조 타입 변수는 스택 영역에 힙 영역에 생성된 객체의 주소 가짐
		int[] scores = {10, 20, 30};
		//스택영역에서 scores | 번지 --참조--> 힙영역 10 | 20 | 30
		System.out.println(scores); //[I@15db9742 -> 주소가 출력된다.
		// 즉 참조된 내용들은 모두 일반적으로 출력될때 주소가 출력되고 해당 값을 보여주려면 다른 방법으로 출력을 해야한다. 
		
	}
}
