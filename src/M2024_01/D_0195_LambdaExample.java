package M2024_01;

interface Calculator {
    int calculate(int x, int y);
}

public class D_0195_LambdaExample {
    public static void main(String[] args) {
        Calculator addition = (x, y) -> x + y;
        System.out.println(addition.calculate(5, 3)); // 출력: 8
    }
}

