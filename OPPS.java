import java.util.*;

public class OPPS {


    public static class Student{
        String name;
        int rno;
        double percentage;
    }

public static void main(String[] args) {
  
    Student x = new Student();

      Scanner  sc = new   Scanner(System.in);
    x.name=sc.next();
    x.rno=10;
    x.percentage=96.05;

    System.out.println(x.name+" "+x.rno+" "+x.percentage);
    
}

    
}
