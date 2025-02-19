package week5.breo;

public class Car {
    private static int totalCarsSold = 0;
    private String carModel;

    public Car(String model){
        this.carModel = model;
        totalCarsSold++;
    }

    public void displayInfo(){
        System.out.println(this.carModel);
        System.out.println(totalCarsSold);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Van");
        Car c45 = new Car("SUV");
        Car c2 = new Car("Car");

        c1.displayInfo();
        c2.displayInfo();
        c45.displayInfo();
    }
}
