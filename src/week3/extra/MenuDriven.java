package week3.extra;
import java.util.Scanner;
public class MenuDriven {
    /**
     * A menu using switch that asks user for the print pattern 
     * @param args Default arguments parameter
     */
    public static void main(String[] args) {
        Scanner inu = new Scanner(System.in);
        int choice;
        System.out.println("Enter the no. corresponding the choice: ");
        System.out.println("1)Square");
        System.out.println("2)Number Triangle of numbers");
        System.out.println("3)Reverse Triangle of numbers");
        System.out.println("4)Tree");
        System.out.print("Choice: ");
        choice = inu.nextInt();
        switch (choice) {
            case 1:
                square(10);
                break;
            case 2:
                numberTriangle(10, false);
                break;
            case 3:
                numberTriangle(10, true);
                break;
            case 4:
                tree(10, 4);
                break;
            default:
                System.out.println("Invalid choice:");
                break;
        }
        System.out.println("Exiting...");
        inu.close();
    }
    /**
     * Prints a square with sides made up of 'x'
     * @param sideLength Length of a side
     */
    static void square(int sideLength){
        for (int i = 0; i < sideLength; i++){
            if (i == 0 || i == sideLength-1){
                for(int j = 0; j < sideLength; j++)
                    System.out.print("x  ");
            }
            else{
                System.out.print("x");
                for(int j = 0; j < (sideLength-1)*3-1; j++) 
                    System.out.print(" ");
                System.out.print("x");
            }
            System.out.println();
        }
    }
    /**
     * Prints a triangle of numbers in increasing or decreasing order starting from 1
     * @param length Length of the triangle (End)
     * @param reverse Print in decreasing order
     */
    static void numberTriangle(int length,boolean reverse){
        for(int i = 0; i < length+1; i++){
            if (reverse){
                for(int j = 1; j < length + 1 - i; j++){
                    System.out.print(j+" ");
                }
            }
            else {
                for(int j = 1; j < i+1; j++){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Prints a tree to the console made up of 'x' and spaceses
     */
    static void tree(int length, int trunkLength){
        int bump = 0;
        int bumpStep = 5;
        for(int i =1; i < length+1; i++){
            if (i%bumpStep == 0) bump += 5;
            for(int j = (i*2 - bump); j < length*2; j++) System.out.print(" ");
            for(int j = -1 + bump*2; j < i*4-4; j++) System.out.print("x");
            System.out.println();
        }
        for(int i = 0; i < trunkLength; i++){
            for(int j = (2); j < length*2; j++) System.out.print(" ");
            
            System.out.print("x");
            System.out.println();
        }
    }
}
