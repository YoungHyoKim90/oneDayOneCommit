package M2024_01;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int number = 10;

        // 3항 연산자를 사용하여 변수 result에 값을 할당
        String result = (number % 2 == 0) ? "짝수" : "홀수";

        // 결과 출력
        System.out.println("숫자 " + number + "은(는) " + result + "입니다.");
    }
}
