package com.example.cliapp;

import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name to insert into database:");
        String name = scanner.nextLine();

        try {
            // Load JDBC driver (optional in modern Java)
            Class.forName("org.sqlite.JDBC");

            // Connect to SQLite database (creates file if not exists)
            Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");

            // Create table if not exists
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT)");

            // Insert name into users table
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users(name) VALUES(?)");
            ps.setString(1, name);
            ps.executeUpdate();

            // Fetch and display all users
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            System.out.println("\nAll users:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("name"));
            }

            // Close resources
            rs.close();
            ps.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}