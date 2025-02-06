package week3.extra;
import java.util.Scanner;
public class NumberClassifier {
    /**
     * Asks the user for how many numbers to classify then uses 
     * for loop to take input and classify if the number is even or 
     * odd using {@link #evenOdd(int)} method
     */
    static void userInput(){
        Scanner con = new Scanner(System.in);
        System.out.print("How many numbers (0 or less to exit): ");
        int noOfNumbers = con.nextInt();
        for (int i = 0; i < noOfNumbers; i++) {
            System.out.printf("Number %d: ", i+1);
            int num = con.nextInt();
            System.out.println(num+" is "+evenOdd(num));
        }
        System.out.println("Exiting..");
        con.close();
    }
    /**
     * Finds if the input number is even or odd using % operator
     * @param num An integer
     * @return "Even" for even integer else returns "Odd"
     */
    static String evenOdd(int num) {
        switch (num % 2){
            case 0:
                return "Even";
            case 1:
                return "Odd";
            default:
                return "Error";
        }
    }
    public static void main(String[] args) {
        userInput();
    }
}
