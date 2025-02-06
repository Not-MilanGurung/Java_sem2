package week3.breo.practical;

enum Model{
    BIKE100CC, BIKE200CC, BIKE500CC, CAR_SMALL, CAR_SUV, JEEP
}

public class Vehicle {
    private String regestrationNo, ownerName;
    private int year;
    private Model model;

    public Vehicle(String regestrationNo, String ownerName, Model model, int year){
        this.regestrationNo = regestrationNo;
        this.ownerName = ownerName;
        this.model = model;
        this.year = year;
    }

    public Vehicle(){}

    public boolean changeOwnership(String newOwnerName){
        if (newOwnerName.isBlank()) {
            System.err.println("Owner name can not be empty");
            return false;
        }

        this.ownerName = newOwnerName;
        return true;
    }

    public void displayInfo(){
        System.out.println("Vehicle Information"
                +"\nRegestration No.: "+this.regestrationNo
                +"\nName of owner: "+this.ownerName
                +"\nModel: "+this.model
                +"\nYear: "+this.year);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("DVG123-54A", "Allan", Model.BIKE500CC, 2017);
        Vehicle v2 = new Vehicle();
        v1.displayInfo();
        v2.displayInfo();
        v2.changeOwnership("Carl");
        v2.displayInfo();
    }
}
