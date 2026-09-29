// Inheritance 2: multilevel (Vehicle -> Car -> ElectricCar)
class Vehicle {
    void start() { System.out.println("Vehicle started"); }
}
class Car extends Vehicle {
    void drive() { System.out.println("Car is driving"); }
}
class ElectricCar extends Car {
    void charge() { System.out.println("Electric car is charging"); }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.start();
        e.drive();
        e.charge();
    }
}
