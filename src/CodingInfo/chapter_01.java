//패키지 선언 
package CodingInfo;

/**
 * alt + shift + j = 도큐먼트 주석
 * 
 * @author PigYoung90 chapter 01은 자바를 공부하기 위해 만든 연습용 클래스 입니다.
 */
public class chapter_01 {
// public - 클래스 선언부 
// class chapter_01 - 클래스 이름
// { } 클래스 블록

	public static void main(String[] args) {

// public -  메소드 선언부
// main - 메소드 이름

		System.out.println();

		int age ;
		double value;
		float fValue;
		byte A;
		
		int age1, age2, age3;
		char ABC ;
		
		// 변수 타입 + 변수 명 + ; 이런식으로 변수를 선언
		// 같은 타입을 가진 여러 변수명의 경우 타입 + 변수명,변수명,변수명 ; 이런식으로 여러개 선언이 가능함
		
		// 연산자. 사측연선이 모두 가능함. 
		
		// 변수 초기화
		
		int C = 0; // int의 초기화 값은 0
		System.out.println("C = " + C);
		System.out.println("C값에 1넣기");
		C = 1;
		System.out.println("C = " + C);
		
		//변수에 최초로 값이 저장될 때 메모리에 변수가 생성되고 이것을 변수 초기ㅘ라 하고 이 때의 값을 초기값이라고 함.
		//초기화를 하지 앚ㄶ은 변수는 메모리에서 값을 읽을 수 없음 -> 최초로 값을 저장해야 변수가 생성되기 때문에.
		
		int value2; 
		//int result = //value2 + 10; The local variable value2 may not have been initialized
		value2 = 30;
		int result = value2 + 10; 
		System.out.println("result = " + result);
		
		result = 0;
		System.out.println("result = 0 으로 값을 넣을 때 =" + result);
		
		result = value2 + 10; 
		System.out.println("result = value2 + 10 일때 = " + result);
		
		result = 5;
		
		System.out.println("result = 5일 때 " + result);
		
		
		
	}

}

/*
 * ctrl + / => 라인 주석 //
 * 
 * => 범위 주석
 * 
 *//** *//*
			 * => 도큐먼트 주석 java doc 명령어로 API 도큐먼트를 생성하는 데 사용합니다.
			 */

/*
 * 
 * 
 * java.io.PrintStream
 * 
 * 
 * A PrintStream adds functionality to another output stream,namely the ability
 * to print representations of various data valuesconveniently. Two other
 * features are provided as well. Unlike other outputstreams, a PrintStream
 * never throws an IOException; instead, exceptional situations merely set
 * aninternal flag that can be tested via the checkError method.Optionally, a
 * PrintStream can be created so as to flushautomatically; this means that the
 * flush method isautomatically invoked after a byte array is written, one of
 * the println methods is invoked, or a newline character or byte('\n') is
 * written.
 * 
 * All characters printed by a PrintStream are converted intobytes using the
 * platform's default character encoding. The PrintWriter class should be used
 * in situations that require writingcharacters rather than bytes.
 * Since:JDK1.0Author:Frank YellinMark Reinhold
 * 
 */