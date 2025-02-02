package week3;
//import java.util.Scanner;
import week3.array.QuickSort;
public class JavaMethodCall {
	
	public static void main(String[] args) {
//		System.out.print("Enter the radius of the circle: ");
//		Scanner input = new Scanner(System.in);
//		double radius = input.nextDouble();
//		double area = JavaMethods.areaOfCircle(radius);
//		System.out.println("The area is "+area);
//		input.close();
		int[] arr = {23, 2421, 123, 432, 45432, 342, 342, 324 ,324 , 234};
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println();
		QuickSort.quickSort(arr, 0, 9);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
