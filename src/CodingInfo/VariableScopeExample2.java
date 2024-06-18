package CodingInfo;

public class VariableScopeExample2 {

	public int e1;//멤버변수
	private char[] a;

	public static void main(String[] args) { 
		VariableScopeExample2 sc1 = new VariableScopeExample2(); 
		sc1.e1=10; // 			
		int a = 20; 
		System.out.println(sc1.e1); // 멤버 변수
		System.out.println(sc1.a); // 지역 변수 a 
	}
	
	// 변수의 타입
	/*
	 * 정수타입 byte, char, short, int, long
	 * 실수타입 float, double
	 * 논리타입 boolean
	 * 
	 */
} 
