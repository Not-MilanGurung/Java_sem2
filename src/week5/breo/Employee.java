package week5.breo;

public class Employee {
    private static int employeeCount = 0;
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Allen", 1);
        Employee e3 = new Employee("Sharah", 34);
        Employee e2 = new Employee("Gwen", 45);
        // Bad practice
        System.out.println(e1.employeeCount);
        System.out.println(e3.employeeCount);
        System.out.println(e2.employeeCount);
        System.out.println(Employee.employeeCount);
    }
}
