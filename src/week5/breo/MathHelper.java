package week5.breo;

public class MathHelper {
    public static double square(double num){
        return num * num;
    }

    public static double max(double a, double b){
        if (a > b) return a;
        return b;
    }

    public static void main(String[] args) {
        double num1 = 34.6;
        double num2 = 23.5;
        System.out.printf("The square of %f is %f\n",num1, square(num1));
        System.out.printf("The greatest amond %f and %f is %f\n",num1, num2, max(num1, num2));
    }
}
