package week5.breo;

class Parent{
    public static void showMessage(){
        System.out.println("Message from parent");
    }
}

public class Child {
    public static void showMessage(){
        System.out.println("Message from child");
    }

    public static void main(String[] args) {
        Parent.showMessage();
        Child.showMessage();
    }
}
