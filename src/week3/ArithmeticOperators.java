package week3;
import java.util.Scanner;

public class ArithmeticOperators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, sum, diff, remd;
		float div;
		System.out.print("Enter two integers: ");
		a = input.nextInt();
		b = input.nextInt();
		sum = a+b;
		diff = a -b;
		div = a/b;
		remd = a%b;
		System.out.println(a +" + "+ b +" = "+ sum);
		System.out.println(a +" - "+ b +" = "+ diff);
		System.out.println(a +" / "+ b +" = "+ div);
		System.out.println(a +" mod "+ b +" = "+ remd);
		System.out.println(a +" increment 1 is "+ ++a);
		System.out.println(b +" decrement 1 is "+ --b);
		input.close();
	}
}
