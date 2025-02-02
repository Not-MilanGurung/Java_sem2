package week2.practical_tasks;
import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l, b, area;
		System.out.print("Enter the length and breadth: ");
		l = input.nextInt();
		b = input.nextInt();
		area = l * b;
		System.out.println("The area is "+area);
		input.close();
	}
}
