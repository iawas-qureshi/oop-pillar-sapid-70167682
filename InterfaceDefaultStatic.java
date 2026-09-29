// Abstraction 4: interface with default and static methods
interface Vehicle {
    void move();                                            // abstract
    default void fuelInfo() { System.out.println("Uses fuel"); }   // default
    static void rules() { System.out.println("Follow traffic rules"); } // static
}
class Bike implements Vehicle {
    public void move() { System.out.println("Bike moves on two wheels"); }
}
class ElectricBike implements Vehicle {
    public void move() { System.out.println("Electric bike moves silently"); }
    @Override public void fuelInfo() { System.out.println("Uses battery"); }
}
public class InterfaceDefaultStatic {
    public static void main(String[] args) {
        Vehicle b = new Bike();
        Vehicle e = new ElectricBike();
        b.move(); b.fuelInfo();
        e.move(); e.fuelInfo();
        Vehicle.rules();
    }
}
