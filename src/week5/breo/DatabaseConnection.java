package week5.breo;

public class DatabaseConnection {
    public static void connected(){
        System.out.println("Database connected successfully");
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        DatabaseConnection o1 = new DatabaseConnection();
        DatabaseConnection o3 = new DatabaseConnection();
        DatabaseConnection o2 = new DatabaseConnection();
        // Bad practice
        o1.connected();
        o2.connected();
        o3.connected();
    }
}
