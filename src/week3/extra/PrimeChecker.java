package week3.extra;
import java.util.Scanner;

enum Tr{
	TRUE, FALSE
}
public class PrimeChecker {
    /**
     * Finds if the input number is prime
     * @param num
     * @return True if number is prime, false otherwise
     */
    static Tr isPrime(int num){
        if (num == 0 || num == 1) return Tr.FALSE;
        if (num == 2) return Tr.TRUE;
        for(int i = 2; i < num/2; i++){
            if (num%i == 0) return Tr.FALSE;
        }
        return Tr.TRUE;
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
            case TRUE:
                System.out.println(num+" is prime");
                break;
        
            case FALSE:
                System.out.println(num+" is not prime");
        }

        input.close();
    }
        
}
