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