// Polymorphism 2: runtime (method overriding)
class Bird {
    void sound() { System.out.println("Bird makes a sound"); }
}
class Sparrow extends Bird {
    @Override
    void sound() { System.out.println("Sparrow chirps"); }
}
class Crow extends Bird {
    @Override
    void sound() { System.out.println("Crow caws"); }
}
public class MethodOverriding {
    public static void main(String[] args) {
        new Bird().sound();
        new Sparrow().sound();
        new Crow().sound();
    }
}
