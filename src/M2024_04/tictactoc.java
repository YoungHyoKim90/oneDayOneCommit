package M2024_04;

import java.util.Random;
import java.util.Scanner;

public class tictactoc {
	/*
	 * [틱택토]
	 * 
	 * 조건1) 구글 크롬에 "틱택토" 검색후 게임을 한번하고 아래와같이 만들어보기. 조건2) P1 , P2 를 플레이어가 번갈아가면서 플레이.
	 * 조건3) 먼저 한줄을 완성하면 승리 [추천조건] P2 는 com으로 대체해보자.(com은 랜덤으로 플레이)
	 *
	 * ============= [처음화면] 0,0,0 0,0,0 0,0,0 [p1]인덱스 입력 : 6 ============= [1턴]
	 * 0,0,0 0,0,0 1,0,0 [p2]인덱스 입력 : 1 ============= [2턴] 0,2,0 0,0,0 1,0,0 [p1]인덱스
	 * 입력 : 3 ============= [3턴] 0,2,0 1,0,0 1,0,0 [p2]인덱스 입력 : 2 ============= [4턴]
	 * 0,2,2 1,0,0 1,0,0 [p1]인덱스 입력 : 0 ============= [5턴] 1,2,2 1,0,0 1,0,0 [p1] 승리
	 * 대각선 0,4,8 / 오른쪽 대각선 2,4,6
	 */
	static boolean check(int tic[], int p) {
		int x = 0, y = 0, l = 0, r = 0, cnt = 0;
		for (int i = 0, j = 0; i < tic.length; i++) {
			if (tic[i] == p) { // 가로 체크
				x++;
			}
			if (tic[j + cnt] == p) { // 세로 체크
				j += 3;
				y++;
			}
			if (x == 3 || y == 3 || l == 3 || r == 3) {
				return true;
			}
			if (i % 3 == 2) {
				if (tic[cnt * 3 + cnt] == p)
					l++; // 왼쪽대각선 0,4,8 체크
				x = 0;
				y = 0;
				j = 0;
				cnt++;
				if (tic[cnt * 3 - cnt] == p)
					r++; // 오른쪽대각선 2,4,6 체크
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int tic[] = new int[9];
		int turn = 0, p = -1, index = 0;

		while (true) {
			System.out.printf("[%d턴]\n", turn);
			for (int i = 0; i < tic.length; i++) {
				System.out.printf("|%d|", tic[i]);
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			if (check(tic, p) == true) {
				System.out.println(p + "님 승리!");
				break;
			}
			if (turn == tic.length) {
				System.out.println("[무승부]");
				break;
			}
			p = turn % 2 + 1;
			System.out.printf("[p%d] 인덱스입력:", p);
			if (p == 1) {
				index = scan.nextInt();
				if (index < 0 || index >= tic.length || tic[index] != 0) {
					System.out.println("다시입력하세요.");
					continue;
				}
				tic[index] = p;
			} else {
				while (true) {
					index = ran.nextInt(tic.length);
					if (tic[index] == 0) {
						break;
					}
				}
				tic[index] = p;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(index);
			turn++;
		}
	}
}
