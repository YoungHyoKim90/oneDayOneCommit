package M2024_07;

/**
 * 생성자 테스트
 * 
 * @author PigYoung90
 *
 */
public class korean {

	// 필드
	String nation = "대한민국";
	String name;
	String ssn;

	// 생성자

	public korean(String n, String s) {
		name = n;
		ssn = s;
		korean k1 = new korean("박씨", "11111");
		korean k2 = new korean("김씨", "22222");

		/* 필드 초기화
		 * 매개 변수 이름은 필드 이름과 유사하거나 동일한 것 사용 권장 필드와 매개 변수 이름 완전히 동일할 경우 this.필드로 표현
		 */
		this.name=name; //this.필드 = 매개변수;
		
		this.ssn = ssn; // this.필드 = 매개변수;
	}
	
}
