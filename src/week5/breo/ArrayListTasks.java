package week5.breo;
import java.util.ArrayList;
/**
 * Has a main function testing out basic actions on an {@link ArrayList}.
 * Also a method {@link #quickSort(ArrayList, int, int) Quick Sort} for sortings
 * a <code>ArrayList&lt;String&gt;</code> 
 */
public class ArrayListTasks {
    /**
     * Testing the basic actions on ArrayList like adding, removing, updating and displaying elements
     * Also sorting the ArrayList alphabetically using {@link #quickSort(ArrayList, int, int) quickSort}
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        // Adding to elements
        students.add("Milan");
        students.add("Dante");
        students.add("Rohan");
        students.add("Guts");
        // Removing element at index 3 i.e. "Guts"
        students.remove(3);
        // Updateing element at index 2 to be Carl
        students.set(2, "Carl");
        // Printing the elements of the ArrayList using for-each loop
        for (String s: students){
            System.out.println(s);
        }
        // Sorting the arraylist alphabetically
        quickSort(students, 0, students.size() - 1);
        for (String s: students){
            System.out.println(s);
        }
        
    }
    /**
     * Sorting a {@link ArrayList ArrayList&lt; String&gt;} alphabetically
     * @param array
     * @param low The index of the first element, usually 0
     * @param high The index of the last element to sort, usually array.size() - 1
     */
    public static void quickSort(ArrayList<String> array, int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);
			quickSort(array, low, pi-1);
			quickSort(array, pi +1, high);
		}
	}
	/**
     * Helper method for {@link #quickSort(ArrayList, int, int) quickSort}.
     * Divides the array into two half around a pivot where the elements in the front
     *  are smaller than the pivot and the elements after are greater
     * @param array
     * @param low
     * @param high
     * @return
     */
	static int partition(ArrayList<String> array, int low, int high) {
		String pivot = array.get(high);
		int i = low -1;
		String temp;
		for (int j = low; j <=high -1; j++) {
			if(array.get(j).compareTo(pivot) < 0) {
				i++;
				temp = array.get(i);
				array.set(i, array.get(j));
				array.set(j, temp);
			}
		}
		
		temp = array.get(i+1);
		array.set(i+1, array.get(high));
		array.set(high, temp);
		return i +1;
	}
}
