package week3.extra;
import java.util.Scanner;
public class AgeClassifier {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.print("How many ages to classify(no.): ");
        int num = con.nextInt();
        for (int i = 0; i < num; i++){
            System.out.print("Enter age: ");
            int age = con.nextInt();
            classify(age);
            System.out.println();
        }
        con.close();
    }
    static void classify(int age){
        switch (age/10) {
            case 0,1:
                System.out.println(age+" is in Childern Group");
                break;
            case 2:
                System.out.println(age+" is in Teenager Group");
                break;
            case 3,4,5:
                System.out.println(age+" is in Adult Group");
                break;
            case 6,7,8,9,10,11:
                System.out.println(age+" is in Senior Group");
            default:
                System.err.println("Invalid age");
        }
    }    
}
