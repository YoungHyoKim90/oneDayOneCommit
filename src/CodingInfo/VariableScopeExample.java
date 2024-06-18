package CodingInfo;

public class VariableScopeExample { 
	String a = "멤버변수"; // 멤버 변수 
	
	public void f1() { 
		String a = "1지역"; // f1 지역
		System.out.println("1지역내부");
		System.out.println(a);
	} 
	public void f2() { 
		String a = "2지역"; // f2 지역 
		System.out.println("2지역내부");
		System.out.println(a); 
	} 
	public static void main(String[] args) { 
		VariableScopeExample sc1 = new VariableScopeExample(); 
		sc1.f1(); // f1 지역변수 a 
		sc1.f2(); // f2 지역변수 a 
		String a = "메소드블록 내부"; 
		System.out.println(a); // main 함수 지역변수 a 
		System.out.println(sc1.a); // 멤버 변수 a 
	} 
}

//변수의 유효범위 (지역변수)
