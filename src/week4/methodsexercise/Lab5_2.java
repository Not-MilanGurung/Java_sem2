package week4.methodsexercise;

public class Lab5_2 {
    static int max(int a, int b, int c){
        if (a > b){
            if ( a > c) return a;
            else return c;
        }
        else{
            if (b > c) return b;
            else return c;
        }
    }

    public static void main(String[] args) {
        int[] arr = {23, 53, 52};
        int max = max(arr[0], arr[1], arr[2]);
        System.out.printf("The greates between %d %d and %d is %d\n",arr[0],arr[1],arr[2],max);
    }
}
