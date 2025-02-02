package week5.breo;
/**
 * Has two static methods for arrays:
 * <ul>
 * <li>{@link #sumAndAverageOfArray(int[])}</li>
 * <li>{@link #shiftArrayElements(int[], int)} </li>
 * </ul>
 */
public class ArrayMethods {
    /**
     * Finds the sum and average of all the elements in a integer array
     * @param array
     * @return array of double where index 0 is sum and index 1 is average
     */
    public static double[] sumAndAverageOfArray(int[] array){
        double sum = 0;
        for (int i: array){
            sum += i;
        }
        double avg = sum/array.length;
        double[] out = {sum, avg};
        return out;
    }
    /**
     * Shifts the elements of an array by the specified amount
     * @param array The array to be shifted
     * @param shift Places to shift; <b>positive for right shift</b> and <b>negative for left shift</b>
     * @return array with the elements shifted 
     */
    public static int[] shiftArrayElements(int[] array, int shift){
        int[] out = new int[array.length];
        for(int i = 0; i < array.length; i++){
            int k = (i+shift) % array.length;
            if (k < 0) k+= array.length; // When the shift is negative
            out[k] = array[i];
        }
        return out;
    }
    /**
     * Testing the class methods
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        double[] res = sumAndAverageOfArray(arr);
        System.out.println("The sum is "+res[0]+" and the average is "+res[1]);

        int[] shifted = shiftArrayElements(arr, 4);
        for(int i: shifted){
            System.out.println(i);
        }
    }
}
