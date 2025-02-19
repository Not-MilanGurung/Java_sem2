package week5.breo;

class Person{
    Person(){
        System.out.println("Person is created");
    }
}

public class Student extends Person {
    public Student(){
        super();
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
    }
}
