package M2023_11;

import java.util.Scanner;
//해당내용에 각 과정에서 yes or no의 선택지를 선택하는 if문 혹은 case문 해보기.
public class D_1115TestCoding2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("텍스트를 입력해주세요.");

		String input = sc.next();

		System.out.println(input + "를 입력하셨습니다.");

		System.out.println("Scanner 기능을 종료할까요?");
		boolean answer = true ; //yes 인경우 true no인 경우 false로 사용하자.
		String yNanswer = sc.next();
		if(yNanswer.equals("y")) { // 해당 질문이 들어온 경우 else로 system.exit로 끝내는게 오히려 쉽지 않나? 아무키나 입력하라고 하고.
			
			System.out.println("Scanner 기능을 종료합니다.");
			
			sc.close();
			
			System.out.println("Scanner 기능이 종료되었습니다.");
		}else { // 입력한 값이 "y"가 아닌 경우
			System.out.println("텍스트를 입력해주세요.");
			
			input = sc.next();

			System.out.println(input + "를 입력하셨습니다.");

			System.out.println("Scanner 기능을 종료할까요?");
		}
		

		System.out.println("프로그램을 종료합니다.");

		System.exit(0);

	}
}
