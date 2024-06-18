package CodingInfo;

public class VariableScopeExample { 
	int a = 25; // 멤버 변수 
	public void f1() { 
		int a = 10; // f1 지역 
		System.out.println(a);
	} 
	public void f2() { 
		int a = 15; // f2 지역 
		System.out.println(a); 
	} 
	public static void main(String[] args) { 
		VariableScopeExample sc1 = new VariableScopeExample(); 
		sc1.f1(); // f1 지역변수 a 
		sc1.f2(); // f2 지역변수 a 
		int a = 20; 
		System.out.println(a); // main 함수 지역변수 a 
		System.out.println(sc1.a); // 멤버 변수 a 
	} 
}

