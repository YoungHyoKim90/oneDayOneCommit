package M2024_01;

import java.util.Optional;

public class D_0104_OptionalExample {
    public static void main(String[] args) {
        String name = "John";
        Optional<String> optionalName = Optional.ofNullable(name);

        // 값이 존재하면 출력, 아니면 "No name" 출력
        System.out.println(optionalName.orElse("No name"));
    }
}

