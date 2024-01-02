package M2024_01;

public class D_0103LambdaThreadExample {
    public static void main(String[] args) {
        // 람다식을 이용한 스레드 실행
        new Thread(() -> System.out.println("스레드 실행됨")).start();
        // 출력: 스레드 실행됨
    }
}

