package week4.methodsexercise;

public class Lab3 {
    static int square(int num){
        return num * num;
    }

    public static void main(String[] args) {
        int num = 5;
        int sq = square(num);
        System.out.printf("The square of %d is %d \n",num, sq);
    }
}
