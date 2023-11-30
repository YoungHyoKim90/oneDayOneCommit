package M2023_11;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // 2x3 크기의 2차원 배열 생성
        int[][] matrix = new int[2][3];

        // 값 할당
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        // 배열 내용 출력
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
