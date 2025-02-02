package week3.breo.switchstatement;
import java.util.Scanner;
public class Ex3_SimpleVendingMachine {
    /**
     * <h3>Simple Vending Machine </h3>
     * Takes a integer input from console and prints the name and price of corresponding item
     * 
     * @param args Default main function arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] items = {"Water 1 Ltrs", "Soda 250ml", "Soda 500ml", "Energy Drink 250ml"};
        System.out.println("Enter the no. corresponding the item:");
        for (int i = 1; i <= items.length; i++){
            System.out.println(i+")"+items[i-1]);
        }
        System.out.print("Choice: ");
        int choice = input.nextInt();
        String item;
        int price;
        switch (choice) {
            case 1:
                item = items[0];
                price = 25;
                break;
            case 2:
                item = items[1];
                price = 40;
                break;
            case 3:
                item = items[2];
                price = 90;
                break;
            case 4:
                item = items[3];
                price = 80;
                break;
            default:
                item = "Invalid input. You get nothing";
                price = 0;
                break;
        }
        System.out.println("You got: "+item);
        System.out.println("The price is Rs"+price);
        input.close();
    }
}
