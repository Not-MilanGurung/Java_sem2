package week4.methodsexercise;

public class Lab7 {
    static void calculateArea(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of circle with radius "+radius+" is "+area);
    }
    public static void main(String[] args) {
        calculateArea(4.7);
    }
}
