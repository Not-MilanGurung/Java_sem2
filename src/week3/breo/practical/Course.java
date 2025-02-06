package week3.breo.practical;

public class Course {
    private int courseID, maxStudents, currentStudents;
    private String courseName;

    public Course(int courseID, String courseName, int maxStudents){
        this.courseID = courseID;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
    }

    public boolean enroll(int numberOfStudents){
        if (currentStudents + numberOfStudents > maxStudents){
            System.out.println("Not enough available seats");
            return false;
        }
        currentStudents += numberOfStudents;
        return true;
    }

    public void removeStudents(int numberOfStudents){
        if (numberOfStudents > currentStudents){
            System.out.println("Removing more students than current no. of students.\n Setting"+ 
                            "Current student count as Zero");
            this.currentStudents = 0;
        }
        else
            this.currentStudents -= numberOfStudents;
    }

    public void displayDetails(){
        System.out.println("Course details:"+
                            "\nID: "+courseID+
                            "\nName: "+courseName+
                            "\nMax students: "+maxStudents+
                            "\nCurrent students: "+currentStudents);
    }

    public static void main(String[] args) {
        Course math = new Course(1, "Maths", 45);
        math.enroll(55);
        math.displayDetails();
        math.enroll(32);
        math.displayDetails();
        math.removeStudents(12);
        math.displayDetails();
        math.removeStudents(34);
        math.displayDetails();
    }
}
