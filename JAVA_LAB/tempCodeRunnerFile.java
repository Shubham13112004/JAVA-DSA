import java.util.*;

class Course{
   
    private static int id = 1001;


    
    private int courseId;
    private  String courseName;
    private  String instructor;
    private  int durationWeeks;

    
    Course(){
        this.courseId=id++;
        this.courseName = "DBMS";
        this.instructor = "Tarak Meheta";
        this.durationWeeks = 4;
    }

   
    Course(String courseName, String instructor, int durationWeeks) {
        this.courseId = id++;
        this.courseName = courseName;
        this.instructor = instructor;
        this.durationWeeks = durationWeeks;
    }

    
    void displayCourse() {
        System.out.println("Course ID     : " + courseId);
        System.out.println("Course Name   : " + courseName);
        System.out.println("Instructor    : " + instructor);
        System.out.println("Duration      : " + durationWeeks + " weeks");
        System.out.println("_____________________________________________________________");
     
    }
}

public class Lab_2{
    public static void main(String[] args) {

        System.out.println("Name :- Shubham Desai");
        System.out.println("Rno:- IT3109");
        System.out.println("==============================");
      
        Course c1 = new Course();

       
        Course c2 = new Course("Java Programming", "Mr. Sharma", 6);
        Course c3 = new Course("Web Development", "Ms. Kapoor", 8);
        Course c4 = new Course("Mern stack","Siddhesh",4);
        Course c5 = new Course("c","Mangesh",2);
        Course c6 = new Course("def","Mangesdvh",4);
        c1.displayCourse();
        c2.displayCourse();
        c3.displayCourse();
        c4.displayCourse();
        c5.displayCourse();
        c6.displayCourse();

    }
}
