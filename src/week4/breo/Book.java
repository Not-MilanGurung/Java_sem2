package week4.breo;
/**
 * A book class with attributes:
 * <ul>
 * <li>String {@link #title}</li>
 * <li>String {@link #author}</li>
 * <li>double {@link #price}</li>
 * </ul>
 * A method {@link #displayDetails()} that displays these attributes
 */
public class Book {
    private String title;
    private String author;
    private double price;

    /**
     * Sets the title of the book
     * @param title
     */
    public void setTitle(String title){this.title = title;}
    /** @return The title of the book object */
    public String getTitle(){return this.title;}

    /**
     * Sets the author of the book
     * @param author
     */
    public void setAuthor(String author){this.author = author;}
    /** @return The author of the book object */
    public String getAuthor(){return this.author;}

    /**
     * Sets the price of the book
     * @param price
     */
    public void setPrice(double price){this.price = price;}
    /** @return The price of the book object */
    public double getPrice(){return this.price;}

    /**
     * Constructor for Book class
     * @param title Title of the book
     * @param author Author of the book
     * @param price Price of the book
     */
    public Book(String title, String author, double price){
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }
    /**
     * Outputs the attributes of the book
     */
    public void displayDetails(){
        System.out.println("Details of the book:"+
                            "\n\tTitle: "+this.title+
                            "\n\tAuthor: "+this.author+
                            "\n\tPrice: "+this.price);
    }

    /**
     * Testing a Book object
     * @param args
     */
    public static void main(String[] args) {
        Book book1 = new Book("Lord of the Rings", "RR. Martin", 123000.56);
        book1.displayDetails();
        book1.setPrice(23.34);
        book1.displayDetails();
    }
}
