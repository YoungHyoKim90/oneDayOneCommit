package M2024_03;

import java.sql.*;

public class CRUDOperations {
    // 데이터베이스 연결 정보
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/테이블명";
    static final String USER = "사용자명";
    static final String PASS = "패스워드";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // JDBC 드라이버를 등록하고 데이터베이스에 연결
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            
            // 데이터 생성
            stmt = conn.createStatement();
            String sql = "INSERT INTO 테이블명 (column1, column2, ...) VALUES (value1, value2, ...)";
            stmt.executeUpdate(sql);

            
            // 데이터 조회
            sql = "SELECT * FROM 테이블명";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // 조회 결과 처리
                int id = rs.getInt("id");
                String name = rs.getString("name");
                // 필요한 작업 수행
            }

            
            // 데이터 수정
            sql = "UPDATE 테이블명 SET column1 = value1, column2 = value2 WHERE 조건";
            stmt.executeUpdate(sql);

            
            // 데이터 삭제
            sql = "DELETE FROM 테이블명 WHERE 조건";
            stmt.executeUpdate(sql);

            
            // 자원 정리
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // JDBC 관련 예외 처리
            se.printStackTrace();
        } catch (Exception e) {
            // 기타 예외 처리
            e.printStackTrace();
        } finally {
            // 자원 정리
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

