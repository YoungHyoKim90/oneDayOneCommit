package M2024_01;

interface Greeting {
    void sayHello();

    // 디폴트 메소드
    default void sayDefaultHello() {
        System.out.println("Default Hello!");
    }
}

public class D_0102_DefaultMethodExample implements Greeting {
    public void sayHello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        D_0102_DefaultMethodExample example = new D_0102_DefaultMethodExample();
        example.sayHello(); // "Hello!" 출력
        example.sayDefaultHello(); // "Default Hello!" 출력
    }
}
