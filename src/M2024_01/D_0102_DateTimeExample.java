package M2024_01;

import java.time.LocalDate;
import java.time.LocalTime;

public class D_0102_DateTimeExample {
    public static void main(String[] args) {
        // 현재 날짜
        LocalDate today = LocalDate.now();
        System.out.println("오늘 날짜: " + today);

        // 현재 시간
        LocalTime now = LocalTime.now();
        System.out.println("현재 시간: " + now);
    }
}
