package M2024_06;

public class booleanTypeTest {
	public static void main(String[] args) {
		
		//논리 연산자 boolean 타입만 사용이 가능하다. true, false
		
		int a = 10;
		int b = 20;
		int c = 30;
			

	// 이항 연산자의 종류
	/*
	 *  == 두 피연산자의 값이 같은지를 검사
	 *  != 두 피연산자의 값이 다른지를 검사
	 *   > 왼쪽의 피연자가 오른쪽 연산자보다 큰지를 검사
	 *  >= 왼쪽의 피연자가 오른쪽 연산자보다 크거나 같은지를 검사
	 *  < 왼쪽의 피연자가 오른쪽 연산자보다 작은지를 검사
	 *  <= 왼쪽의 피연자가 오른쪽 연산자보다 크거나 같은지를 검사
	 */
	
	//논리 연산자
	/*
	 * && or &  피연산자 모두가 true일 경우에만 연산 결과가 true
	 * || or | 피연산자 중 하나만 true여도 연산 결과가 true
	 * ^ 피 연산자가 하나만 true이고 다른 사나가 false일 경우에만 연산 결과가 true 트루트루 -> false 펄스펄스 ->false 
	 * ! 피연산자의 논리 값을 바꿈
	 */

	boolean trueBoolean = true;
	boolean falseBoolean = false;
	
	boolean resultBoolean ;
	
	resultBoolean = trueBoolean && falseBoolean ;
	System.out.println("resultBoolean && =" + resultBoolean);

	resultBoolean = trueBoolean || falseBoolean ;
	System.out.println("resultBoolean || =" + resultBoolean);
	
	resultBoolean = trueBoolean ^ falseBoolean ;
	System.out.println("resultBoolean ^ =" + resultBoolean);
	
	resultBoolean = !trueBoolean && !falseBoolean ;
	System.out.println("resultBoolean && =" + resultBoolean);
	
	//대입연산자 (오른쪽 피연산자의 값을 왼쪽 변수에 저장한다.
	/* 종류 :	= , += , -= , *= . /= , %= , &= , |= , ^= 
	 */
	
	System.out.println("------------------------");
	
	int value = 1;
	
	value = 10;	
	System.out.println("value에 10 넣기 = " + value );
	value = 1;
	value += 20;
	System.out.println("value에 20더하기 = " + value );
	value = 1;
	value -= 10;
	System.out.println("value에 10 빼기 = " + value );
	value = 1;
	value *= 3;
	System.out.println("value에 3 곱하기 = " + value );
	value =1;
	value /= 2;
	System.out.println("value에 2나누기 = " + value );
	
	//삼항 연산자
	/*
	 * 3개의 피연산자를 필요로 하는 연산자
	 * ? 앞의 조건식에 따라 콜론 앞뒤의 피연산자 선택
	 * 조건식 ? 값또는연산식 : 값또는연산식
	 */
	}
}
