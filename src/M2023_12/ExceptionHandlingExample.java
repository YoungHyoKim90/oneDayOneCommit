package M2023_12;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // 0으로 나누는 예외 발생
            int result = divide(10, 0);
            System.out.println("나눈 결과: " + result); // 이 부분은 실행되지 않음
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다: " + e.getMessage());
        }
    }

    public static int divide(int num1, int num2) {
        // 0으로 나누는 예외 발생
        return num1 / num2;
    }
}
