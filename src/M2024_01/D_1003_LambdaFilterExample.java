package M2024_01;

import java.util.Arrays;
import java.util.List;

public class D_1003_LambdaFilterExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");

        // 길이가 4보다 작은 요소 필터링하여 출력
        languages.stream()
                .filter(lang -> lang.length() < 4)
                .forEach(System.out::println);
        // 출력: Java C++
    }
}
