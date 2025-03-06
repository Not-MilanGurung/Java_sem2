package week7.march5;

//PersonCRUDV3.java - An improved CRUD class using method parameters and returning a list
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonCRUD3 {
 // Change the URL, USER, and PASS as per your database configuration.
 static final String URL = "jdbc:mysql://localhost:3306/SchoolDB";
 static final String USER = "root";
 static final String PASS = "notmilan";

 // Method to insert a person record using parameters
 public void insert(int pid, String fullName, String email) {
     try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
         String sql = "INSERT INTO Persons (pid, fullName, email) VALUES (?, ?, ?)";
         PreparedStatement stmt = conn.prepareStatement(sql);
         stmt.setInt(1, pid);
         stmt.setString(2, fullName);
         stmt.setString(3, email);
         stmt.executeUpdate();
         System.out.println("Person inserted successfully!");
     } catch (SQLException e) {
         e.printStackTrace();
     }
 }

//Method to update a person's details by pid
public void update(int pid, String newFullName, String newEmail) {
  try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
      String sql = "UPDATE Persons SET fullName = ?, email = ? WHERE pid = ?";
      PreparedStatement stmt = conn.prepareStatement(sql);
      stmt.setString(1, newFullName);
      stmt.setString(2, newEmail);
      stmt.setInt(3, pid);
      int rowsUpdated = stmt.executeUpdate();
      
      if (rowsUpdated > 0) {
          System.out.println("Person updated successfully!");
      } else {
          System.out.println("No person found with PID " + pid);
      }
  } catch (SQLException e) {
      e.printStackTrace();
  }
}

 
 // Method to retrieve all persons from the database and return them as a List
 public List<Person> getAll() {
     List<Person> personList = new ArrayList<>();
     try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
          Statement stmt = conn.createStatement()) {
         String sql = "SELECT * FROM Persons";
         ResultSet rs = stmt.executeQuery(sql);
         while (rs.next()) {
             int pid = rs.getInt("pid");
             String fullName = rs.getString("fullName");
             String email = rs.getString("email");
             Person person = new Person(pid, fullName, email);
             personList.add(person);
         }
     } catch (SQLException e) {
         e.printStackTrace();
     }
     return personList;
 }

 public Person getByID(int id) {
	Person person = new Person();
     try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
		 String sql = "SELECT * FROM Persons WHERE pid = ?";
		 PreparedStatement stmt = conn.prepareStatement(sql);
		 stmt.setInt(1, id);
         ResultSet rs = stmt.executeQuery();
         rs.next();
		int pid = rs.getInt("pid");
		String fullName = rs.getString("fullName");
		String email = rs.getString("email");
		person.setPid(pid);
		person.setFullName(fullName);
		person.setEmail(email);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return person;
 }

 public void deleteRecord(int id) {
	try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
		String sql = "DELETE FROM Persons WHERE pid = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, id);
		stmt.executeUpdate();
		System.out.println("Record "+id+" has be removed");
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

}
