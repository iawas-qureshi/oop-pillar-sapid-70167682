// Polymorphism 3: parent reference, child objects (dynamic method dispatch)
class Payment {
    void pay(double amt) { System.out.println("Paying " + amt); }
}
class CardPayment extends Payment {
    @Override void pay(double amt) { System.out.println("Paid " + amt + " by Card"); }
}
class CashPayment extends Payment {
    @Override void pay(double amt) { System.out.println("Paid " + amt + " in Cash"); }
}
class EasyPaisaPayment extends Payment {
    @Override void pay(double amt) { System.out.println("Paid " + amt + " via EasyPaisa"); }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        Payment[] payments = { new CardPayment(), new CashPayment(), new EasyPaisaPayment() };
        for (Payment p : payments) {
            p.pay(1500);   // method chosen at runtime
        }
    }
}
