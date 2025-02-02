package week2.practical_tasks;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r, peri, area;
		System.out.print("Enter the radius of the circle: ");
		r = input.nextDouble();
		peri = 2 * Math.PI * r;
		area = Math.PI * r * r;
		System.out.println("The perimeter is "+peri);
		System.out.println("The area is "+ area);
		input.close();
	}
}
