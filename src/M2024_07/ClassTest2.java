package M2024_07;

/**
 * 필드 선언, 필드 사용
 * 
 * @author PigYoung90 필드는 객체의 고유 데이터, 부품 객체, 상태 정보를 저장 필드를 선언하고 생성한 뒤 이를 읽고 변경하는
 *         방법을 학습
 * 
 */
public class ClassTest2 {
	/*
	 * 필드 (field) 객체의 고유 데이터, 객체가 가져야 할 부품, 객체의 현재 상태 데이터 등을 저장
	 * 
	 * 필드 선언 클래스 중괄호 블록 어디서든 존재 가능 생성자와 메소드 중괄호 블록 내부에는 선언 불가 변수와 선언 형태 유사하나 변수 아님에
	 * 주의
	 */

	class hundai {
		String company = "현대자동차";
		String model = "그랜저";
		int maxSpeed = 300;
		int productionYear;
		int currentSpeed;
		boolean engineStart;

		// 초기값은 주어질 수도, 생략할 수도 있음
		// 초기값 지정되지 않은 필드는 객체 생성 시 자동으로 기본 초기값 설정

	}

}
