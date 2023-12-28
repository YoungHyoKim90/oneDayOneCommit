package M2023_12;

import java.sql.*;

public class QueryExample {
    public static void main(String[] args) {
        // JDBC 연결 변수
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // JDBC 드라이버 로드
            Class.forName("com.mysql.jdbc.Driver");

            // 데이터베이스 연결
            String url = "jdbc:mysql://localhost:3306/your_database";
            String username = "your_username";
            String password = "your_password";
            conn = DriverManager.getConnection(url, username, password);

            // 쿼리 실행
            stmt = conn.createStatement();
            String query = "SELECT * FROM your_table";
            rs = stmt.executeQuery(query);

            // 결과 처리
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                // 결과 처리 코드 작성
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 자원 해제
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

