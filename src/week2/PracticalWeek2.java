package week2;
import java.util.Scanner;
public class PracticalWeek2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//CheckMinimumAge.run(input);
		//MaximumOfTwoNumbers.run(input);
		//ValidatePasswordLength.run(input, 12, 32);
		//DeterminePassFail.run(input);
//		OddEven.run(input);
//		WeekdayOrWeekend.run(input);
//		DiscoutBasedonMembership.run(input);
//		CompareAges.run(input);
//		ShippingCostCalculator.run(input);
		input.close();
	}

}

class ShippingCostCalculator{
	static void run(Scanner input) {
		double packageWeight;
		System.out.print("Enter the weight of the package in kgs: ");
		packageWeight = input.nextDouble();
		int cost = calculateShippingCost(packageWeight);
		System.out.println("The shipping cost for package of mass "+packageWeight+" is Rs."+cost);
	}
	
	static int calculateShippingCost(double weight) {
		if (weight <= 0.0) return 0;
		else if (weight <= 5.0) return 300;
		else if (weight <= 10.0) return 600;
		else return 1000;
	}
}

class CompareAges {
	static void run(Scanner input) {
		int age1, age2;
		do {
			System.out.print("Enter two ages(positive integers): ");
			age1 = input.nextInt();
			age2 = input.nextInt();
		} while (age1 < 0 || age2 < 0);
		int older = olderAge(age1, age2);
		System.out.println("The older age among them is "+older);
	}
	
	static int olderAge(int age1, int age2) {
		if (age1 > age2) return age1;
		else return age2;
	}
}

class DiscoutBasedonMembership {
	static void run(Scanner input) {
		System.out.print("Enter membership type: ");
		String membership = input.next();
		int discount = calculateDiscount(membership);
		System.out.println(membership+" recive a discount of "+discount+"%");
	}
	
	static int calculateDiscount(String member) {
		if (member.toLowerCase().equals("gold")) return 20;
		else if (member.toLowerCase().equals("silver")) return 10;
		else if (member.toLowerCase().equals("bronze")) return 5;
		else return 0;
	}
}

class WeekdayOrWeekend {
	static void run(Scanner input) {
		System.out.print("Enter the day(Sunday, Tuesday, etc): ");
		String day = input.next();
		System.out.println("Is it the weekend?: "+isWeekend(day));
	}
	
	static boolean isWeekend(String day) {
		day.toLowerCase();
		if (day.compareTo("sunday") == 0 || day.compareTo("saturday") == 0 ) return true;
		else return false;
	}
}

class OddEven {
	static void run(Scanner input) {
		int num;
		System.out.print("Enter an integer: ");
		num = input.nextInt();
		System.out.println("Is the "+num+" even?: "+isEven(num));
	}
	
	static boolean isEven(int num) {
		if (num % 2 == 0) return true;
		else return false;
	}
}

class DeterminePassFail {
	private static final int PASSMARKS = 50;
	static void run(Scanner input) {
		int score;
		while(true) {
			System.out.print("Enter the score(0-100): ");
			score = input.nextInt();
			if(-1 < score && score < 101) break;
			System.out.println("Invalid score");
		}
		
		System.out.println("Has the student passed? : "+isPass(score));
	}
	
	static boolean isPass(int score) {
		if(score >= PASSMARKS) return true;
		else return false;
	}
}

class CheckMinimumAge{
	static void run(Scanner input) {
		int age, minimumAge;
		System.out.print("Enter the age and the mininmumage: ");
		age = input.nextInt();
		minimumAge = input.nextInt();
		System.out.println("Is the person at least "+minimumAge+" ?: "+isAtLeastAge(age, minimumAge));
	}
	
	static boolean isAtLeastAge(int age, int minimumAge) {
		if (age < minimumAge) return false;
		else return true;
	}
}

class MaximumOfTwoNumbers {
	static void run(Scanner input) {
		int a, b;
		System.out.print("Enter two numbers: ");
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("The maximum number is "+findMax(a, b));
	}
	
	static int findMax(int a, int b) {
		if (a > b) return a;
		else return b;
	}
}

class ValidatePasswordLength {
	static void run(Scanner input, int minimumLength, int maximumLength) {
		String password;
		System.out.print("Enter the password: ");
		password = input.nextLine();
		System.out.println("Is the password a valid length? :"+
		isValidPasswordLength(password, minimumLength, maximumLength));
	}
	
	static boolean isValidPasswordLength(String pass, int min, int max) {
		if (pass.length() >= min && pass.length() <= max) return true;
		else return false;
	}
}