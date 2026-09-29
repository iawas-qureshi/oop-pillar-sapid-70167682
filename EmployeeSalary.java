// Encapsulation 3: read-only field (final id, no setter) and hidden calculation
public class EmployeeSalary {
    private final int id;
    private String name;
    private double baseSalary;

    public EmployeeSalary(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() { return id; }                 // no setId -> read only
    public String getName() { return name; }
    public void setBaseSalary(double s) { if (s > 0) baseSalary = s; }

    private double calculateTax() { return baseSalary * 0.10; }   // hidden logic
    public double getNetSalary() { return baseSalary - calculateTax(); }

    public static void main(String[] args) {
        EmployeeSalary e = new EmployeeSalary(101, "Ahmed", 50000);
        System.out.println("ID: " + e.getId() + ", Name: " + e.getName());
        System.out.println("Net salary: " + e.getNetSalary());
        e.setBaseSalary(60000);
        System.out.println("Net salary after raise: " + e.getNetSalary());
    }
}
