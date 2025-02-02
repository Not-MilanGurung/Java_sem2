package week2.java_data_types_tasks;
import java.util.Scanner;
public class StringManipulation {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		String name;
		int totalChar;
		System.out.print("Enter your full name :");
		name = i.nextLine();
		totalChar = name.replace(" ", "").length();
		name = name.toUpperCase();
		System.out.println("Total characters (excluding spaces): "+totalChar);
		System.out.println("Name in uppercase: "+name);
		i.close();
	}

}
