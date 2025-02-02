package week3.lab2;
import java.util.Scanner;
import java.util.Random;
import week3.array.QuickSort;

public class LabTab {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		foodArray(input);
//		groupAverage(input);
//		maxMin();
//		attendance(input);
//		matrixMult();
		studentFinder(input);
		input.close();
	}
	
	static void studentFinder(Scanner input) {
		String[] students = {"Vergil", "Adam", "Sam", "Alex", "Heather",
							"Alice", "Tiffany", "Rebecaa", "Sita", "Gia"};
		System.out.print("Enter the name of the student: ");
		String enteredStudent = input.next();
		enteredStudent.toLowerCase();
		String temp = "";
		int i;
		for (i = 0; i < students.length; i++) {
			temp = students[i];
			if (temp.toLowerCase().equals(enteredStudent.toLowerCase())) {
				System.out.println("The "+enteredStudent +" is in the list at index "+i);
				break;
			}
		}
		if (i == students.length) 
			System.out.println(enteredStudent+" Not in the list");
		
	}
	
	static void matrixMult() {
		int[][] mat1 = {{1 ,2 ,3}, {2 ,5, 6}, {32, 543, 21}};
		int[][] mat2 = {{34 ,45, 63}, {22 ,45, 66}, {2, 43, 281}};
		int[][] res = new int[3][3];
		System.out.println("Matrix 1:");
			displayMatrix(mat1);
		System.out.println("Matrix 2:");
			displayMatrix(mat2);	
		// mat1 * mat2
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j< 3; j++) {
				res[i][j] = mat1[i][0] * mat2[0][j] +
							mat1[i][1] * mat2[1][j] +
							mat1[i][2] * mat2[2][j] ;
			}
		}
		
		System.out.println("Result:");
		displayMatrix(res);
	}
	
	static void displayMatrix(int[][] mat) {
		for(int[] x : mat) {
			for(int i : x) {
				System.out.print("\t"+i);
			}
			System.out.print("\n");
		}
	}
	
	static void attendance(Scanner input) {
		String[] students = {"Trisha", "Malishia", "John", "Trevor", "Dante"};
		boolean[] attendance = new boolean[5];
		System.out.println("Enter 1 for present and 0 or anyother no. for absent:");
		int i = 0;
		for(String s : students) {
			System.out.print(s+" : ");
			attendance[i] = input.nextInt() == 1 ? true : false;
			i++;
		}
		System.out.println("You entered: ");
		String att = "";
		for(i = 0; i < 5; i++) {
			if (attendance[i]) att = "Present";
			else att = "Absent";
			
			System.out.println("Name: "+students[i]+" - "+att);
		}
	}
	
	static void maxMin() {
		Random seed = new Random();
		int[] array = new int[7];
		for(int i = 0; i < 7; i++) {
			array[i] = seed.nextInt(1, 50);
		}
		System.out.println("The generated array:");
		for(int j: array) {
			System.out.println(j);
		}
		QuickSort.quickSort(array, 0, array.length - 1);
		int min = array[0];
		int max = array[array.length-1];
		
		System.out.println("The maximum is "+max+" and the minimum is "+min);
		
	}
	
	static void groupAverage(Scanner input) {
		int[] scores = new int[5];
		double avg = 0;
		System.out.println("Enter scores of 5 members:");
		for(int i = 0; i < 5; i++) {
			System.out.print("Member "+((int)(i+1))+"= ");
			scores[i] = input.nextInt();
			avg += scores[i];
		}
		
		avg = avg/5;
		System.out.println("The average score is "+avg);
		System.out.println("The scores above average are:");
		for(int i : scores) {
			if (i > avg)
			System.out.println(i);
		}
		
	}
	
	
	
	static void foodArray(Scanner input) {
		String[] foods = new String[5];
		System.out.println("Enter you 5 favorite foods:");
		for(int i = 0; i < 5; i++) {
			System.out.print("Food no. "+i+"= ");
			foods[i] = input.next();
		}
		System.out.println("Reverse order: ");
		for(int i = foods.length-1; i > -1; i--) {
			System.out.println("Food: "+foods[i]);
		}
	}
}
