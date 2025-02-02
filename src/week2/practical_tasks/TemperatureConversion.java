package week2.practical_tasks;
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		double fahrenheit, celsius;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		fahrenheit = input.nextDouble();
		celsius = (fahrenheit - 32.0) * (5.0/9.0);
		System.out.println("The temperature in celsius is "+celsius);
		input.close();
	}

}
