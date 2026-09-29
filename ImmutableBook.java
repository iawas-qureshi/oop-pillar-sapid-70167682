// Encapsulation 4: fully immutable class
public final class ImmutableBook {
    private final String title;
    private final String author;
    private final double price;

    public ImmutableBook(String title, String author, double price) {
        this.title = title; this.author = author; this.price = price;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    // "modifying" returns a NEW object
    public ImmutableBook withPrice(double newPrice) {
        return new ImmutableBook(title, author, newPrice);
    }

    public static void main(String[] args) {
        ImmutableBook b1 = new ImmutableBook("Java Basics", "Smith", 1200);
        ImmutableBook b2 = b1.withPrice(999);
        System.out.println("b1 price: " + b1.getPrice());
        System.out.println("b2 price: " + b2.getPrice());
    }
}
