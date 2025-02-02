package week3.breo.switchstatement;
import java.util.Scanner;
/**
 * Only has the main static method
 */
public class Ex1_TrafficLight {
    /**
     * Initialises a {@link Scanner} object to take input from conlose.
     * Asks to input a colour of traffic light and outputs the 
     * appropriate action
     * 
     * @param args Default args input for main function
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the color of the traffic light: ");
        String light = input.next().toLowerCase(); // Converting the input string to lower case for easy comparism
        String action;
        /**
         * According to users input stored in {@link light}, assign value to {@link action} String
         * "red" = "Stop!"
         * "yellow" = "Ready to go"
         * "green" = "Go"
         * anything else = "Invalid colour"
         */
        switch (light) {
            case "red":
                action = "Stop!";
                break;
            case "yellow":
                action = "Ready to go";
                break;
            case "green":
                action = "Go";
                break;
            default:
                action = "Invalid colour";
                break;
        }

        System.out.println(action);
        input.close();
    }
}