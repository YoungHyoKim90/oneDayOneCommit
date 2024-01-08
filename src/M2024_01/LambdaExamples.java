package M2024_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExamples {
    public static void main(String[] args) {
        // Runnable 인터페이스를 사용한 스레드 실행
        Thread myThread = new Thread(() -> {
            System.out.println("This is executed in a separate thread");
        });
        myThread.start();

        // Comparator를 사용한 정렬
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Collections.sort(names, (String a, String b) -> a.compareTo(b));
        System.out.println("Sorted names: " + names);

        // forEach를 사용한 리스트 순회
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach((Integer value) -> System.out.println(value));

        // Predicate를 사용한 조건부 필터링
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript");
        Predicate<String> startsWithJ = (str) -> str.startsWith("J");
        languages.stream().filter(startsWithJ).forEach(System.out::println);

        // Function을 사용한 변환
        Function<String, Integer> stringLength = (str) -> str.length();
        int length = stringLength.apply("Hello, Lambda!");
        System.out.println("Length: " + length);
    }
}
