package week3.extra;
import java.util.Scanner;

public class SimpleQuiz {
    public static void main(String[] args) {
        try{
            quiz();
        }
        catch (NumberFormatException e){
            System.out.println("e");
        }
    }
    
    static void quiz() throws NumberFormatException{
        String[][] quiz = {
            {"In Devil May Cry, Vergil is Dante's:", "1)Father", "2)Brother", "3)Uncle", "3"},
            {"In Devil May Cry, Who is Nero's father? :", "1)Dante", "2)Vergil", "3)Mundas", "2"},
            {"In Dark Souls 2, How many small pigs can be found in Majula?: ", "1)5", "2)3", "3)4", "2"}
        };

        Scanner con = new Scanner(System.in);
        System.out.println("Welcome to quiz:");
        for(int i = 0; i < quiz.length; i++){
            System.out.println(quiz[i][0]);
            for (int j = 0; j < 3; j++){
                System.out.println(quiz[i][j+1]);
            }
            System.out.print("Answer: ");
            switch (con.next().equals(quiz[i][4])) {
                case true:
                    System.out.println("Right answer");
                    break;
                default:
                    System.out.println("Wrong answer! \n The right answer is "+quiz[i][4]);
                    break;
            }
            System.out.println();
        }
        con.close();
    }
}
