package week2.java_data_types_tasks;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int scores[] = new int[5];
		float average = 0;
		System.out.print("Enter the scores of 5 subjects(int): ");
		for (int a= 0; a <5; a++) {
			scores[a] = i.nextInt();
			average += (float) scores[a];
		}
		average /= 5;
		System.out.print("Scores: ");
		for (int a : scores) {
			System.out.print(a+", ");
		}
		
		System.out.println("\nAverage score: "+average);
		
		i.close();
	}

}
