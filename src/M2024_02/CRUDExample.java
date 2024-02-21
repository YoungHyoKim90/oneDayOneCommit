package M2024_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDExample {

    // JDBC 연결 정보
    private static final String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private static final String username = "yourUsername";
    private static final String password = "yourPassword";

    // 데이터베이스 연결 객체
    private static Connection conn = null;

    public static void main(String[] args) {
        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 데이터베이스 연결
            conn = DriverManager.getConnection(url, username, password);

            // 데이터 생성
            createData("John", 30);

            // 데이터 조회
            readData();

            // 데이터 업데이트
            updateData(1, "John Doe", 35);

            // 데이터 조회
            readData();

            // 데이터 삭제
            deleteData(1);

            // 데이터 조회
            readData();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 데이터베이스 연결 닫기
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 데이터 생성
    private static void createData(String name, int age) throws SQLException {
        String sql = "INSERT INTO your_table (name, age) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.executeUpdate();
            System.out.println("Data created successfully");
        }
    }

    // 데이터 조회
    private static void readData() throws SQLException {
        String sql = "SELECT * FROM your_table";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
            }
        }
    }

    // 데이터 업데이트
    private static void updateData(int id, String name, int age) throws SQLException {
        String sql = "UPDATE your_table SET name = ?, age = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            System.out.println("Data updated successfully");
        }
    }

    // 데이터 삭제
    private static void deleteData(int id) throws SQLException {
        String sql = "DELETE FROM your_table WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Data deleted successfully");
        }
    }
}
