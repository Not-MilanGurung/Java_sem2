package week3.breo.practical;

enum RoomType{
    STANDARD_1BED, STANDARD_2BED, STANDARD_4BED, LUXURY_1BED, LUXURY_2BED
}

public class HotelRoom {
    private String roomNumber;
    private boolean isAvalible;
    private int pricePerNight;
    private RoomType roomType;

    public HotelRoom(String roomNumber, RoomType roomType, boolean isAvalible, int pricePerNight){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvalible = isAvalible;
        this.pricePerNight = pricePerNight;
    }

    public void displayDetails(){
        System.out.println("Room Details:"+
                            "\nRoom Number: "+roomNumber+
                            "\nRoom Type: "+roomType+
                            "\nAvailable : "+isAvalible+
                            "\nPrice per Night : "+pricePerNight);
    }

    public void book(){
        if(!isAvalible)
            System.out.println("The room is already booked");
        else  
            isAvalible = false;
    }

    public void checkOut(int daysStayed){
        if(!isAvalible){
            if (daysStayed > 0){
                int amount = daysStayed * pricePerNight;
                isAvalible = true;
                System.err.println("The bill for staying for "+daysStayed+" days is "+amount);
            }
            else
                System.out.println("Invalid value for no. of days");
        }
        else
            System.out.println("The room has not been booked yet");
    }

    public static void main(String[] args) {
        HotelRoom h1 = new HotelRoom("12B", RoomType.LUXURY_2BED, true, 45_000);
        h1.book();
        h1.book();
        h1.checkOut(10);
        h1.checkOut(5);
    }
}
