package M2023_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String email = "example@email.com"; // 이메일 주소 입력

        // 이메일 주소를 검증할 정규표현식
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("유효한 이메일 주소입니다.");
        } else {
            System.out.println("유효하지 않은 이메일 주소입니다.");
        }
    }
}

