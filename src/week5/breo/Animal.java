package week5.breo;

public class Animal {
    protected String name;
    
    protected void makeSound(){
        System.out.println("UwwwU");
    }

    protected Animal(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Dog a1 = new Dog("Goofy");
        a1.bark();
        a1.makeSound();
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public void bark(){
        System.out.println("Meow");
    }
}
