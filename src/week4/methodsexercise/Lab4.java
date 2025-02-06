package week4.methodsexercise;

public class Lab4 {
    static class Calculator{
        void add(int a, int b){
            System.out.printf("The sum of %d and %d is %d\n",a,b,a+b);
        }
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(9, 10);
    }
}
