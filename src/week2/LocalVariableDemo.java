package week2;

public class LocalVariableDemo {

	public static void main(String[] args) {
		calculateSquare(4);
		// Local variable sq can no longer be accessed
	}
	
	static void calculateSquare(int a) {
		int sq = a * a;
		System.out.println("The square is "+a+" is "+sq);
	}

}
