// Inheritance 3: hierarchical (one parent, many children) + super keyword
class Shape {
    protected String color;
    Shape(String color) { this.color = color; }
    void showColor() { System.out.println("Color: " + color); }
}
class Circle extends Shape {
    double r;
    Circle(String color, double r) { super(color); this.r = r; }
    double area() { return Math.PI * r * r; }
}
class Rectangle extends Shape {
    double w, h;
    Rectangle(String color, double w, double h) { super(color); this.w = w; this.h = h; }
    double area() { return w * h; }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5);
        Rectangle r = new Rectangle("Blue", 4, 6);
        c.showColor(); System.out.println("Circle area: " + c.area());
        r.showColor(); System.out.println("Rectangle area: " + r.area());
    }
}
