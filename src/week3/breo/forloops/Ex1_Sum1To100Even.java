package week3.breo.forloops;
/**
 * Has a main methods that prints the sum of even numbers from 1 to 100
 * @author Milan Gurung
 * @version 1.0
 */
public class Ex1_Sum1To100Even {
    /**
     * Loops from the 1 to 100 and if the numbers mod 2 is 0 then adds the number to the sum
     * Display the result after the loop is completed
     * 
     * @param args Default main function arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++){
            if (i%2 == 0) sum += i;
        }
        System.out.println("The sum of even no. from 1 to 100 inclusive is "+sum);
    }
}
