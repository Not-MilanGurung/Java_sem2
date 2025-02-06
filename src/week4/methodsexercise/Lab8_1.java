package week4.methodsexercise;

public class Lab8_1 {
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.printf("The sum of %d and %d is %d\n",5,6,add(5,6));
        System.out.printf("The sum of %d, %d and %d is %d\n",5,6,8,add(5,6,8));
    }
}
