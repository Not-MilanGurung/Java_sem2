package week3.array;

public class QuickSort {
	/**
	 * 
	 * @param array reference to the array
	 * @param low first element to be sorted, usually 0
	 * @param high last element to be sorted, usually array.length-1
	 */
	public static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);
			quickSort(array, low, pi-1);
			quickSort(array, pi +1, high);
		}
	}
	
	static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low -1;
		int temp;
		for (int j = low; j <=high -1; j++) {
			if(array[j] < pivot) {
				i++;
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		return i +1;
	}
}
