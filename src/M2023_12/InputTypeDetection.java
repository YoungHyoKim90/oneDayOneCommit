package M2023_12;

public class InputTypeDetection {
    public static void main(String[] args) {
        String input = "Your input here"; // 분석할 입력값

        if (isEnglish(input)) {
            System.out.println("입력된 값은 영어입니다.");
        } else if (isNumeric(input)) {
            System.out.println("입력된 값은 숫자입니다.");
        } else {
            System.out.println("입력된 값은 영어나 숫자가 혼합된 문자열입니다.");
        }
    }

    // 입력된 값이 영어 문자열인지 확인
    public static boolean isEnglish(String input) {
        return input.matches("[a-zA-Z]+");
    }

    // 입력된 값이 숫자인지 확인
    public static boolean isNumeric(String input) {
        return input.matches("\\d+");
    }
}
