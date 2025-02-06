package week4.methodsexercise;

public class Lab5 {
    static int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        int a = 11;
        int b = 421;
        int mul = multiply(a, b);
        System.out.printf("%d x %d is %d\n",a, b, mul);
    }
}
