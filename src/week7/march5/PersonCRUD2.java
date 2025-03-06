package week7.march5;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonCRUD2 {
	static final String URL = "jdbc:mysql://localhost:3306/SchoolDB";
	static final String USER = "root";
	static final String PASSWORD = "notmilan";

	public void insert() {
		Scanner scanner = new Scanner(System.in);
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.print("Enter PID: ");
			int pid = Integer.parseInt(scanner.nextLine());
			System.out.print("Entr Full Name: ");
			String fullName = scanner.nextLine();
			System.out.print("Enter Email: ");
			String email = scanner.nextLine();

			String sql = "INSERT INTO Persons (pid, fullName, email) VALUES (?, ?, ?)";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, pid);
			stmt.setString(2, fullName);
			stmt.setString(3, email);
			stmt.executeUpdate();
			System.out.println("Person inserted successfully");
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}

	public void displayAll() {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)){
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM Persons";
			ResultSet res = stmt.executeQuery(sql);
			System.out.println("PID, FULLNAME, EmAIL");
			while (res.next()) {
				System.out.println(res.getInt(1) + ", " + res.getString(2) + ", " +res.getString(3));
			}

		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
}
