package M2024_06;

/**
 * null, NullPointException
 * 
 * @author PigYoung90 기본 타입, 참조 타입, 메모리 사용 영역, 번지 비교 기본 타입 (primitive type) 정수,
 *         실수, 문자, 논리 리터럴 저장
 *         참조 타입 (reference type) 객체(object)의 번지를 참조하는 타입 배열, 열거, 클래스, 인터페이스
 * 
 */
public class null_test {

	//기본타입엔 정수, 실수, 논리 타입이 있다.
	// 참조타입엔 배열타입, 열거타입, 클래스, 인터페이스가 있다.
	
	public static void main(String[] args) {
	
		//기본타입은 힙영역에서 참조하여 스택영역에서 사용된다. -> 즉 주소가 있다. 
		//기본타입변수
		int age = 25;
		double price = 100;
		
		//참조타입
		String name = "자바";
		String hobby = "독서";
		
		System.out.println(age);
		System.out.println(price);
		System.out.println(name);
		System.out.println(hobby);
		
	}
}
