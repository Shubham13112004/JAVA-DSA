class Person{
    String name; int id;
    Person(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public void displayInfo(){
        System.out.println("Person: "+name+" | ID: "+id);
    }
}

class Student extends Person{
    String course;
    Student(String name,int id,String course){
        super(name,id);this.course=course;
    }
    public void enrollCourse(){
        System.out.println(name+" successfully enrolled in "+course);
    }
  
    public void displayInfo(){
        System.out.println("Student Info");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println(" Course: "+course);
        System.out.println("----------------------------------------");
    }
}

class Faculty extends Person{
    String subject;
    Faculty(String name,int id,String subject){
        super(name,id);this.subject=subject;
    }
    public void gradeStudent(Student s,String grade){
        System.out.println("Faculty "+name+" graded "+s.name+" with "+grade);
    }
  
    public void displayInfo(){
        System.out.println("Faculty Info");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Subject: "+subject);
        System.out.println("----------------------------------------");
    }
}

class AdminStaff extends Person{
    String department;
    AdminStaff(String name,int id,String department){
        super(name,id);this.department=department;
    }
    public void manageRecords(){
        System.out.println(name+" is managing records of "+department+" department.");
    }
    @Override
    public void displayInfo(){
        System.out.println("Admin Staff Info");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Department: "+department);
        System.out.println("----------------------------------------");
    }
}

public class Lab_4{
    public static void main(String[] args){
        System.out.println("-----------------------------------------");
        System.out.println("NAME:-SHUBHAM DESAI");
        System.out.println("RNo:-IT3109");
        System.out.println("------------------------------------------");

        System.out.println("=========== UNIVERSITY ACADEMIC SYSTEM ===========\n");
        Student st=new Student("Shubham",101,"JAVA");
        Faculty ft=new Faculty("Mrs Deepti",201,"Programming in java");
        AdminStaff ad=new AdminStaff("Mr.Patil",301,"Examination");
        
        Person p1 = st;
        Person p2 = ft;
        Person p3 = ad;

        p1.displayInfo();   
        p2.displayInfo(); 
        p3.displayInfo();   


        st.enrollCourse();
        ft.gradeStudent(st,"A+");
        ad.manageRecords();

        System.out.println("===============================================");
        
    }
}
