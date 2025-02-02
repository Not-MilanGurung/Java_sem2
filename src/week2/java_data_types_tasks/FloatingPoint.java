package week2.java_data_types_tasks;
import java.util.Scanner;
public class FloatingPoint {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		float radius;
		double area;
		System.out.print("Enter the radius of the circle");
		radius = i.nextFloat();
		
		area = Math.PI * radius * radius;
		
		System.out.println("The area is "+area);
		i.close();
		
	}

}
