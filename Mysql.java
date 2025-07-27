import java.sql.*;

public class Mysql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Mysql JDBC driver loaded successfully.");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_todo", "root", "");
            System.out.println("Connection to Mysql has been established.");

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
