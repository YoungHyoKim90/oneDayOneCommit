package M2023_12;

public class FactorialExample {
    public static void main(String[] args) {
        int number = 5; // 팩토리얼을 계산할 숫자

        long factorial = calculateFactorial(number);
        System.out.println(number + "의 팩토리얼: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // 0 또는 1의 팩토리얼은 1
        } else {
            return n * calculateFactorial(n - 1); // 재귀 호출을 통한 팩토리얼 계산
        }
    }
}

