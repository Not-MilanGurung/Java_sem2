package week3.breo.switchstatement;
import java.util.Scanner;
public class Ex2_MonthToSeason{
    /**
     * Takes gregorian calendar months as input and outputs the corresponding 
     * season for the northern hemiesphere.
     * <ul>
     * <li>December to Feburary = Winter</li>
     * <li>March to May = Spring</li>
     * <li>June to August = Summer</li>
     * <li>September to November = Autumn</li>
     * </ul>
     * <br>
     * @param args Default main function args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = input.nextLine().toLowerCase();
        String season;

        switch (month) {
            case "december":
            case "january":
            case "feburary":
                season = "Winter";
                break;
            case "march":
            case "april":
            case "may":
                season = "Spring";
                break;
            case "june":
            case "july":
            case "august":
                season = "Summer";
                break;
            case "september":
            case "october":
            case "november":
                season = "Autumn";
            default:
                season = "Not a Geogorian calendar month";
                break;
        }
        System.out.println("The season is: "+season);
        input.close();
    }
}