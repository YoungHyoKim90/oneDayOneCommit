package M2024_01;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단을 출력할 단수를 입력하세요: ");
        int maxDan = scanner.nextInt();

        printMultiplicationTable(maxDan);

        scanner.close();
    }

    public static void printMultiplicationTable(int maxDan) {
        System.out.println(maxDan + "단까지의 구구단을 출력합니다.");

        for (int i = 2; i <= maxDan; i++) {
            System.out.println(i + "단:");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // 한 줄 띄우기
        }
    }
}

