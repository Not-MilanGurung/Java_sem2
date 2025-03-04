package week7.lab1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class QueryWithStatement {
    public static void displayAll(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "notmilan");

            Statement stmt = con.createStatement();
            String query = "SELECT * FROM Students";

            ResultSet res = stmt.executeQuery(query);
            int columnCount = res.getMetaData().getColumnCount();

            System.out.println("ID\tName\t\t\tEmail");
            while (res.next()){
                for (int i =1; i <= columnCount; i++){
                    System.out.print(res.getString(i)+"\t");
                    if (i == 2) System.out.print("\t");
                }
                System.out.println();
            }

            res.close();
            stmt.close();
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        displayAll();
    }
}
