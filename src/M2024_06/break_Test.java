package M2024_06;

/**
 * break문
 * 
 * @author PigYoung90 for, while, do-while, switch문의 실행을 중지할 때 사용 주로 if문과 함께 사용
 * 
 */
public class break_Test {

	public static void main(String[] args) {
		int a = 0;
		int sum = 0;
		boolean booleanValue = true;

		for (int i = 0; i < 10; i++) {
			sum++;
			System.out.println(sum);
			break; // break문이 있는 경우 반복하지 않고 반복문을 빠져나옴.
		}
		System.out.println("끝");

		sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += 1;
			System.out.print(sum); // break문이 없는 경우 반복문의 조건을 모두 달성하고 실행 종료
		}
		System.out.println();
		System.out.println("끝");
		sum = 0;
		System.out.println("----------무한반복의시작----------");

		while (booleanValue) {
			if (sum < 100) {
				for (int i = 0; i < 10; i++) {
					sum += 1;
					System.out.print(sum); // break문이 없는 경우 반복문의 조건을 모두 달성하고 실행 종료
					if (sum < 99 && sum != 10 && sum != 20 && sum != 30 && sum != 40 && sum != 50 && sum != 60
							&& sum != 70 && sum != 80 && sum != 90 && sum != 100) {
						System.out.print(",");
					} // 쉼표 추가용!

					/* 더 간결하게 만든 코드~
					 * if (sum < 99 && sum % 10 != 0) { System.out.print(","); }
					 */

				} // for 블록 끝
				System.out.println("----------1~10까지를 더한다.----------");
				// sum =0;

			} // if 블록 끝
			else {
				booleanValue = false;
			} // else블록
		} // while 블록 끝
		System.out.println("----------드디어풀려나왔어.----------");
		
		sum = 0;
		booleanValue = true;
		
		System.out.println("챗놈이 만든 코드");
        while (booleanValue) {
            if (sum < 100) {
                for (int i = 0; i < 10; i++) {
                    sum += 1;
                    System.out.print(sum);
                    if (sum < 100 && sum % 10 != 0) {
                        System.out.print(",");
                    }
                }
                System.out.println("----------1~10까지를 더한다.----------");
            } else {
                booleanValue = false;
            }
        }
        System.out.println("----------드디어풀려나왔어.----------");
	}// main블록 끝
}// class블록 끝
