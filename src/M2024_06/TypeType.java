package M2024_06;

public class TypeType {

	public static void main(String[] args) {
		//기본 타입의 값 비교와 문자열 비교
		int x = 5;
		boolean result = (x == 5);
		boolean result2 = (x == 4);
		
		System.out.println("result = "+ result); //result = true
		System.out.println("result2 = "+ result2); //result2 = false
		
		//기본 타입의 값 비교는 ==를 사용한다.
		
		//문자열 비교 equals()메소드 사용
		
		String str1 = "java";
		
		boolean result3 = str1.equals("java");
		boolean result4 = str1.equals("java2");
		//str1에 저장된 문자열을 equals("비교할문자열")과 비교 같으면 true, 다르면 false를 출력
		
		System.out.println("result3 = "+ result3); //result3 = true
		System.out.println("result4 = "+ result4); //result4 = false
	}
	
}
