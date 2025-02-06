package week4.methodsexercise;

public class Lab9 {
    static int factorial(int n){
        if (n == 1 || n == 0) return 1;
        else return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        System.out.println("Factorial of"+ n +"is "+fact);
    }
}
