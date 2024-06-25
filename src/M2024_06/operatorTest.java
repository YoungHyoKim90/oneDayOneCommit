package M2024_06;

public class operatorTest {
	public static void main(String[] args) {
		// 연산자, 피연산자, 연산 방향, 연산 우선순위를 테스트
		// 프로그램에서 데이터를 처리하여 결과를 산출하는 것을 연산 이라고 한다.
		int x = 0;
		int y = 1;
		int result = 0;

		result = x + y;
		// 연산자는 + , x,y는 피연산자라고 하며 연산자와 피연산자를 사용하여 연산과정을 기술한 것을 연산식이라고 한다.

		System.out.println("result =" + result);

		// 사칙연산 및 나머지를 계산하는 산술
		// 음수와 양수의 부호를 표시하는 부호
		// 문자열을 연결하는 문자열
		// 우변의 값을 좌변의 변수에 대입하는 대입
		// 1만큼 증가하거나 감소시키는 증감
		// 값을 비교하는 비교연산자
		// 논리 부정, 논리곱, 논리합을 보여주는 논리 연산자
		// 조건식에 따라 A 또는 B 중 하나를 선택하게 하는 조건 연산자가 있다.

		// 연산식은 반드시 하나의 값을 산출하며 하나의 값이 오는 모든 자리에 연산식이 사용 가능하다.
		// 다른 연산식의 피연산자 위치에 연산식 대입이 가능하다. 예를 들어

		boolean result2 = (x + y) > 5;
		System.out.println("result2 = " + result2); // result2 = false
		System.out.println("---------------------------");
		result2 = (x + y) == 5;
		System.out.println("result2 = " + result2); // result2 = false
		System.out.println("---------------------------");
		result2 = (x + y) < 5;
		System.out.println("result2 = " + result2); // result2 = true
		System.out.println("---------------------------");
		result2 = (x + y) <= 5;
		System.out.println("result2 = " + result2); // result2 = true
		System.out.println("---------------------------");
		result2 = (x + y) >= 5;
		System.out.println("result2 = " + result2); // result2 = false

		// 복합적으로 구성된 연산식의 연산 -> 우선순위에 따라 수행됨.
		// 단항 -> 이항 -> 삼항
		// 산술 -> 비교 -> 논리 -> 대입
		// 우선쉰위가 같은 연산자는 왼쪽에서 오른쪽 방향으로 수행됨. *** 예외로 대입 연산자가 있음.

		// 우선 계산되어야 하는 내용에 대해서는 괄호를 사용해 먼저 처리할 연산식을 묶어서 사용한다.
		System.out.println("---------------------------");
		int var1 = 1;
		int var2 = 2;
		int var3 = 3;

		int result3 = var1 + var2 * var3;

		System.out.println("result3 =" + result3); // result3 =7

		result3 = 0; // 변수값 비워주기.
		result3 = (var1 + var2) * var3;
		System.out.println("result3 =" + result3); // result3 =9

		/*
		 * 연산자: 연산의 종류를 결정짓는 기호. 산술(+, -, *, /, %), 증감(++, --), 비교(==, !=, …), 논리(&&,
		 * ||, …), 대입(=, +=, -=, …) 등이 있다.
		 * 피연산자: 연산식에서 연산되는 데이터(값). 예를 들어, 연산식 3 + x에서 3과 변수 x가 피연산자이다.
		 * 연산 방향: 연산식에서 같은 종류의 연산자가 여러 개 사용될 경우 왼쪽에서 오른쪽으로 또는 오른쪽에서 왼쪽으로 연산되는 방향이 있다.
		 * 대부분의 연산자는 왼쪽에서 오른쪽으로 연산이 되지만, 증감(++, --)과 대입(=, +=, -=)은 오른쪽에서 왼쪽으로 연산된다.
		 * 연산 우선순위 : 서로 다른 연산자들이 복합적으로 구성되면 우선적으로 연산되는 연산자가 있다. 하지만 괄호 ()로 감싼 연산이 최우선순위를
		 * 갖기 때문에 복잡한 연산식에서 연산의 순서를 정하고 싶을 때에는 괄호 ()를 활용한다.
		 */
		System.out.println("---------------------------");
		int intValue = 0;
		intValue++;
		System.out.println("intValue =" + intValue);
		++intValue;
		System.out.println("intValue =" + intValue);
		// 단항 연산자, 증감연산자
		
		System.out.println("---------------------------");
		
		int sum =0;
		System.out.println((sum > 90) ? "A" : "B" );
		
		sum =100;
		System.out.println((sum > 90) ? "A" : "B" );
		
		//삼항연산자
		
		System.out.println("---------------------------");
		
		int intTest = 0;
		
		intTest = 100;
		
		int intResult = intTest ;
		
		System.out.println("intResult = " + intResult);
	
		intResult = -intTest;
		System.out.println("intResult = " + intResult);
		
	}
}
