package M2023_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionExample {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 데이터베이스 연결 정보 설정
            String url = "jdbc:oracle:thin:@//호스트:포트/데이터베이스_이름";
            String username = "사용자명";
            String password = "비밀번호";

            // 데이터베이스 연결
            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("오라클 데이터베이스에 연결되었습니다.");
                // 연결 성공 후 작업 수행
                // ...
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

