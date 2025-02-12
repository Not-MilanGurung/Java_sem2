package week5.OOP;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}

    public void setAge(int age){
        if (age < 1 || age > 120)
            System.err.println("Invlid age");
        else
            this.age = age;
    }
    public int getAge(){return this.age;}
}

public class Encapsulation{
    public void main (String args[]){
        Person p1 = new Person("Harry", 34);
        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getAge());
        p1.setAge(45);
        p1.setName("Allen");
        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getAge());
        p1.setAge(-1);
    }
}