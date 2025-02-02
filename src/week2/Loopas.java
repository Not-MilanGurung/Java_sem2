package week2;
import java.util.Scanner;

public class Loopas {

	public static void main(String[] args) {
//		ForLoops.tree();
//		ForLoops.forLoopExample();
//		ForLoops.arrayIterationExample();
//		ForLoops.nestedForLoops();
//		WhileLoop.whileLoop();
//		WhileLoop.infiniteLoop();
//		DoWhile.example();
//		DoWhile.inputValidation();
		DoWhile.options();
	}

}

class ForLoops{
	static void tree() {
		int k = 10;
		for (int i = 0; i < k; i++) {
			for(int j = k-(i+1); j>0; j--) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < (1+i*2); j++) {
				System.out.print("X");
			}
			for(int j = k-(i+1); j>0; j--) {
				System.out.print(" ");
			}
			
			System.out.print("\n");
		}
	}
	
	static void forLoopExample() {
		for (int i=0; i < 10; i++) {
			System.out.println("Iteration: "+i);
		}
	}
	
	static void arrayIterationExample() {
		int[] numbers = {19, 39, 49, 923, 39 ,49 ,49};
		for (int i=0; i< numbers.length; i++) {
			System.out.println("Element at index "+i+" :"+numbers[i]);
		}
	}
	
	static void nestedForLoops() {
		for(int i=0; i<10; i++) {
			for(int j=i; j<10; j++) {
				System.out.println(i+" and "+j);
			}
		}
	}
}

class WhileLoop{
	static void whileLoop() {
		int count = 0;
		while(count < 5) {
			System.out.println("Count: "+count);
			count++;
		}
	}
	
	static void infiniteLoop() {
		// Requires interrupt to stop
		while(true) {
			System.out.println("Infinite loop");
		}
	}
	
//	static void inputValidation() {
//		Scanner input = new Scanner(System.in);
//		int number;
//		System.out.print("Enter a number between 0 and 10: ");
//		number = input.nextInt();
//		
//		while (number)
//	}
}

class DoWhile {
	static void example() {
		int count = 1;
		do {
			System.out.println(count);
			++count;
		} while(count <=5);
	}
	
	static void inputValidation() {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.print("Enter a number between 1 and 10: ");
			num = input.nextInt();
		} while(num < 1 || num > 10);
		
		System.out.println("You entered: "+num);
		input.close();
	}
	
	static void options() {
		Scanner inputScanner = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("\n1. Option 1");
			System.out.println("2. Option 2");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = inputScanner.nextInt();
			switch (choice) {
				case 1:
					System.out.println("You chose Option 1");
					break;
				case 2:
					System.out.println("You chose Option 2");
					break;
				case 3:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Incorrect option");
			}
		} while (choice != 3);
		
		inputScanner.close();
	}
}
