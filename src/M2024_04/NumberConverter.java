package M2024_04;

import java.util.Scanner;

public class NumberConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 10진수 숫자 입력받기
        System.out.print("10진수 숫자를 입력하세요: ");
        int decimalNumber = scanner.nextInt();

        // 10진수를 2진수로 변환하여 출력
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("2진수: " + binaryNumber);

        // 10진수를 16진수로 변환하여 출력
        String hexNumber = Integer.toHexString(decimalNumber);
        System.out.println("16진수: " + hexNumber);

        scanner.close();
    }
}

