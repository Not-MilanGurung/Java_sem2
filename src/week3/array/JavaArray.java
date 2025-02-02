package week3.array;
import java.util.HashSet;
import java.util.Set;
public class JavaArray {

	public static void main(String[] args) {
		scores();
		colours();
		food();
	}
	
	static void scores() {
		int[] scores = {1, 45, 23, 42, 5435, 564, 54,7838};
		int[] rev = reverse(scores);
		QuickSort.quickSort(rev, 0, rev.length-1);
		int[] evenOdd = evenOdd(scores);
		System.out.println("There are "+evenOdd[0] +" even numbers and "+evenOdd[1]+" odd numbers");
		for (int i : rev) {
			System.out.println("Score: "+i);
		}
		System.out.println("Does 22 exist in the array?: "+inArray(rev, 22));
		
		
	}
	
	static void colours() {
		String[] colours = {"navy blue", "magenta", "purple"};
		
		for (String c : colours) {
			System.out.println("Colours : "+ c);
		}
	}
	
	static void food() {
		String[] foods = {"paneer", "potatoes", "banana", "paneer","eggs", "red beans"};
		duplicate(foods);
		for (String c : foods) {
			System.out.println("Food : "+ c);
		}
	}
	
	static int[] reverse(int[] array) {
		int[] out = new int[array.length];
		int j = 0;
		for (int i = array.length -1; i > -1; i--) {
			out[j] = array[i];
			j++;
		}
		
		return out;
	}
	
	static boolean inArray(int[] array, int num) {
		for(int i : array) {
			if(i == num) return true;
		}
		return false;
	}
	
	static void duplicate(String[] s) {
		Set<String> set = new HashSet<>();
		for(String i : s) {
			if (!set.add(i)) {
				System.out.println("Duplicate: "+i);
			}
		}
	}
	/*
	 * Takes an integer array as input and returns the count of even and odd numbers
	 * Of the returned array, index 0 is even count and index 1 is odd count 
	 */
	static int[] evenOdd(int[] arr) {
		int even = 0, odd = 0;
		for(int i : arr) {
			if (i%2 == 0) even++;
			else odd++;
		}
		int[] out = {even, odd};
		return out;
	}
	
	

}
