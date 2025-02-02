package week3.breo.forloops;
/**
 * Has a public static method that in gives the cout of odd numbers in a array
 */
public class Ex2_OddNumbersInAArray{
    /**
     * Has a sample array to test the {@link #oddNumberCount(int[])} method
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 6, 43, 21, 47}; // Test array
        System.out.println("No. of odd numbers in the array is "+oddNumberCount(array));
    }
    /**
     * 
     * @param arr An array of integers
     * @return The count of odd numbers in the array
     */
    public static int oddNumberCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (i%2==1) count++;
        }
        return count;
    }
}