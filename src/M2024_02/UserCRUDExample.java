package M2024_02;

import java.sql.*;

public class UserCRUDExample {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String JDBC_USER = "your_database_user";
    private static final String JDBC_PASSWORD = "your_database_password";

    public static void main(String[] args) {
        create();
        read();
        update();
        delete();
    }

    // Create
    private static void create() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             Statement statement = connection.createStatement()) {

            String insertQuery = "INSERT INTO users (username, email) VALUES ('john_doe', 'john@example.com')";
            statement.executeUpdate(insertQuery);

            
            System.out.println("User created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read
    private static void read() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             Statement statement = connection.createStatement()) {

            String selectQuery = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String email = resultSet.getString("email");

                System.out.println("User ID: " + id + ", Username: " + username + ", Email: " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update
    private static void update() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             Statement statement = connection.createStatement()) {

            String updateQuery = "UPDATE users SET email='updated_email@example.com' WHERE username='john_doe'";
            statement.executeUpdate(updateQuery);

            System.out.println("User updated successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete
    private static void delete() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             Statement statement = connection.createStatement()) {

            String deleteQuery = "DELETE FROM users WHERE username='john_doe'";
            statement.executeUpdate(deleteQuery);

            System.out.println("User deleted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

