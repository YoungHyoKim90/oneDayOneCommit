package M2024_02;

import java.time.LocalDate;
import java.time.YearMonth;

public class CalendarExample {
    public static void main(String[] args) {
        // 현재 날짜 가져오기
        LocalDate currentDate = LocalDate.now();

        // 현재 달의 첫 날과 마지막 날 구하기
        YearMonth currentYearMonth = YearMonth.from(currentDate);
        LocalDate firstDayOfMonth = currentYearMonth.atDay(1);
        LocalDate lastDayOfMonth = currentYearMonth.atEndOfMonth();

        // 현재 달의 달력 출력
        System.out.println("현재 달력:");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        int startDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue(); // 첫째 날의 요일 구하기 (1:월요일, ..., 7:일요일)
        for (int i = 1; i < startDayOfWeek; i++) {
            System.out.print("\t"); // 첫째 날까지의 빈 칸 출력
        }
        for (LocalDate date = firstDayOfMonth; !date.isAfter(lastDayOfMonth); date = date.plusDays(1)) {
            System.out.print(date.getDayOfMonth() + "\t");
            if (date.getDayOfWeek().getValue() == 7) {
                System.out.println(); // 토요일이면 줄 바꿈
            }
        }
    }
}

