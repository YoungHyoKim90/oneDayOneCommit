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

/*
 * 게시판을 만들기 위해서는 데이터베이스와 사용자 인터페이스(UI)가 필요합니다. 아래는 간단한 자바로 게시판을 만드는 과정을 안내하는
 * 예시입니다. 이 예시에서는 데이터베이스로 MySQL을 사용하고, 사용자 인터페이스는 콘솔을 이용합니다.
 * 
 * 프로젝트 설정: 프로젝트를 생성하고 필요한 라이브러리를 추가합니다. 예를 들어, JDBC 드라이버를 추가하여 MySQL과의 연결을 지원할
 * 수 있습니다.
 * 
 * 데이터베이스 구성: MySQL 또는 다른 데이터베이스에서 게시글과 사용자 정보를 저장할 테이블을 생성합니다. 각 테이블은 적절한 필드를
 * 포함해야 합니다. 예를 들어, 게시글 테이블은 제목, 내용, 작성자, 작성일자 등의 필드를 포함할 수 있습니다.
 * 
 * 자바 클래스 작성: 게시판의 핵심 기능을 담당할 자바 클래스를 작성합니다. 이 클래스는 데이터베이스와의 연결을 담당하고, 게시글을 조회,
 * 작성, 수정, 삭제하는 등의 기능을 제공해야 합니다.
 * 
 * 사용자 인터페이스(UI) 작성: 콘솔을 이용하여 사용자와의 상호작용을 구현합니다. 사용자는 목록을 조회하거나 게시글을 작성, 수정, 삭제할
 * 수 있어야 합니다.
 * 
 * 기능 구현: 자바 클래스에서 정의한 기능을 사용하여 사용자 인터페이스와 상호작용하고, 데이터베이스와의 CRUD(Create, Read,
 * Update, Delete) 작업을 수행합니다.
 * 
 * 아래는 간단한 게시판의 예시 코드입니다. 이 코드는 JDBC를 사용하여 MySQL과의 연결을 구현하고, 게시글 조회, 작성, 수정, 삭제
 * 기능을 제공합니다. 또한 콘솔을 이용하여 사용자와의 상호작용을 구현합니다.
 */
