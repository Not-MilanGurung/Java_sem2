package week3.breo.forloops;
import java.util.Scanner;

public class Ex3_MultiplicationTable {
    /**
     * Takes a integer input from a Scanner object and prints its muliplication table up to 10 
     * using for loop
     * @param args Default main function args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = input.nextInt();
        System.out.println("Its muliplication table is ");
        for (int i = 1; i < 11; i++){
            System.out.println(i+" x "+n+" = "+i*n);
        }
        input.close();
    }
}
