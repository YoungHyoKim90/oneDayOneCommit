package M2024_03;

import java.sql.*;
import java.util.Scanner;

public class SimpleBoard {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/board";
	private static final String DB_USER = "username";
	private static final String DB_PASSWORD = "password";

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement stmt = conn.createStatement();
				Scanner scanner = new Scanner(System.in)) {

			createTableIfNotExists(stmt);

			while (true) {
				System.out.println("\n1. 전체 게시글 조회");
				System.out.println("2. 게시글 작성");
				System.out.println("3. 게시글 수정");
				System.out.println("4. 게시글 삭제");
				System.out.println("0. 프로그램 종료");
				System.out.print("원하는 작업을 선택하세요: ");
				int choice = scanner.nextInt();
				scanner.nextLine(); // 버퍼 비우기

				switch (choice) {
				case 1:
					showAllPosts(stmt);
					break;
				case 2:
					createPost(stmt, scanner);
					break;
				case 3:
					updatePost(stmt, scanner);
					break;
				case 4:
					deletePost(stmt, scanner);
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못된 선택입니다. 다시 선택하세요.");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void createTableIfNotExists(Statement stmt) throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS posts (" + "id INT AUTO_INCREMENT PRIMARY KEY,"
				+ "title VARCHAR(100) NOT NULL," + "content TEXT NOT NULL," + "author VARCHAR(50) NOT NULL,"
				+ "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP" + ")";
		stmt.executeUpdate(sql);
	}

	private static void showAllPosts(Statement stmt) throws SQLException {
		String sql = "SELECT * FROM posts";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt("id");
			String title = rs.getString("title");
			String author = rs.getString("author");
			Timestamp createdAt = rs.getTimestamp("created_at");
			System.out.println("ID: " + id + ", 제목: " + title + ", 작성자: " + author + ", 작성일시: " + createdAt);
		}
	}

	private static void createPost(Statement stmt, Scanner scanner) throws SQLException {
		System.out.print("제목을 입력하세요: ");
		String title = scanner.nextLine();
		System.out.print("내용을 입력하세요: ");
		String content = scanner.nextLine();
		System.out.print("작성자를 입력하세요: ");
		String author = scanner.nextLine();

		String sql = "INSERT INTO posts (title, content, author) VALUES (?, ?, ?)";
		PreparedStatement pstmt = stmt.getConnection().prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		pstmt.setString(3, author);
		pstmt.executeUpdate();
		System.out.println("게시글이 작성되었습니다.");
	}

	private static void updatePost(Statement stmt, Scanner scanner) throws SQLException {
		System.out.print("수정할 게시글의 ID를 입력하세요: ");
		int postId = scanner.nextInt();
		scanner.nextLine(); // 버퍼 비우기
		System.out.print("수정할 제목을 입력하세요: ");
		String title = scanner.nextLine();
		System.out.print("수정할 내용을 입력하세요: ");
		String content = scanner.nextLine();

		String sql = "UPDATE posts SET title = ?, content = ? WHERE id = ?";
		PreparedStatement pstmt = stmt.getConnection().prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		pstmt.setInt(3, postId);
		int rowsAffected = pstmt.executeUpdate();
		if (rowsAffected > 0) {
			System.out.println("게시글이 수정되었습니다.");
		} else {
			System.out.println("해당 ID의 게시글이 없습니다.");
		}
	}

	private static void deletePost(Statement stmt, Scanner scanner) throws SQLException {
		System.out.print("삭제할 게시글의 ID를 입력하세요: ");
		int postId = scanner.nextInt();
		scanner.nextLine(); // 버퍼 비우기

		String sql = "DELETE FROM posts WHERE id = ?";
//        PreparedStatement

	}
}
