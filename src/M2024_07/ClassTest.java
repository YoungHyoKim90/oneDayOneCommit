package M2024_07;

public class ClassTest {

	public static void main(String[] args) {

		ClassTest c1 = new ClassTest();
		System.out.println("c1 변수가 ClassTest 객체를 참조합니다.");

		ClassTest c2 = new ClassTest();
		System.out.println("c2 변수가 ClassTest 객체를 참조합니다.");
	}

}

/*
 * 클래스의 두 용도 라이브러리(API : Application Program Interface) 클래스 객체 생성 및 메소드 제공 역할 -
 * Student.java 실행 클래스 main() 메소드 제공 역할 - StudentExample.java
 */

/*
 * field - 객체의 데이터가 저장되는 곳 
 * ex ) int fieldName; 
 * Constructor - 생성자, 객체 생성 시 초기화 역활 담당 
 * ex) ClassName(){} 
 * Method - 객체의 동작에 해당하는 실행 블록 
 * void methodName(){}
 * 
 * 클래스: 객체를 만들기 위한 설계도
 * 객체 : 클래스로부터 생성되며 ‘new 클래스()’로 생성
 * new 연산자 : 객체 생성 연산자이며 생성자 호출하고 객체 생성 번지를 리턴
 * 클래스 변수 : 클래스로 선언한 변수이며 해당 클래스의 객체 번지가 저장됨
 * 인스턴스 : 객체는 클래스의 인스턴스
 * 클래스 멤버 : 클래스에 선언되는 멤버로 필드, 생성자, 메소드가 있음
 * 
 */