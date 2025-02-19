package week5.breo;

class Shape{
    protected void draw(){
        System.out.println("Drawing a shape");
    }
}

public class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.draw();
        Shape c2 = new Shape();
        c2.draw();
    }
}
