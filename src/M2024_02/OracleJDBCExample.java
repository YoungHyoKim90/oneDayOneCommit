package M2024_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBCExample {

    public static void main(String[] args) {
        // JDBC 연결 정보
        String url = "jdbc:oracle:thin:@localhost:1521:ORCL"; // 데이터베이스 URL
        String username = "yourUsername"; // 데이터베이스 사용자 이름
        String password = "yourPassword"; // 데이터베이스 암호

        
        // JDBC 연결 객체
        Connection conn = null;
        // SQL 문 실행 객체
        Statement stmt = null;
        // SQL 결과 집합 객체
        ResultSet rs = null;

        
        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 데이터베이스 연결
            conn = DriverManager.getConnection(url, username, password);

            // SQL 문 실행을 위한 Statement 객체 생성
            stmt = conn.createStatement();

            // 실행할 SQL 쿼리
            String sqlQuery = "SELECT * FROM yourTable"; // 적절한 테이블 이름을 사용하세요

            // SQL 쿼리 실행 및 결과 집합 가져오기
            rs = stmt.executeQuery(sqlQuery);

            // 결과 집합 처리
            while (rs.next()) {
                // 결과 처리 예시: 결과 집합에서 원하는 데이터 가져오기
                int id = rs.getInt("id"); // id 컬럼의 값 가져오기
                String name = rs.getString("name"); // name 컬럼의 값 가져오기
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // JDBC 객체 닫기 (역순으로 닫기)
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
