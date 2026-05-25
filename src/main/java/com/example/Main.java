package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/learning_db";
        String user = "user";
        String password = "password";

        try {
            // 1. Establish the connection
            System.out.println("Connecting to the database...");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");

            // 2. Create a statement
            Statement statement = connection.createStatement();

            // 3. Create a table if it doesn't exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(50)," +
                    "email VARCHAR(50))";
            statement.execute(createTableSQL);
            System.out.println("Table 'users' verified.");

            // 4. Insert some data
            String insertSQL = "INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com')";
            statement.executeUpdate(insertSQL);
            System.out.println("Inserted a sample user.");

            // 5. Query the data
            String querySQL = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(querySQL);

            System.out.println("--- User List ---");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") + 
                                   ", Name: " + resultSet.getString("name") + 
                                   ", Email: " + resultSet.getString("email"));
            }

            // 6. Close resources
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Connection closed.");

        } catch (Exception e) {
            System.err.println("An error occurred:");
            e.printStackTrace();
        }
    }
}
