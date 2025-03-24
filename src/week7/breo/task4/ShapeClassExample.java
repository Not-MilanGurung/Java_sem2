package week7.breo.task4;

class Shape {
    double calculateArea(int side) {  // Overloaded method for Square
        return side * side;
    }

    double calculateArea(int length, int breadth) {  // Overloaded method for Rectangle
        return length * breadth;
    }

    double calculateArea(double radius) {  // Overloaded method for Circle
        return 3.1416 * radius * radius;
    }
}

class Square extends Shape {
    @Override
    double calculateArea(int side) {  // Overridden method
        return side * side;
    }
}

class Rectangle extends Shape {
    @Override
    double calculateArea(int length, int breadth) {  // Overridden method
        return length * breadth;
    }
}

class Circle extends Shape {
    @Override
    double calculateArea(double radius) {  // Overridden method
        return 3.1416 * radius * radius;
    }
}

public class ShapeClassExample {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of Square (Overloading): " + shape.calculateArea(4));
        System.out.println("Area of Rectangle (Overloading): " + shape.calculateArea(4, 5));
        System.out.println("Area of Circle (Overloading): " + shape.calculateArea(3.0));

        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        System.out.println("Area of Square (Overriding): " + square.calculateArea(4));
        System.out.println("Area of Rectangle (Overriding): " + rectangle.calculateArea(4, 5));
        System.out.println("Area of Circle (Overriding): " + circle.calculateArea(3.0));
    }
}
