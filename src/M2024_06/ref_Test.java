package M2024_06;

/**
 * 참조타입 테스트
 * 
 * @author PigYoung90 참조 타입 변수 간의 ==, != 연산 동일 객체를 참조하는지, 다른 객체를 참조하는지 알아볼 때 사용
 *         번지 값의 비교 == 같으면 true 다르면 false
 *         != 같으면 false 다르면 true
 */
public class ref_Test {

	public static void main(String[] args) {
		
		String refVar1 = "100";
		String refVar2 = "100";
		
		System.out.println(refVar1 == refVar2); //true
		
		refVar2 = "99";
		
		System.out.println(refVar1 == refVar2); //false
		
		//값이 같은지 확인. 반대로 보려면 !=

		
		
	}
	
}
