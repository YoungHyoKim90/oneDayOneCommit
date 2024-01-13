package M2024_01;

import java.util.Scanner;

public class SimpleJavaCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = addNumbers(num1, num2);
        System.out.println("Sum: " + sum);

        int product = multiplyNumbers(num1, num2);
        System.out.println("Product: " + product);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }
}
