package week5.OOP;

class Animal{
    void makeSound(){
        System.out.println("Sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal ani = new Animal();
        Dog ani1 = new Dog();
        ani.makeSound();
        ani1.makeSound();
    }
}
