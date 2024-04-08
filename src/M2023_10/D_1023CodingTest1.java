package M2023_10;

import java.util.Scanner;

public class D_1023CodingTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해주세요.");
		
		try {
			String str = sc.next();
			int n = sc.nextInt();
			System.out.println("입력받은 값은 = " + str + "입니다." );
			if(str.length() <= 10 && str != null && str != "") {
				for(int i=0; i < str.length(); i++) {
					System.out.println((i+ 1) + "번째 문자는" + str.charAt(i) + "입니다.");
				}
			System.out.println("끝");
			
		} 
		}catch (Exception e) {
			System.out.println("숫자를 입력해 주세요.");
			
		}
		sc.close();
	}
	
}
