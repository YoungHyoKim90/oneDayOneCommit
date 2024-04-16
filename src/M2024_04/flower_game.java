package M2024_04;

import java.util.Random;

/*
	[오징어게임]
	
	[무궁화 꽃이 피었습니다]
	doll 은 인형이고 , arr 은 오징어 게임 참가자들 이다. 	
	[1] 게임은 10회 반복된다. 
	[2] doll 매턴 마다 3~5를 랜덤으로 저장한다.
	[3] arr 은 랜덤으로 1~4를 저장한다. 
	[4] 매턴마다 doll 보다 큰숫자가 나온 참가자는 움직인것으로 간주되어 탈락된다.
	[5] 10회 까지 살아남은 참가자의 번호를 출력하시오.
	[6] 1등의 번호를 출력하시오.
	
	
 */
class Flower_Game {
	Random ran = new Random();

	int arr[] = new int[10];
	boolean check[] = new boolean[10];
	int survivor[] = new int[10];
	int doll;
	int cnt = 0;
	int win = 0;

	void flower_Winner() {
		int max = 0;
		for (int i = 0; i < check.length; i++) {
			if (check[i] == false) {
				if (max < survivor[i]) {
					max = survivor[i];
					win = i;
				}
			}
		}
		System.out.println(win + "번 참가자 우승!");
	}

	void flower_Check() {
		for (int i = 0; i < check.length; i++) {
			if (check[i] == false) {
				System.out.println(i + "번 생존!" + survivor[i]);
			}
		}
	}

	void flower_Start() {
		doll = ran.nextInt(3) + 3;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(4) + 1;
			if (check[i] == false) {
				if (doll < arr[i]) {
					check[i] = true;
					System.out.println(i + "번 탈락!");
				} else {
					survivor[i] += arr[i];
				}
			}
		}
	}

	void run() {
		while (cnt < 10) {
			System.out.println("--------------------");
			System.out.println(cnt + 1 + ")회 ");
			System.out.println("무궁화꽃이 피었습니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			flower_Start();
			System.out.println("번호:" + doll);
			cnt++;
		}
		flower_Check(); // 생존자
		System.out.println("---------------------");
		flower_Winner();
	}
}

public class flower_game {
	public static void main(String[] args) {

		Flower_Game go = new Flower_Game();
		go.run();
	}
}
