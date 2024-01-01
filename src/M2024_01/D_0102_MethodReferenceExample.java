package M2024_01;

import java.util.Arrays;
import java.util.List;

public class D_0102_MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 정적 메소드 레퍼런스
        names.forEach(System.out::println);

        // 인스턴스 메소드 레퍼런스
        names.forEach(String::toUpperCase);
    }
}

