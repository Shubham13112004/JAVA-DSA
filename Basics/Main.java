// Parent class
class Shape {
    double radius;

    void setRadius(double r) {
        radius = r;
    }
}

// Child class inherits from Shape
class Circle extends Shape {

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
    }

    void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter = " + perimeter);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);  // setting radius
        c.area();        // Output: Area = 78.54
        c.perimeter();   // Output: Perimeter = 31.42
    }
}
