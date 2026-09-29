// Abstraction 1: abstract class with abstract + concrete methods
abstract class Shape {
    abstract double area();                       // no body
    void describe() { System.out.println("Area = " + area()); }   // concrete
}
class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    double area() { return Math.PI * r * r; }
}
class Square extends Shape {
    double s;
    Square(double s) { this.s = s; }
    double area() { return s * s; }
}
public class AbstractShape {
    public static void main(String[] args) {
        Shape c = new Circle(3);
        Shape s = new Square(4);
        c.describe();
        s.describe();
    }
}
