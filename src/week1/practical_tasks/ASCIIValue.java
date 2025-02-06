package week1.practical_tasks;
import java.util.Scanner;
public class ASCIIValue {

	public static void main(String[] args) {
		char c;
		int i;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII character: ");
		c = input.next().charAt(0);
		i = (int) c;
		System.out.println("The ASCII of "+c+" is "+i);
		input.close();
	}

}
