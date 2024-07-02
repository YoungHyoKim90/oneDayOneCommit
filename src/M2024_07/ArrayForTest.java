package M2024_07;

public class ArrayForTest {
	// 향상된 for문
	/*
	 * 배열이나 컬렉션을 좀 더 쉽게 처리 반복 실행 위해 루프 카운터 변수나 증감식 사용하지 않음
	 */
	public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
        	//타입변수 : 배열
            for (int[] row : matrix) {
                for (int element : row) { //element든 i든 상관없다능
                    System.out.print(element + " ");
                }
                System.out.println(); // 띄어쓰기용 
            }

		/*
		 * 배열: 같은 타입의 데이터를 연속된 공간에 나열하고, 각 데이터에 인덱스 부여한 자료구조
		 * 인덱스: 0부터 시작해 0~(배열길이 -1)까지 범위 가짐
		 * 배열 선언 : 타입[] 변수; 형태로 선언.
		 * 배열 생성 : { 값1, 값2, 값3, … }과 같이 값 목록으로 생성하거나, new 타입[길이];로 생성
		 * 배열 길이 : 배열에 저장될 수 있는 항목의 수. 배열변수.length
		 * 다차원 배열 : 타입[][] 변수 = new타입[길이1][길이2]; 로 생성.
		 * 향상된 for문 : for(타입 변수 : 배열) {…}.
		 */
	}

}
