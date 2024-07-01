package M2024_07;

/**
 * 배열, 인덱스, 배열 길이, 배열 선언, 배열 생성, 다차원 배열, 향상된 for문
 * 
 * @author PigYoung90 많은 양의 데이터를 적은 코드로 처리하는 배열에 대해 알아본다.
 */
public class ArrayTest {
// 연습 학생 30명의 성적을 저장하고 평균값을 구하려면?

	/*
	 * 배열 데이터를 연속된 공간에 나열하고 각 데이터에 인덱스(Index) 부여한 자료구조 같은 타입의 데이터만 저장할 수 있음 한 번 생성된
	 * 배열은 길이를 늘리거나 줄일 수 없음
	 */
	public static void main(String[] args) {
		int sum = 0;

		// 배열 변수 선언 | 타입[] 변수 = null;
		int[] score = null;

		// 배열 생성 값 목록으로 배열 생성
		// score =
		// {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		// ㄴ 컴파일 에러.

		score = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30 };

		// new 연산자로 배열 생성
		// 타입[] 변수 = new 타입[길이]
		// new 연산자로 배열 처음 생성할 때 배열은 자동적으로 기본값으로 초기화됨
		int[] scores = new int[30];

		// for문을 이용한 배열 처리

		for (int i = 0; i < 30; i++) {
			sum += score[i];
			System.out.println("sum = " + sum);
			System.out.println("score = " + score);
			System.out.println("scores + " + scores);
			 /* sum = 1 
			 * score = [I@15db9742 
			 * scores + [I@6d06d69c */
			System.out.println("score["+i+"] = " + score[i]);
			// score[0] = 1 
			
			System.out.println("scores["+i+"] = " + scores[i]);
			//scores[0] = 0 -> 넣어둔 값이 없어 0... 
		} // for문 블록 end ***index -> score [i] 이걸 인덱스라고 하며 0부터 시작된다.
		int avg = sum / 30;
		
		
		//2차원 배열
		int[][] score2 = new int[2][3];
		System.out.println("score2의 길이 = " + score2.length);
				
		
	}
}
