package M2023_12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {
    public static void main(String[] args) {
        // 두 날짜 설정
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 12, 31);

        // 날짜 간의 차이 계산
        long daysDifference = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("날짜 간의 차이: " + daysDifference + "일");
    }
}

