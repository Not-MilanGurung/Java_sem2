package week3.breo.practical;

enum Designation{
    JUNIOR, SENIOR, MANAGER, HEAD, CEO
}

public class Employee {
    private String name;
    private int employeeID;
    private Designation designation;
    private int salary;

    public Employee(int employeeID, String name, Designation designation, int salary){
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public void increaseSalary(int amount){
        if (amount < 1)
            System.err.println("Invalid increses for salary");
        else   
            this.salary += amount;
    }

    public void displayInfo(){
        System.out.println("Employee description:");
        System.out.println("ID: "+this.employeeID);
        System.out.println("Name: "+this.name);
        System.out.println("Designation: "+this.designation);
        System.out.println("Salary: "+this.salary);
    }

    public void finalize(){
        System.out.println("Employe object is destroyed");
    }

    public static void main(String[] args) {
        Employee em = new Employee(1, "Jeff", Designation.HEAD, 200_000);
        Employee em2 = new Employee(3, "Allya", Designation.CEO, 300_000);
        em.displayInfo();
        em.increaseSalary(50_000);
        em.displayInfo();
        em2.displayInfo();
        em = null;
        em2 = null;
        System.gc();
    }

}
