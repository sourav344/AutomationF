package com.sourav.utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseUtils {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/selenium";
    private static final String USER = "root";
    private static final String PASS = "Database";

    private Connection connection;
    private Statement statement;

    // Method to establish connection
    public void connectToDatabase() throws Exception {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
        statement = connection.createStatement();
    }

    // Method to execute a query
    public ResultSet executeQuery(String query) throws Exception {
        return statement.executeQuery(query);
    }

    // Method to close the connection
    public void closeConnection() throws Exception {
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}
