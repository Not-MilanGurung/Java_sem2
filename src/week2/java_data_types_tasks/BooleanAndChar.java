package week2.java_data_types_tasks;
import java.util.Scanner;

public class BooleanAndChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean likeProgramming = false;
		char fLetter, symbol;
		// Asking yes no for boolean
		System.out.print("Do you like programming(yes/no): ");
		switch (input.next()) {
		case "yes":
			likeProgramming = true;
			break;
		case "no":
			likeProgramming = false;
			break;
		default:
			System.out.println("Invalid input");
		}
		System.out.println("You answered "+likeProgramming);
		
		System.out.print("Enter your name");
		input.nextLine();
		fLetter = input.nextLine().charAt(0);
		System.out.print("Enter a symbol you like");
		symbol = input.next().charAt(0);
		System.out.println("First letter of your name: "+fLetter);
		System.out.println("Favorite symbol: "+symbol);
		
		input.close();
	}

}
