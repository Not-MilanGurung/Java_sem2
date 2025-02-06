package week3.breo.practical;

public class StudentManagementSystem {
    private int studentID;
    private char grade;
    private String name;

    public StudentManagementSystem(int studentID, String name, char grade){
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    public void updateGrade(char grade){
        this.grade = grade;
    }

    public void displayInfo(){
        System.out.println("Student's info");
        System.out.println("ID: "+this.studentID);
        System.out.println("Name: "+this.name);
        System.out.println("Grade: "+this.grade);
    }

    public void finalize(){
        System.out.println("Garbage cleaned");
    }

    public static void main(String[] args) {
        StudentManagementSystem s1 = new StudentManagementSystem(12, "Perry The Platupus", 'S');
        s1.displayInfo();
        s1.updateGrade('F');
        s1.displayInfo();
        s1 = null; // Unreferencing the object to signal for garbage collection
        System.gc(); // Calling the garbage collector
    }
}
