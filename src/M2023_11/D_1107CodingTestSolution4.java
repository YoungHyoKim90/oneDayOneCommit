package M2023_11;
import java.util.Scanner;

//문제 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.

//제한사항 -100,000 ≤ a, b ≤ 100,000

//입출력 예 
//입력 #1 4 5
//출력 #1 a = 4 b = 5

//분석 및 설계 : 두번의 입력을 받아 출력함. 단 출력형식이 a= , b=이 추가됨. 제한사항이 있음.
//			제한사항이 -100,000에서 100,000까지임.

public class D_1107CodingTestSolution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>= -100000 && a<= 100000 && b>= -100000 && b<=100000) { //a와 b가 제한사항에 맞을경우.
        	System.out.println("a = " + Integer.toString(a)); //integer.toString() 숫자를 문자로 변환
        	System.out.println("b = " + String.valueOf(b)); // String.valueOf() 숫자를 문자로 변환
        	sc.close();//종료
        }else {
        	System.out.println("입력한 값의 범위가 -100000 ~ 100000 사이의 값을 입력해 주시기 바랍니다.");
        	sc.close();//종료
        }
    }
}

/*
	숫자를 문자로 변경하는 형 변환 방법
	Integer.toString();
	
	String.valueOf();
	
	차이점 만약 입력된 문자열이 Null이라면 두 함수의 대응점이 다릅니다.
	String.valueOf()는 우선 "null"이라는 문자열로 처리합니다. 
	하지만 Integer.toString()은 "Null PointerException"
	이라는 오류를 발생시킵니다. 만약 null 조차도 오류가 아닌 문자열로 처리해야 한다면
	String.valueOf()를 그 외라면 Integer.toString()을 사용하면 됩니다.
	
*/

/*
	String.format
	
	리턴되는 문자열의 형태를 지정하는 메소드
	서식 문자열의 앞에 %를 붙여 문자열에 사용하면 그 위치에 변수의 값을 형식화 하여 대입 가능하다.
	대문자나 소문자를 지정할 수 있는 서식 문자열에서 대문자 지정시 대문자로 변환된 값이 표시된다.
	(String.toUpperCase() 메소드를 호출한 결과와 동일)
	%d (10진수 형식)
	%s (문자열 형식)
	%f (실수형 형식)
	Locale 설정
	%t (날짜시간 형식)
	%c (유니코드 문자 형식)
	%o, %x(8진수, 16진수 형식)
	
	포맷 지정 서식
	다음은 format에 지정할 수 있는 주요 서식을 나타낸 표이다. % 문자와 함께 조합하여 사용한다.

	📊 [표1] 숫자 / 문자 변환
	서식	분류	설명
	'b', 'B'	참 거짓	boolean 값 지정
	'h', 'H'	16진수	16진수 지정
	's', 'S'	문자열	문자열 지정
	'c', 'C'	문자	문자 지정
	'd'	정수	10진 정수로 표시
	'o'	정수	8진 정수로 표시
	'x', 'X'	정수	16진 정수로 표시
	'e', 'E'	부동 소수점	10진수(가수와 진수)로 표시
	'f'	부동 소수점	10진수로 표시
	'g', 'G'	부동 소수점	10진수(반올림)로 표시
	'a', 'A'	부동 소수점	16진수(가수와 진수)로 표시
	't', 'T'	날짜, 시간	날짜 및 시간 서식 문자 앞에 지정
	ex) %tH, %tM, %tS, ...
	'%'	퍼센트	퍼센트 표시
	'n'	줄 구분	개행문자 표시
	
	📊 [표2] 날짜 / 시간 변환
	서식	분류	설명
	'H'	시간	24시간 형식의 시(00-23)
	'I'
	(아이)	시간	12시간 형식의 시(01-12)
	'k'	시간	24시간 형식의 시(0-23)
	'l'
	(엘)	시간	12시간 형식의 시(1-12)
	'M'	시간	분(00-59)
	'S'	시간	분초(00-60)
	'L'	시간	밀리초(000-999)
	'N'	시간	나노초(000000000-999999999)
	'z'	시간	UTC 오프셋.
	출력은 "+HHMM" 또는 "-HHMM" 형식의 문자열.
	여기서 +는 GMT 동쪽, -는 GMT 서쪽을 의미.
	HH는 GMT에서 시간 수를, MM은 GMT에서의 분 수를 나타냄.
	'Z'	시간	시간대명
	's'	시간	1970년 1월 1일 시작 이후 초(00:00:00)
	'Q'	시간	1970년 1월 1일 시작 이후 밀리초(00:00:00)
	'B'	날짜	국가 고유의 전체 월명
	ex) January, Februry, ...
	'b', 'h'	날짜	국가 고유의 축약 월명
	ex) Jan, Feb, ...
	'A'	날짜	국가 고유의 전체 요일명
	ex) Sunday, Monday, ...
	'a'	날짜	국가 고유의 축약 요일명
	ex) Sun, Mon, ...
	'C'	날짜	세기 수(00-99)
	연도를 100으로 나누고 정수로 자름.
	'Y'	날짜	년(4자리), 음수 가능
	'y'	날짜	년(2자리, 00-99)
	'j'	날짜	연도의 일(001-366)
	'm'	날짜	월(01-12)
	'd'	날짜	월의 일(01-31)
	'e'	날짜	월의 일(1-31)
	'R'	날짜/시간	초가 없는 24시간 형식(%H:%M과 동일)
	'T'	날짜/시간	초가 있는 24시간 형식(%H:%M:%S와 동일)
	'r'	날짜/시간	국가 고유의 AM/PM 형식 시간.
	국가 고유의 시간 형식을 사용할 수 없는 경우,
	디폴트는 POSIX 시간 AM/PM 형식(%I:%M:%S %p)
	'D'	날짜/시간	날짜 형식(%m/%d/%y와 동일)
	'F'	날짜/시간	ISO 날짜 형식(%Y-%m-%d와 동일)
	'c'	날짜/시간	국가 고유 형식의 날짜/시간
	ex) %ta %tb %td %tT %tZ %tY
	→ Sun Jul 20 16:17:00 EDT 1969
*/

/*

	그외의 코드
	1.
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;
	
	public class Main {
	    public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0; i < 2; i++) {
	            sb.append((char)('a' + i)).append(" = ").append(st.nextToken()).append("\n");
	        }
	        System.out.print(sb);
	    }
	}
	
	2.
	import java.util.Scanner;

	public class Solution {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	
	        StringBuilder sb = new StringBuilder();
	
	        sb.append("a").append(" = ").append(a).append("\n");
	        sb.append("b").append(" = ").append(b);
	
	        System.out.println(sb.toString());
	    }
	}

*/