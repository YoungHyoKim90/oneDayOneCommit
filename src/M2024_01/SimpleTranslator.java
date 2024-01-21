package M2024_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleTranslator {
    private Map<String, String> translationMap;

    public SimpleTranslator() {
        translationMap = new HashMap<>();
        // 간단한 영어 - 한국어 번역을 위한 맵 설정
        translationMap.put("hello", "안녕하세요");
        translationMap.put("world", "세계");
        translationMap.put("translate", "번역");
    }

    // 번역 메서드
    public String translate(String input) {
        // 입력된 단어가 맵에 있는지 확인하고 번역 반환
        return translationMap.getOrDefault(input.toLowerCase(), "번역할 수 없는 단어입니다.");
    }

    public static void main(String[] args) {
        SimpleTranslator translator = new SimpleTranslator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("간단한 자동 번역기를 시작합니다.");

        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료하려면 'exit' 입력): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 번역 결과 출력
            String translation = translator.translate(input);
            System.out.println("번역 결과: " + translation);
        }

        scanner.close();
    }
}

