package week3.extra;
import java.util.Scanner;
public class StudentScore {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.print("How many scores? : ");
        int noOfScores = con.nextInt();
        for (int i = 0; i < noOfScores; i++){
            userInput(con);
        }
        con.close();
    }
    /**
     * Uses a scanner object to take a score as input
     * @param con Scanner object
     */
    static void userInput(Scanner con){
        System.out.print("Enter the score: ");
        int score = con.nextInt();
        System.out.println("The grade is "+scoreToGrade(score));
    }
    /**
     * Classifies score to a grade
     * @param score Score ranging 0 - 100
     * @return Grade corresponding to the score
     */
    static char scoreToGrade(int score){
        if (score < 0 || score > 100) {
            System.err.println("Invalid score");
            return '\u0000';
        }
        switch (score / 10) {
            case 4:
                return 'E';
            case 5:
                return 'D';
            case 6:
                return 'C';
            case 7:
                return 'B';
            case 8:
            case 9:
            case 10:
                return 'A';
            default:
                return 'F';
        }
    }
}
