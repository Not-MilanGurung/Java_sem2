package week4.methodsexercise;

public class Lab4_1 {
    static class Rectangle{
        double length, width;

        void calculateArea(){
            double area = length * width;
            System.out.println("The area of this rectangle is "+area);
        }

        public Rectangle(int length, int width){
            this.length = length;
            this.width = width;
        }
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(23, 7);
        rec1.calculateArea();
    }
}

