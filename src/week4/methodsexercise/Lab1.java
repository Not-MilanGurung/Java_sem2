package week4.methodsexercise;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("In upper case: "+s.toUpperCase());
        System.out.println("It's length is "+s.length());
        try{
            System.out.println("A substring from the string : "+s.substring(3,8));
        }
        catch (Exception e){
            System.err.println(e);
        }
        System.out.println("The string with 'e' replaced by 'z' : "+s.replace('e', 'z'));
        input.close();
    }
}
