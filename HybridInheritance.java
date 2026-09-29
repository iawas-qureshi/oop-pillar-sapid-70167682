// Inheritance 4: hybrid inheritance using classes + interfaces
interface Flyable { void fly(); }
interface Swimmable { void swim(); }

class Bird {
    void breathe() { System.out.println("Bird breathes"); }
}
class Duck extends Bird implements Flyable, Swimmable {
    public void fly()  { System.out.println("Duck flies"); }
    public void swim() { System.out.println("Duck swims"); }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.breathe();
        d.fly();
        d.swim();
    }
}
