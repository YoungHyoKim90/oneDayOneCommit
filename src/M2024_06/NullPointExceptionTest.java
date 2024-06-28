package M2024_06;

/**
 * 예외 (Exception) 프로그램 실행 도중 발생하는 오류
 * 
 * @author PigYoung90 
 * 			NullPointException 참조 타입 변수가 null 상태에서 존재하지 않는 객체의 데이터나
 *         	메소드 사용할 경우 발생 해당 참조 변수가 객체를 참조하도록 수정하여 해결
 */
public class NullPointExceptionTest {

	public static void main(String[] args) {
		int []	intArray = null;
		intArray[0] = 10; //NullPointException
		
		String str = null;
		System.out.println("총 문자수:" + str.length()); //NullPointException
		
	}
}
