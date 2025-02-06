package week3.breo.practical;

public class MovieTicket {
    private int ticketID;
    private String movieName, seatNumber;
    private boolean isBooked;

    public MovieTicket(int ticketID, String movieName, String seatNumber, boolean isBooked){
        this.ticketID = ticketID;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.isBooked = isBooked;
    }

    public boolean book(){
        if (isBooked){
            System.out.println("The ticket is already booked");
            return false;
        }
        else{
            this.isBooked = true;
            return true;
        }
    }
    
    public boolean cancel(){
        if (!isBooked){
            System.out.println("The ticket has not been booked yet");
            return false;
        }
        else {
            this.isBooked = false;
            return true;
        }
    }

    public void displayInfo(){
        System.out.println("Information about ticket:"+
                            "\nTicket ID: "+this.ticketID+
                            "\nMovie: "+this.movieName+
                            "\nSeat number: "+this.seatNumber+
                            "\nBooking status: "+this.isBooked);
    }


    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket(2, "Sholey", "B23", false);
        t1.displayInfo();
        t1.book();
        t1.displayInfo();
        t1.cancel();
        t1.displayInfo();   
    }
}
