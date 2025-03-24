package week7.breo.task2;

public class Calculator {
	public static int add(int a, int b) {return a + b;}
	public static int add(int a, int b, int c) {return a + b + c;}
	public static double add(double a, double b) {return a + b;}

	public static void main(String[] args) {
		int sum = add(5, 6);
		System.out.println(sum);
		sum = add(13, 54, 65);
		System.out.println(sum);
		double sUm = add(0.5, 0.6);
		System.out.println(sUm);
	}
}
