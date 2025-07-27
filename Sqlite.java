import java.sql.*;

public class Sqlite {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("SQLite JDBC driver loaded successfully.");

            Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
            System.out.println("Connection to SQLite has been established.");

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM todos";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("title");
                Boolean completed = rs.getBoolean("completed");
                System.out.println("ID: " + id + ", Name: " + name + ", Completed: " + completed);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
