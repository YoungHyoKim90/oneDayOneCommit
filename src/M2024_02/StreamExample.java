package M2024_02;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 기존 방식
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }

        // 스트림 API 사용
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
}
