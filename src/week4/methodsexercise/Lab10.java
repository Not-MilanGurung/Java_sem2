package week4.methodsexercise;

public class Lab10 {
   
    static abstract class Animal{
        abstract void makeSound();
    }

    static class Dog extends Animal{
        public void makeSound(){
            System.out.println("Woof");
        }
    }
    static class Cat extends Animal{
        public void makeSound(){
            System.out.println("Meow");
        }
    }
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        c.makeSound();
        d.makeSound();

    }
}
