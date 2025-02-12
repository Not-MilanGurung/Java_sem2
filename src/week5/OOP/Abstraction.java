package week5.OOP;

abstract class Shape{
    abstract double calculateArea();

    void displayShape(){
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape{
    double width;
    double height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    double calculateArea(){
        return this.width * this.height;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return  this.radius * this.radius * Math.PI;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle(2);
        Shape s2 = new Rectangle(2.4, 4.5);
        double areaOfCircle = s1.calculateArea();
        double areaOfRectangel = s2.calculateArea();
        s1.displayShape();
        s2.displayShape();
        System.out.println("Area of circle: "+areaOfCircle);
        System.out.println("Area of rectangle: "+areaOfRectangel);
    }
}
