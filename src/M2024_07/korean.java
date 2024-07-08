package M2024_07;

/**
 * 생성자 테스트
 * @author PigYoung90
 *
 */
public class korean {

	//필드
	String nation ="대한민국";
	String name;
	String ssn;

	//생성자
	
	public korean(String n, String s) {
		name = n;
		ssn = s;
		korean k1 = new korean("박씨","11111");
		korean k2 = new korean("김씨","22222");
	}
}
