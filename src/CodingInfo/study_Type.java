package CodingInfo;

public class study_Type {

	public static void main(String[] args) {

		/*
		 * : 자동 타입 변환, 강제 타입 변환, 문자열 결합 연산, Integer.parseInt( ), Double.parseDouble( )
		 * 타입 변환이란 데이터 타입을 다른 데이터 타입으로 변환하는 것을 말한다. byte 타입 -> int 타입, int 타입 -> byte
		 * 타입, double 타입 -> int 타입 String 타입 -> int 타입
		 * 
		 */

		byte a = 10;
		int b = a;
		System.out.println("a = " + a); // a = 10
		System.out.println("b = " + b); // a = 10

		/*
		 * 자동 타입 변환 promotion 값의 허용 범위가 작은 타입이 큰타입으로 저장될 경우 자동 타입변환이 일어 난다. 큰 허용 타입 = 작은
		 * 허용 범위 타임 <--------- 자동 타입 변환 byte < short < int < long < float < double
		 */

		byte byteValue = 10;
		short shortValue = byteValue;
		System.out.println(shortValue); // 10
		int intValue = shortValue;
		System.out.println(intValue); // 10
		long longValue = intValue;
		System.out.println(longValue); // 10
		float floatValue = longValue;
		System.out.println(floatValue); // 10.0
		double doubleValue = floatValue;
		System.out.println(doubleValue); // 10.0

		byte overByteValue = (byte) 130;

		System.out.println(overByteValue); // -126
		overByteValue = (byte) 128;
		System.out.println(overByteValue); // -128
		overByteValue = (byte) 127;
		System.out.println(overByteValue); // 127
		// 한계를 넘어가면 마이너스 부호로 바뀜.
		overByteValue = (byte) 255;
		System.out.println(overByteValue); // -1
		overByteValue = (byte) 256;
		System.out.println(overByteValue); // 0
		overByteValue = (byte) 257;
		System.out.println(overByteValue); // 1
		overByteValue = (byte) -129;
		System.out.println(overByteValue); // 127

		System.out.println("-------------------------");

		char charValue = 'A';
		intValue = charValue;
		System.out.println("intValue= " + intValue);
		charValue = (char) intValue;
		System.out.println("charValue= " + charValue);

		// 강제 타입 변환 (casting) 큰 허용 범위 타입을 작은 범위 타입으로 강제로 나우어 한 조각만 저장
		// 캐스팅 연산자 괄호 () 를 사용하여 괄호 안이 나누는 단위이다.

		// 연산자 + - * / %
		// 피 연산자 중 하나가 long타입이면 다른 피연산자는 long타입으로 자동 변환된다. -> 다른 타입 연산이 필요할 경우 먼저 강제 변환
		// 혹은 자동 변환되어 계산된다.
		System.out.println("-------------------------");
		float floatValue2 = 0;
		double doubleValue2 = 0;

		floatValue2 = 1.1F;
		doubleValue2 = 0.5;

		float floatResult = (float) (floatValue2 + doubleValue2);
		System.out.println("floaValue2 = " + floatValue2); // floaValue2 = 1.1
		System.out.println("doubleValue2 = " + doubleValue2); // doubleValue2 = 0.5
		System.out.println("floatResult = " + floatResult); // floatResult = 1.6

		double doubleResult2 = floatValue2 + doubleValue2;
		System.out.println("floaValue2 = " + floatValue2); // floaValue2 = 1.1
		System.out.println("doubleValue2 = " + doubleValue2); // doubleValue2 = 0.5
		System.out.println("doubleResult2 = " + doubleResult2); // doubleResult2 = 1.600000023841858

		/*
		 * Math.round(), Math.ceil(), Math.floor() 
		 * Math.round() : 반올림
		 * Math.ceil() : 올림
		 * Math.floor() : 버림
		 */

		System.out.println("doubleResult2 = " + Math.floor(doubleResult2)); //doubleResult2 = 1.0
		System.out.println("doubleResult2 10곱하고 나누기 = " + Math.floor(doubleResult2*10)/10);
		System.out.println("doubleResult2 100곱하고 나누기 = " + Math.floor(doubleResult2*100)/100);
		System.out.println("doubleResult2 10나누고 곱하기 = " + Math.floor(doubleResult2/10)*10);
		System.out.println("doubleResult2 100나누고 곱하기 = " + Math.floor(doubleResult2/100)*100);
	}

}
