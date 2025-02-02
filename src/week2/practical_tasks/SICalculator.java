package week2.practical_tasks;
import java.util.Scanner;

/**
 * Calculates simple interest
 * @param principal Principal amount
 * @param rate in percentage
 * @param time in years
 */
public class SICalculator {

	public static void main(String[] args) {
		double principal, rate, time, interest;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the principal amount, rate in % and time in years: ");
		principal = input.nextDouble();
		rate = input.nextDouble();
		time = input.nextDouble();
		
		interest = (principal * rate * time) / 100;
		
		System.out.println("The acquired simple interest is "+interest);
		input.close();
	}

}
