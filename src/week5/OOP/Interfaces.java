package week5.OOP;

interface Vehicle{
    void startEngine();
}

class Car implements Vehicle{
    public void startEngine(){
        System.out.println("Car engine started.");
    }
}

class Motorcycle implements Vehicle{
    public void startEngine(){
        System.out.println("Motorcycle engine started.");
    }
}



public class Interfaces {
    public static void main(String[] args) {
        Vehicle hl = new Car();
        Vehicle h2 = new Motorcycle();
        hl.startEngine();
        h2.startEngine();
    }
}
