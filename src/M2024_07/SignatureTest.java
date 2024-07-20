package M2024_07;

/**
 * 선언부, void, 매개 변수, 리턴문, 호출, 오버로딩
 * 
 * @author PigYoung90 메소드 선언부 (signature) 리턴 타입 : 메소드가 리턴하는 결과의 타입 표시 메소드 이름 :
 *         메소드의 기능 드러나도록 식별자 규칙에 맞게 이름 지음 매개 변수 선언 : 메소드 실행할 때 필요한 데이터 받기 위한 변수
 *         선언 메소드 실행 블록 : 실행할 코드 작성
 * 
 */
public class SignatureTest {

	/*
	 * 
	 * 리턴타입 메소드이름 *([매개변수선언,...]){ 실행 코드 작성 } *** 리턴타입을 통하여 메소드가 리턴하는 결과타입을 표시한다. 리턴
	 * 타입 메소드를 실행한 후의 결과값의 타입 리턴값 없을 수도 있음 리턴값 있는 경우 리턴 타입이 선언부에 명시
	 * 
	 * *** 매개 변수 선언 : 메소드가 실행할 대 필요한 데이터를 받기 위한 변수이다.
	 * 
	 */
	void powerOn() {
	};

	double divide(int x, int y) {

		return y; // --리턴값 존재 여부에 따라 메소드 호출 방법 다름

		
	};

	/*
	 * 메소드 이름 숫자로 시작하면 안 되고, $와 _ 제와한 특수문자 사용 불가 메소드 이름은 관례적으로 소문자로 작성 서로 다른 단어가 혼합된
	 * 이름일 경우 뒤이어 오는 단어의 첫 글자를 대문자로 작성
	 * 
	 */
	// ex
	void run() {
		// TODO Auto-generated method stub
	}

	void startEngine() {
		// TODO Auto-generated method stub
	}

	void getName() {
		// TODO Auto-generated method stub
	}

	int[] getScores() {
		return null;
	}
	// 매개 변수 선언
	// 메소드 실행에 필요한 데이터를 외부에서 받아 저장할 목적
	//매개 변수의 개수를 모를 경우
	//매개 변수를 배열 타입으로 선언
	int sum1(int[] values) {
		return 0;
		};
		
	void method1(String p1, int p2) {
		//실행
		System.out.println("void method1 이 실행됨");
	}
	void method2() {
		System.out.println("void method2가 실행됨");
		method1("홍길동",100);
	}
}
