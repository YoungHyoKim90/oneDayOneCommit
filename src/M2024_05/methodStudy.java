package M2024_05;

public class methodStudy {
private void syso() {
	// TODO Auto-generated method stub

}
}

/*
 * 메서드 (Method) 메서드는 클래스(Class)의 내부에 존재하는 영역으로, 특정 기능을 하는 코드를 묶어서 나타내는 것이다. 즉,
 * 특정 기능을 수행하기 위한 코드들의 집합체이다. 특정 기능을 수행한다는 것은 데이터를 입력받아 해당 데이터를 일련의 처리 과정을 통해
 * 만들어진 결괏값을 반환하는 것을 의미한다. // 클래스(Class) public class Main { // 메서드(Method)
 * public static void main(String[] args){ // 특정 기능을 구현하는 곳 } }   함수와 메서드 메서드는
 * 다른 언어(C, C++)의 함수 개념과 매우 비슷하다. 이 둘의 차이점은 함수는 특정 기능을 수행하는 코드들을 묶은 것이고, 메서드는
 * 클래스 내에 포함되어 있는 함수라고 이해할 수 있다. 종종 자바 언어를 개발하면서 함수라고도 많이 하는데, 자바는 객체지향 언어이며 모든
 * 코드를 클래스 내에 작성하기 때문에 메서드라는 용어를 사용하여 구분 짓는 것이 좋다.   메서드 정의 메서드는 다음과 같은 형태로 정의할
 * 수 있다. public static void main(String[] args) {
 * 
 * } public static은 클래스와 연관된 부분으로 조금 더 쪼개서 살펴보면 다음과 같다. /* 반환타입 메서드이름(매개변수타입
 * 매개변수이름) { 메서드 바디 }
 * 
 * void main(String[] args) { // 내용 }
 * 
 * 
 * 
 * 반환 타입
 * 
 * 메서드는 처리 결괏값을 반환한다. 처리 결과는 값의 형태로 된 데이터를 뜻하며, 이 데이터가 반환 값이다. 값은 여러 종류로 나뉜 데이터로
 * 정수, 문자,boolean,… 등 다양하다. 이러한 값의 종류를 데이터
 * 
 * 타입(Data Type)이라 하며, 자료형이라고도 한다. 따라서 반환 타입은 메서드가 반환할 값의 종류를 의미하며, 메서드를 정의할 때
 * 반환할 값의 타입을 명시해야 한다. void의 경우 없음을 뜻하여 반환 값이 없다는 것을 의미한다.
 * 
 *   매개변수 타입과 매개변수 이름
 * 
 * 메서드는 데이터를 입력받아 해당 데이터를 일련의 처리 과정을 통해 결괏값을 반환한다. 즉, 메서드 외부에서 메서드 내부로 전달하는 입력
 * 값이 존재한다. 이를 매개변수라 한다. 값(데이터)은 변수를 통해 저장할 수 있다. 이를 메서드의 매개변수로 지정함으로 메서드 내부에서
 * 사용할 수 있게 해 준다. 매개변수는 메서드 외부와 내부를 매개해주는 변수라는 의미이다. 메서드 이름 옆에 소괄호’()’를 통해 매개변수의
 * 타입과 이름을 공백으로 구분하여 지정한다. 매개변수의 타입은 어떤 데이터 타입을 메서드가 입력받아 사용할 것인지를 지정하는 곳이다.
 * 매개변수 이름은 입력받은 값에 이름을 붙여 메서드 내부에서 이름을 통해 사용한다.
 * 
 *   메서드 바디
 * 
 * 메서드가 구체적으로 어떤 기능을 수행할지에 대한 코드를 작성하는 부분이다. return 키워드를 사용해 처리 결과를 반환할 수 있다.
 * 
 *  
 * 
 * 메서드 예시(두 정수의 합)
 * 
 * int add(int num1, int num2) { return num1 + num2; }
 * 
 * 
 * 반환타입 메서드이름(매개변수타입 매개변수이름) { 메서드 바디 } 메서드 반환 타입 int: 메서드 바디에서 return시 반환되는 값의
 * 타입이 정수형이다.  메서드 이름 add: 메서드 이름을 정의한 것으로, 더한다는 의미의 add로 지정한다.( 메서드의 이름은 뜻이 있는
 * 단어로 지정하는 것이 일반적이다.)  매개변수 타입 int: 매개 변수의
 * 
 * 타입은 정수형(int)으로 정수로 된 숫자를 입력받는다.   매개변수 이름 num1, num2 : 매개변수의 이름을 정의한 것으로
 * 숫자(number)의 의미로 num1과 num2를 지정한다. (메서드 매개변수는 콤마(,)를 사용하여 여러 개의 매개변수를 지정할 수
 * 있다.)     메서드 호출 메서드는 정의하는 것만으로 실행되지 않는다. 메서드를 정의하는 것은 단순히 동작에 대한 처리 과정을 기술한
 * 것이다. 따라서 메서드를 직접 사용하기 위해 다음과 같은 방법으로 호출해야 한다. /* 메서드이름(값1, 값2, ...)
 * 
 * 
 * method(value1, value2, ...);   따라서 앞서 예시로 정의한 add 메서드를 사용하기 위해서는 다음과 같이 작성할 수
 * 있다. add(5, 10); 메서드 add의 매개변수는 2개로 지정하여 작성했기 때문에, 호출할 때에도 2개의 값을 지정해 주어야 한다.
 * 5와 10을 넣음으로써 num1에는 5, num2에는 10이라는 정수 값이 임시적으로 저장된 후, 5 + 10 연산이 수행되어 반환 값이
 * 15인 데이터를 리턴한다.  
 * 
 * 
 * 메인 메서드 (main method) 처음에 메서드를 소개할 때 나타낸 코드이다. 이를 메인
 * 
 * 메서드(Main Method)라 한다. 앞서 메서드의 설명한 내용으로 대략적인 main 메서드의 구조를 파악할 수 있게 되었다.
 * 
 * public static void main(String[] args) {
 * 
 * }
 * 
 * void:
 * 
 * 반환 타입으로 메인 메서드는 반환을 하지 않는다.main: 메서드의 이름이 main이다.String[]: 매개변수의 타입이 String[]
 * 타입이다.args: args라는 이름의 매개변수이다.
 * 
 * main 메서드는 자바로 작성한 소스 코드 파일을 실행하면 가장 먼저 실행되는 메서드이다. 따라서 자바로 만들어진 어플리케이션이나
 * 프로그램을 실행하면 main 메서드의 코드부터 호출되어 기능을 동작하는 것이다.이를 진입점 함수라 한다.즉, 자바의 메인 메서드는 진입점
 * 함수로 자바로 프로그래밍할 때 반드시 메인 메서드가 필요하다.출처:https:// ittrue.tistory.com/97 [IT is
 * True:티스토리]
 * 
 */