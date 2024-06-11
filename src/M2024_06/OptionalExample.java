package M2024_06;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Optional.of를 사용하여 값이 있는 Optional 객체 생성
        Optional<String> optionalValue = Optional.of("Hello, Optional!");

        // 값이 있는지 확인하고 값을 가져오기
        if (optionalValue.isPresent()) {
            System.out.println("Optional contains: " + optionalValue.get());
        }

        // 값이 없는 Optional 객체 생성
        Optional<String> emptyOptional = Optional.empty();

        // 값이 없는 경우 처리
        String defaultValue = emptyOptional.orElse("Default Value");
        System.out.println("Empty Optional gives: " + defaultValue);

        // 값이 있는 경우 특정 작업 수행
        optionalValue.ifPresent(value -> System.out.println("Value is present: " + value));

        // 값이 있는지 확인하고, 값이 없으면 예외 발생시키기
        try {
            String value = emptyOptional.orElseThrow(() -> new IllegalStateException("Value is not present"));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // 값 변환하기
        Optional<Integer> length = optionalValue.map(String::length);
        length.ifPresent(len -> System.out.println("Length of string: " + len));

        // 값이 없는 경우 대체 값 제공하기
        String fallbackValue = emptyOptional.orElseGet(() -> "Fallback Value");
        System.out.println("Fallback value: " + fallbackValue);

        // 값이 있는 경우 변환하고, 값이 없으면 다른 Optional 반환하기
        Optional<String> upperCaseValue = optionalValue.flatMap(value -> Optional.of(value.toUpperCase()));
        upperCaseValue.ifPresent(value -> System.out.println("Uppercase value: " + value));
    }
}

