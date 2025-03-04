package week7.day1;

import java.sql.*;

public class StatementExample {
    public static void main(String[] args) {
        try {
            // 1. Establish connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "notmilan");

            // 2. Create a Statement object
            Statement stmt = conn.createStatement();

            // 3. Use string concatenation for the query (unsafe)
            int studentId = 101;  // Example student ID
            String query = "SELECT * FROM Students WHERE id = " + studentId;

            // 4. Execute the query
            ResultSet rs = stmt.executeQuery(query);

            // 5. Process the results
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // 6. Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

