package M2023_12;

public class MethodExample {
    public static void main(String[] args) {
        // 메서드 호출
        greetUser("Alice");
        greetUser("Bob");

        int result = addNumbers(5, 3);
        System.out.println("두 수의 합: " + result);
    }

    // 매개변수가 있는 메서드
    static void greetUser(String name) {
        System.out.println("안녕하세요, " + name + "님!");
    }

    // 반환값이 있는 메서드
    static int addNumbers(int a, int b) {
        return a + b;
    }
}
