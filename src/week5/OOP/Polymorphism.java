package week5.OOP;

class Employee{
    public void work(){
        System.out.println("Employee is working");
    }
}

class Manager extends Employee{
    @Override
    public void work(){
        System.out.println("Manager is managing");
    }
}

class Developer extends Employee{
    public void work(){
        System.out.println("Developer is developing");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Employee man = new Manager();
        Employee dev = new Developer();
        man.work();
        dev.work();
    }
}
