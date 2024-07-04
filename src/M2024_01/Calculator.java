package M2024_01;

public class Calculator {
    // 두 정수를 더하는 메서드
    public static int add(int a, int b) {
        return a + b;
    }

    // 두 정수를 곱하는 메서드
    public int multiply(int a, int b) {
        return a * b;
    }

    // 메인 메서드에서 사용 예시
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 덧셈 결과 출력
        int sumResult = calculator.add(5, 10);
        System.out.println("덧셈 결과: " + sumResult);

        // 곱셈 결과 출력
        int multiplyResult = calculator.multiply(3, 7);
        System.out.println("곱셈 결과: " + multiplyResult);
    }
}
