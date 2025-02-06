package week4.methodsexercise;

public class Lab8 {
    class MathOperations{
        static void add(int a, int b){
            int sum = a + b;
            System.out.printf("%d + %d is %d\n",a, b, sum);
        }

        static void add(double a, double b){
            double sum = a + b;
            System.out.printf("%.3f + %.3f is %.4f\n",a,b,sum);
        }
    }
    public static void main(String[] args) {
        MathOperations.add(5, 7);
        MathOperations.add(5.7, 99.3);
    }
}
