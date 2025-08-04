import java.util.Scanner;

class Shape{
    double radius;

    void setRadius(double r){
        radius = r;
    }
}


class Circle extends Shape{

    void area() {
        double area = Math.PI*radius*radius;
        System.out.println("Area = "+ area);
    }

    void perimeter(){
        double perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter = "+perimeter);
    }
}


public class Main{
    public static void main(String[] args){
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius to of Circle");
            int n =sc.nextInt();
        
        c.setRadius(n);  
        c.area();      
        c.perimeter();  
    }
}
