package week7.day1;

import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        try {
            // 1. Establish connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "notmilan");

            // 2. Create a PreparedStatement object (safe way)
            String query = "SELECT * FROM Students WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);

            // 3. Bind the value of studentId securely
            int studentId = 101;  // Example student ID
            pstmt.setInt(1, studentId);  // Set value for the first parameter

            // 4. Execute the query
            ResultSet rs = pstmt.executeQuery();

            // 5. Process the results
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // 6. Close resources
            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

