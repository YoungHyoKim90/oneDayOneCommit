package M2023_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D_1006{
    public static void main(String[] args) {
        String memberId = "MyId123!"; // 여기에 아이디를 입력하세요

        if (isValidMemberId(memberId)) {
            System.out.println("유효한 아이디입니다.");
        } else {
            System.out.println("유효하지 않은 아이디입니다.");
        }
    }

    public static boolean isValidMemberId(String memberId) {
        // 아이디 길이가 5에서 20 사이인지 확인
        if (memberId.length() < 5 || memberId.length() > 20) {
            return false;
        }

        // 영어 대소문자, 숫자, 특수문자만 포함되는지 확인
        String pattern = "^[a-zA-Z0-9!@#$%^&*()-_=+\\\\|;:'\",.<>/?]*$";
        Matcher matcher = Pattern.compile(pattern).matcher(memberId);
        
        return matcher.matches();
    }
}