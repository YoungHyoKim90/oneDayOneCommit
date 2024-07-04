package M2024_07;

public class ClassTest {

	
	public static void main(String[] args) {
		
		
		ClassTest c1 = new ClassTest();
		System.out.println("c1 변수가 ClassTest 객체를 참조합니다.");
		
		
		ClassTest c2 = new ClassTest();
		System.out.println("c2 변수가 ClassTest 객체를 참조합니다.");
	}
	
}

/* 클래스의 두 용도
라이브러리(API : Application Program Interface) 클래스
객체 생성 및 메소드 제공 역할  - Student.java
실행 클래스
 main() 메소드 제공 역할 - StudentExample.java
*/

/*
	field - 객체의 데이터가 저장되는 곳
	ex ) int fieldName;
	Constructor - 생성자, 객체 생성 시 초기화 역활 담당
	ex) ClassName(){}
	Method - 객체의 동작에 해당하는 실행 블록
	void methodName(){}
*/