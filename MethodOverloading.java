// Polymorphism 1: compile-time (method overloading)
class Calculator {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
    double add(double a, double b) { return a + b; }
    String add(String a, String b) { return a + b; }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2.5, 3.5));
        System.out.println(c.add("Hello ", "World"));
    }
}
