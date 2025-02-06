package week4.methodsexercise;

public class Lab4_2 {
    static class Student{
        String name;
        double marks;

        void displayDetails(){
            System.out.println("Name: "+name);
            System.out.println("Marks: "+marks);
        }

        public Student(String name, double marks){
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Milan", 86.5);
        s1.displayDetails();
    }
}

