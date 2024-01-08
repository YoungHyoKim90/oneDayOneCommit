package M2024_01;

import java.io.IOException;
import java.sql.SQLException;

public class MultiExceptionExample {
    public static void main(String[] args) {
        try {
            // 여러 예외를 던질 수 있는 메소드 호출
            someMethod();
        } catch (IOException | SQLException e) {
            // IOException 또는 SQLException을 처리
            e.printStackTrace();
        }
    }

    // 예외를 던지는 메소드
    private static void someMethod() throws IOException, SQLException {
        // 예외 처리를 위한 로직
    }
}
