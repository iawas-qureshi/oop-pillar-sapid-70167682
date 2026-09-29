// Polymorphism 4: polymorphism through an interface
interface Playable { void play(); }

class Guitar implements Playable {
    public void play() { System.out.println("Playing guitar"); }
}
class Piano implements Playable {
    public void play() { System.out.println("Playing piano"); }
}
class Drums implements Playable {
    public void play() { System.out.println("Playing drums"); }
}
public class InterfacePolymorphism {
    static void startConcert(Playable p) { p.play(); }

    public static void main(String[] args) {
        startConcert(new Guitar());
        startConcert(new Piano());
        startConcert(new Drums());
    }
}
