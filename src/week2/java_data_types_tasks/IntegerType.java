package week2.java_data_types_tasks;
import java.util.Scanner;

public class IntegerType {
	int age, dob, currentYear;
	public static void main(String[] args) {
		IntegerType a = new IntegerType();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age, and current year(whole number): ");
		a.age = input.nextInt();
		a.currentYear = input.nextInt();
		a.dob = a.currentYear - a.age;
		
		System.out.println("Age: "+a.age);
		System.out.println("Year of birth: "+a.dob);
		System.out.println("Current year: "+a.currentYear);
		
		next10Years(a.age);
		input.close();
	}
	
	static void next10Years(int age) {
		int ageIn10 = age + 10;
		System.out.println("Age in 10 years: "+ageIn10);
	}

}
