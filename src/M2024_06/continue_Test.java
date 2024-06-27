package M2024_06;

/**
 * continue문
 * 
 * @author PigYoung90 for, while, do-while문에서만 사용 for문의 증감식이나 while, do-while문의
 *         조건식으로 이동 주로 if문과 함께 사용
 */
public class continue_Test {

	public static void main(String[] args) {
		int intValue = 0;
		int sum = 0;
		boolean TFValue = true;
		System.out.println("-----------------------------");
		for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;  // 현재 반복 주기의 나머지 부분을 건너뜁니다.
            }
            System.out.print(i+ " ");  // 짝수인 경우에만 출력됩니다.
        } //2 4 6 8 10 
		System.out.println();
		System.out.println("-----------------------------");
		sum = 0;
        while ( sum <= 10) {
            if (sum % 3 == 0) {
                sum++;
                continue;  // 현재 반복 주기의 나머지 부분을 건너뜁니다.
            }
            System.out.print(sum + " ");
            sum++;
        } //1 2 4 5 7 8 10 
        System.out.println();
		System.out.println("-----------------------------");
		sum = 0;
        do {
            if (sum == 5) {
                sum++;
                continue;  // 현재 반복 주기의 나머지 부분을 건너뜁니다.
            }
            System.out.print(sum + " "); //0 1 2 3 4 6 7 8 9 10 
            sum++;
        } while (sum <= 10); 
	} // method block end
} // class block end


/*
 * for문: for( 초기화식; 조건식; 증감식; ) ~ 을 말하며 지정한 횟수만큼만 반복할 때 주로 사용
 * while문: while( 조건식; ) ~ 을 말하며 조건식이 true가 될 때까지 반복 실행
 * do-while문 : do ~ while( 조건식); 을 말하며 while문과 동일하나 조건식이 뒤에 있음
 * break문 : for문, while문, do-while문의 반복을 종료할 때 사용
 * continue문 : for문, while문, do-while문의 증감식 또는 조건식으로 돌아감
 */