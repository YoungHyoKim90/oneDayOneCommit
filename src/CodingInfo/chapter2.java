package CodingInfo;

/**
 * @author PigYoung90
 * 혼공자바 연습해본것.
 */
public class chapter2 {

	public static void main(String[] args) {
		
		int x = 10; // 정수 타입의 int,  변수명 x 를 선언하고 10의 값으로 초기화
		
		int y = x; // 정수 타입 int , 변수명  x 선언 x로 초기화
		
		System.out.println("x =" + x + ", y =" + y);
		
		// 출력된 값을 보고 알 수 있듯,  int y = x ; 에서 x의 값인 10이 y의 값에 저장됨.
		// 이것을 보고 몇개의 의문점 및 테스트가 가능한다
		
		//1. 다른 타입의 값이 정수 값일 때도 가능한가?
		
		double z = 10;
		
		//y = z ; -- z에 컴파일 에러가 출력됨 
		//Type mismatch: cannot convert from double to int
		
		//2. 먼저 들어가 있던 정수가 있다면 어떻게 되는가?
		
		y= 0;
		System.out.println(" y= 0; ");
		System.out.println("x =" + x + ", y =" + y);
		y= 30;
		System.out.println(" y= 30; ");
		System.out.println("x =" + x + ", y =" + y);
		y = x;
		System.out.println(" y = x; ");
		System.out.println("x =" + x + ", y =" + y);
		
		// 연산 부호가 = 인경우에는 무조건 새로운 값으로 치환된다.
	}
	
}

/*
 * 로컬 변수 ( Local Variable)
 * 메소드 블록 내에서 선언된 변수를 로컬 변수라고 한다. 
 * main 안에 있는 변수이며, 메소드 블록 내에서 실행되고, 실행이 끝나면 변수는 자동으로 삭제가 된다.
 * { } 중괄호 안에서의 생명주기가 있음. 이것은 조건절(if, case), 반복문(for,while)과 같은 문장에서도 동일하다.
 * 변수를 사용하는 생명주기가 존재함으로써 코드를 작성할 때 변수를 해당 블록의 최상단에 위치시켜, 변수가 어떤 범위에서 사용될 것인지를 고려해야 한다.
 * 그리고 특정 블록 내부에서만 사용하려는 경우 해당 블록 내에서만 사용하되, 외부의 변수명과 차별을 두어야 한다.
 * 변수 주의사항
 * 항상 어떤 범위에서 사용될 것인지를 고려하여 선언 위치를 결정할 것 -> 어떤 위치에 까지 영향을 미치는지
 * 블록 및 선언부의 영향 (메모리형성, 할당? 고심할 것.)
 */
