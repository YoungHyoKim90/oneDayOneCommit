package M2024_01;
import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("제곱근을 계산할 숫자를 입력하세요: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("음수의 제곱근은 계산할 수 없습니다.");
        } else {
            double squareRoot = calculateSquareRoot(number);
            System.out.println(number + "의 제곱근은 " + squareRoot + "입니다.");
        }

        scanner.close();
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }
}
