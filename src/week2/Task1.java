package week2;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		double length = 0, breadth = 0, area;
		System.out.print("Enter the length and breadth of rectangle: ");
		length = i.nextDouble();
		breadth = i.nextDouble();
		
		area = length * breadth;
		
		System.out.println("The area is "+area);
		i.close();
	}

}
