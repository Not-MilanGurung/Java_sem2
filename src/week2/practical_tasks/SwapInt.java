package week2.practical_tasks;

public class SwapInt {
	public static void main(String[] args) {
		int a = 456, b = 12356;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a+" "+b);
	}
}
