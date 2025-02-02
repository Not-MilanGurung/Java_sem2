package week2;
import java.util.Scanner;
import java.lang.Exception;
public class Marks {

	private int firstAssement, secondAssement;
	private float result;
	
	public Marks(int firstAssement, int secondAssement) throws Exception {
		if (firstAssement < 0 || secondAssement < 0) {
			throw new Exception("Invalid parameter for construction");
		}
		this.firstAssement = firstAssement;
		this.secondAssement = secondAssement;
	}
	
	public float calculate() {
		this.result = this.firstAssement * 0.3f + this.secondAssement * 0.7f;
		return this.result;
	}
	

	
	public static void main(String[] args) throws Exception {
		int a[] = new int[4];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Marks - PoP: ");
		a[0] = input.nextInt();
		a[1] = input.nextInt();
		Marks PoP = new Marks(a[0], a[1]);
		
		System.out.print("Enter Marks - DCN: ");
		a[2] = input.nextInt();
		a[3] = input.nextInt();
		Marks DCN = new Marks(a[2], a[3]);
		
		System.out.println("Result PoP: "+PoP.calculate());
		System.out.println("Result DCN: "+DCN.calculate());
		
		input.close();
	}

}
