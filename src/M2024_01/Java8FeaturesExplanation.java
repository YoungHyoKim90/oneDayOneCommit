package M2024_01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8FeaturesExplanation {
    public static void main(String[] args) {
        // 람다 표현식
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                                        .map(x -> x * x)
                                        .collect(Collectors.toList());
        System.out.println("람다 표현식을 사용한 제곱 결과: " + squares);

        // 함수형 인터페이스와 메소드 레퍼런스
        GreetingService greetingService = message -> System.out.println("안녕하세요, " + message);
        greetingService.sayMessage("Java 8");

        // Stream API
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "Ruby");
        long count = languages.stream()
                                .filter(lang -> lang.length() > 4)
                                .count();
        System.out.println("길이가 4 이상인 언어 수: " + count);

        // Optional 클래스
        String nullString = null;
        String notNullString = "Hello";
        // null 체크 후 안전하게 처리
        System.out.println("Null 문자열: " + Optional.ofNullable(nullString).orElse("Null 문자열입니다."));
        System.out.println("Not Null 문자열: " + Optional.ofNullable(notNullString).orElse("Null 문자열입니다."));
    }

    // 함수형 인터페이스
    interface GreetingService {
        void sayMessage(String message);
    }
}

