package week3.extra;
import java.util.Scanner;
public class PrimeChecker {
    /**
     * Finds if the input number is prime
     * @param num
     * @return True if number is prime, false otherwise
     */
    static boolean isPrime(int num){
        if (num == 0 || num == 1) return false;
        if (num == 2) return true;
        for(int i = 2; i < num/2; i++){
            if (num%i == 0) return false;
        }
        return true;
    }
    /**
     * Asks user for a integer input and prints if it is prime or not using {@link #isPrime(int)}
     * @param args Default input args
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        switch (isPrime(num)) {
            case true:
                System.out.println(num+" is prime");
                break;
        
            case false:
                System.out.println(num+" is not prime");
        }

        input.close();
    }
        
}
