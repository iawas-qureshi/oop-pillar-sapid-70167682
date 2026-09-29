// Abstraction 3: abstract class with constructor and fields
abstract class Employee {
    protected String name;
    Employee(String name) { this.name = name; }
    abstract double calculateSalary();
    void printSlip() { System.out.println(name + " salary: " + calculateSalary()); }
}
class FullTime extends Employee {
    double monthly;
    FullTime(String n, double m) { super(n); monthly = m; }
    double calculateSalary() { return monthly; }
}
class PartTime extends Employee {
    int hours; double rate;
    PartTime(String n, int h, double r) { super(n); hours = h; rate = r; }
    double calculateSalary() { return hours * rate; }
}
public class AbstractEmployee {
    public static void main(String[] args) {
        Employee e1 = new FullTime("Usman", 80000);
        Employee e2 = new PartTime("Hina", 60, 500);
        e1.printSlip();
        e2.printSlip();
    }
}
