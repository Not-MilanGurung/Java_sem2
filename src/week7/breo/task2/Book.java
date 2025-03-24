package week7.breo.task2;

public class Book {
	private String title;
	private String author;
	private double price;

	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void displayInfo(){
		System.out.printf("Title: %s\nAuthor: %s\nPrice: %f\n",title, author, price);
	}

	public static void main(String[] args) {
		Book b1 = new Book("Lords of the Ring", "JJ Tolken");
		Book b2 = new Book("Zelda", "Anon", 32.4);

		b1.displayInfo();
		b2.displayInfo();
	}
}
