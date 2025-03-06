package week7.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import week5.breo.Student;

public class DatabaseConnection {
    Connection con;
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String pass = "notmilan";
    String databaseName;
    String table;
    public class StudentData{
        public String name;
        public int age;
        public String grade;

        public StudentData(String name, int age, String grade){
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }

    public DatabaseConnection(String databaseName, String table){
        this.databaseName = databaseName;
        this.table = table;
    }
    public void startConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void createDatabase() throws SQLException{
        Statement stmt = con.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS "+databaseName);
        System.out.println("Database "+databaseName+" created");
        stmt.execute("USE "+databaseName);
        System.out.println("Using database "+databaseName);
        stmt.close();
    }

    public void closeConnecion() throws SQLException{
        con.close();
    }

    public void createTable() throws SQLException  {
        PreparedStatement stmt = con.prepareStatement("CREATE TABLE IF NOT EXISTS "+table +"(id INT PRIMARY KEY AUTO_INCREMENT, "+
            "name VARCHAR(20), age INT, grade VARCHAR(2))");
        stmt.execute();
        System.out.println("Table "+table+" created");
        stmt.close();
    }

    public void insertIntoTable(StudentData[] datas) throws SQLException{
        PreparedStatement stmt = con.prepareStatement("INSERT INTO "+table+" (name, age, grade) VALUES(?, ?, ?)");
        for (StudentData s : datas){
            stmt.setString(1, s.name);
            stmt.setInt(2, s.age);
            stmt.setString(3, s.grade);
            stmt.addBatch();
        }
        int[] res = stmt.executeBatch();
        System.out.println(res.length+" records added");
    }

    public void updateGrade(int id,String grade) throws SQLException{
        PreparedStatement stmt = con.prepareStatement("UPDATE "+table+" SET grade=? WHERE id=?");
        stmt.setString(1, grade);
        stmt.setInt(2, id);
        stmt.execute();
        System.out.println("Record Updated");
    }

    public void printAllRecords() throws SQLException{
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM "+table);
        ResultSet res = stmt.executeQuery();
        ResultSetMetaData resMeta = res.getMetaData();
        int column = resMeta.getColumnCount();
        System.out.println("ID\tName\tAge\tGrade");
        while (res.next()){
            for(int i = 1; i <= column; i++){
                System.out.print(res.getString(i)+"\t");
            }
            System.out.println();
        }
    }

    public void printRecordByName(String name) throws SQLException{
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM "+table+" WHERE name=? ORDER BY name");
        stmt.setString(1, name);
        ResultSet res = stmt.executeQuery();
        ResultSetMetaData resMeta = res.getMetaData();
        int column = resMeta.getColumnCount();
        System.out.println("ID\tName\tAge\tGrade");
        while (res.next()){
            for(int i = 1; i <= column; i++){
                System.out.print(res.getString(i)+"\t");
            }
            System.out.println();
        }
    }

    public void printNoOfStudents() throws SQLException{
        PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM "+table);
        ResultSet res = stmt.executeQuery();
        res.next();
        System.out.println("Total students: "+res.getString(1));
        stmt.close();
    }

    public void deleteRecord(int id) throws SQLException{
        PreparedStatement stmt = con.prepareStatement("DELETE FROM "+table+" WHERE id=?");
        stmt.setInt(1, id);
        stmt.executeUpdate();
        System.out.println("Record "+id+" deleted");
        stmt.close();
    }




    public static void main(String[] args) {
        DatabaseConnection database = new DatabaseConnection("SchoolDB", "students");
        database.startConnection(); 
        try {
            database.createDatabase();
            database.createTable(); 
            StudentData[] test = {
                database.new StudentData("Ram", 22, "B+"), 
                database.new StudentData("Shyam", 22, "A"),
                database.new StudentData("Hari", 21, "C+")
            };
            
            database.insertIntoTable(test);
            database.printAllRecords();
            database.printNoOfStudents();
            
            database.updateGrade(2,"Z+");
            database.printAllRecords();
            
            // database.deleteRecord(2);
            database.printAllRecords();
            database.printRecordByName("Hari");

            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}