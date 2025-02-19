package week5.breo;

class Company{
    public static void displayInfo(){
        System.out.println("Company Info");
    }
}

public class TechCompany extends Company {
    public static void displayInfo(){
        System.out.println("Tech Company Info");
    }
    public static void main(String[] args) {
        Company.displayInfo();
        TechCompany.displayInfo();
    }
}
