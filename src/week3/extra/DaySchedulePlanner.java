package week3.extra;
import java.util.ArrayList;
import java.util.Scanner;
public class DaySchedulePlanner {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);

        ArrayList<ArrayList<ArrayList<String>>> events = new ArrayList<>();
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
        String[] timeOfDay = {"Morning", "Afternoon", "Evening"};

        for(int i = 0; i < 7; i++){

            System.out.println("Enter the plans for "+days[i]);
            System.out.print("How many events: ");
            int noEvents = con.nextInt();

            ArrayList<String> morning = new ArrayList<>();
            ArrayList<String> afternoon = new ArrayList<>();
            ArrayList<String> evening = new ArrayList<>();

            for(int j = 0; j < noEvents; j++){
                System.out.print("Enter the name of the event: ");
                con.nextLine();
                String event = con.nextLine();
                
                System.out.print("Enter time of day: 1)Morning 2)Afternoon 3)Evening : ");
                switch (con.nextInt()) {
                    case 1:
                        morning.add(event);
                        break;
                    case 2:
                        afternoon.add(event);
                        break;
                    case 3:
                        evening.add(event);
                        break;
                    default:
                        System.out.println("Invalid input try again");
                        continue;
                }
            }
            ArrayList<ArrayList<String>> allEvents = new ArrayList<>();
            allEvents.add(morning);
            allEvents.add(afternoon);
            allEvents.add(evening);

            events.add(allEvents);
        }
        System.out.println("\n Your events are: ");
        for(int i = 0; i < 7; i++){
            System.out.println("Events for "+days[i]);
            int j = 0;
            for(ArrayList<String> time : events.get(i)){
                System.out.println("Time: "+timeOfDay[j]);
                for(String event : time){
                    System.out.println("Event name: "+event);
                }
                if (time.isEmpty()){
                    System.out.println("No events");
                }
                j++;
                System.out.println("Enter any key to continue");
                con.nextLine();
            }
            System.out.println("\n");
        }
        con.close();
    }
}
