package week1.practical_tasks;
import java.util.Scanner;

public class HoursToSeconds {
	static double hours, seconds;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of hours: ");
		hours = input.nextDouble();
		seconds = hours * 3600;
		System.out.println("The no. of seconds in "+hours+" hours is "+seconds);
		input.close();
	}
}
