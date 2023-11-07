package M2023_11;

import java.util.Scanner;

/*
문제
문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
제한사항
1 ≤ str의 길이 ≤ 1,000,000
str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
입력값
입력 #1 HelloWorld!
출력값
출력 #1 HelloWorld!
분석 -> 입력된 타입 String 출력된 타입 String 그대로 출력되면 됨. 제한사항적용할것.
*/
public class D_1107CodingTestSolution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //import java.util.Scanner에서 가져온  Scanner 객체를 생성 (방을 만들었다!-> 이제 사용이 가능해.)
        String a = sc.next();
        //String 타입의 a 함수를 선언하고, sc.next();을 이용하여 한 단어 또는 문자를 입력받는다.
        
        //제한사항 적용하기 
        int validation = a.length();
        //정수 int타입의 validation 을 선언하고. a. length();함수를 사용. length()는 문자열의 길이를 알고자 할때 사용한다.
        
        if(validation >= 1 && validation <= 1000000 && !a.contains(" ")) { 
        	// a변수의 문자열의 길이가 1보다 크고, 1000000보다 작을때 그리고 a가 공백이지 않을경우 true값으로 {}안의 코드를 실행 
        	System.out.println(a);
        	//a매개변수를 콘솔에 출력한다.
        	sc.close();
        	//종료.
        }else { //if의 값이 false일 경우 실행
        	System.out.println("입력받는 값이 범위를 벗어났습니다."); // 오류 설명.
        	System.out.println("종료합니다."); //종료 안내
        	sc.close();
        	//종료.
        }
    }
}

/*
	next()
		공백을 기준으로 한 단어 또는 한 문자씩 입력받는다.
		버퍼에 입력된 문자나 문자열에서 공백 전까지의 단어를 읽는다.
		개행 문자를 가져오지 않는다.
		
	nextLine()
		문자 또는 엔터를 치기 전까지의 문장 전체를 입력받는다.
		버퍼에 입력된 문자열을 개행 문자까지 다 가져온다.
		
	자바 표준 입출력 클래스 System.out.println();
		사용자가 프로그램과 대화하기 위해서는 사용자와 프로그램 사이의 입출력을 담당하는 수단이 필요합니다.
		자바에서는 모든 것이 객체로 표현되므로, 입출력을 담당하는 수단 또한 모두 객체입니다.
		
*/

/*
	1. length
		 - arrays(int[], double[], String[])
		 - length는 배열의 길이를 알고자 할때 사용된다.
	
	2. length()
		 - String related Object(String, StringBuilder etc)
		 - length()는 문자열의 길이를 알고자 할때 사용된다.
	
	3. size()
		 - Collection Object(ArrayList, Set etc)
		 - size()는 컬렉션프레임워크 타입의 길이를 알고자 할때 사용된다.

*/

/*
	contains()
		- boolean contains(CharSequence s)
		- contains() 함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수이다.
		- 대/소문자를 구분한다.
 */
 
/*

	그외 참조할 코드
	 System.out.println(a.replaceAll(" ", "")); 공백이 있을경우 없애줌...
	 =>replace()
	- String replace(CharSequence target, CharSequence replacement)
	- replace() 함수는 대상 문자열을 원하는 문자 값으로 변환하는 함수이다.
	- 첫번째 매개변수는 변환하고자 하는 대상이 될 문자열
	- 두번째 매개변수는 변환할 문자 값
	
	replaceAll()
	- String replaceAll(String regex, String replacement)
	- replaceAll() 함수는 대상 문자열을 원하는 문자 값으로 변환하는 함수이다.
	- 첫번째 매개변수는 변환하고자 하는 대상이 될 문자열
	- 두번째 매개변수는 변환할 문자 값
	
	replaceFirst()
	- 추가적으로 이게 있는데 사용법은 위와 전부 같으나
	- First라는 것을 보고 알 수 있듯이 처음 나오는 단어를 찾아서 바꿔주는 함수이다.
	
	차이점 
	=>인자 값의 형태를 보면 CharSequence와 String 이라는 차이점을 볼 수 있습니다.
	 
	 System.out.print(new Scanner(System.in).nextLine()); //입력받은 값을 그대로 내보내는 코드 하지만 이렇게하면, 그저 복붙.
	 
	 while(sc.hasNext()) {
     System.out.print(sc.next());
        }
	hasNext()는 boolean 타입으로 반환됩니다
	next()는 매개변수 혹은 iterator 되는 타입으로 반환됩니다. 즉 아무 타입으로나 반환됩니다.
 */

