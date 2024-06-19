package CodingInfo;

public class type_study {

	public static void main(String[] args) {
		
		char var1 = 'A';
		char var2 = 'B';
		char var3 = '가';
		char var4 = '각';
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		
		int var5 = var1;
		int var6 = var2;
		int var7 = var3;
		int var8 = var4;
		
		System.out.println("var5 = " + var5);
		System.out.println("var6 = " + var6);
		System.out.println("var7 = " + var7);
		System.out.println("var8 = " + var8);
		
		//문자리터럴을  int타입에 저장할 경우 해당 문자의 유니코드가 출력된다.
		
		 char var9 = 'A';
		 char var10 = 65;
		 char var11 = '\u0041';
		 
		System.out.println("var9 = " + var9);
		System.out.println("var10 = " + var10);
		System.out.println("var11 = " + var11);
		
		// char 타입의 경우 2,10, 16 진수가 모두 저장되며 각 숫자에 따른 해당된 문자가 출력된다.
		
		// char var12 ='가자'; -> 문자 타입의 경우 두글자 이상은 컴파일 에러가 나온다.
		
		// 작은 따옴표(')로 깜싼 문자는 char타입 변수에 저장되어 유니코드로 저장되지만, 큰 따옴표(")로 감싼 문자 또는 여러 개의 문자들은 유니코드로 변환되지 않는다.
		
		// 자바에서 큰 따옴표(")는 문자열로 문자,문자열 리터럴을 구별하는 기호로 사용되고, 문자열을 변수에 저장하고 싶다면 String 타입을 사용해야 한다.
		
		String var12 ="가자";
		
		System.out.println("var12 = "+ var12);
	}
	
}
