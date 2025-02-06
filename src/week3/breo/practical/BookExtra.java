package week3.breo.practical;
import week4.breo.Book;
public class BookExtra extends Book {
    private boolean isAvailable;
    private boolean isReserverd;
    private int stuID;
    public BookExtra(String title, String author, double price) {
        super(title, author, price);
        isAvailable = true;
    }
    public void borrow(int studentID){
        if(isAvailable) {
            if (isReserverd){
                if (stuID == studentID){
                    System.out.println("You borrowed the book");
                    isAvailable = false;
                    isReserverd = false;
                }
                else{
                    System.out.println("Sorry, the book has been reserved by student ID: "+stuID);
                }
            }
            else {
                System.out.println("You borrowed the book");
                isAvailable = false;
            }
        }
        else{
            System.out.println("Sorry, the book is not availabe. You can reserve the book for when it is returned");
        }
    }
    public void reserve(int studentID){
        if (isAvailable){
            System.out.println("The book is already avaialable");
        }
        else{
            if (isReserverd){
                System.out.println("Sorry, the book has been reserved by student ID: "+stuID);
            }
            else{
                isReserverd = true;
                stuID = studentID;
                System.out.println("You have reserved the book");
            }
        }
    }

    public void returnBook(){
        isAvailable = true;
    }

    public static void main(String[] args) {
        BookExtra b1 = new BookExtra("Blame!", "Nioh Essei", 34);
        b1.borrow(2);
        b1.borrow(3);
        b1.reserve(3);
        b1.reserve(4);
        b1.returnBook();
        b1.reserve(4);
        b1.borrow(4);
        b1.borrow(3);
        b1.reserve(4);
    }

}
