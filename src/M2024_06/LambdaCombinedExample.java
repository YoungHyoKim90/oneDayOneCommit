package M2024_06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 사용자 정의 함수형 인터페이스
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class LambdaCombinedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");

        // 1. 리스트의 각 요소를 출력
        System.out.println("Original list:");
        names.forEach(name -> System.out.println(name));

        // 2. 이름이 "A"로 시작하는 요소만 필터링
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .collect(Collectors.toList());
        System.out.println("\nFiltered list (names starting with 'A'):");
        filteredNames.forEach(System.out::println);

        // 3. 모든 이름을 대문자로 변환
        List<String> upperCaseNames = names.stream()
                                           .map(name -> name.toUpperCase())
                                           .collect(Collectors.toList());
        System.out.println("\nUppercase list:");
        upperCaseNames.forEach(System.out::println);

        // 4. 이름을 알파벳 순으로 정렬
        List<String> sortedNames = names.stream()
                                        .sorted((name1, name2) -> name1.compareTo(name2))
                                        .collect(Collectors.toList());
        System.out.println("\nSorted list:");
        sortedNames.forEach(System.out::println);

        // 5. 사용자 정의 함수형 인터페이스를 사용하여 인사 메시지 출력
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
        System.out.println("\nGreeting messages:");
        names.forEach(greeting::sayHello);
    }
}
