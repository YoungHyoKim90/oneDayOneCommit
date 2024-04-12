package M2024_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicQueryExample {

    // JDBC 연결 정보
    private static final String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private static final String username = "yourUsername";
    private static final String password = "yourPassword";

    public static void main(String[] args) {
        try {
        	
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            
            // 데이터베이스 연결
            Connection conn = DriverManager.getConnection(url, username, password);

            
            // 사용자 입력 받기
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter query type (1: Select, 2: Insert, 3: Update, 4: Delete): ");
            int queryType = scanner.nextInt();

            
            // 사용자 입력에 따라 쿼리 선택
            String query = "";
            switch (queryType) {
                case 1:
                    query = "SELECT * FROM your_table";
                    break;
                case 2:
                    query = "INSERT INTO your_table (column1, column2) VALUES (?, ?)";
                    break;
                case 3:
                    query = "UPDATE your_table SET column1 = ? WHERE condition";
                    break;
                case 4:
                    query = "DELETE FROM your_table WHERE condition";
                    break;
                default:
                    System.out.println("Invalid query type");
                    break;
            }

            // 쿼리 실행
            if (!query.isEmpty()) {
                executeQuery(conn, query);
            }

            // 데이터베이스 연결 닫기
            conn.close();
            scanner.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // 쿼리 실행 메서드
    private static void executeQuery(Connection conn, String query) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            if (query.startsWith("INSERT") || query.startsWith("UPDATE")) {
                // Insert 또는 Update 쿼리일 경우 사용자 입력으로 값 설정
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter value for column1: ");
                String value1 = scanner.next();
                System.out.print("Enter value for column2: ");
                String value2 = scanner.next();
                stmt.setString(1, value1);
                stmt.setString(2, value2);
            }
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // 결과 처리 예시
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));

            }
        }
    }
}

