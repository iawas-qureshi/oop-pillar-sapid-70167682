// Encapsulation 1: private data + public getters/methods with validation
public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance >= 0 ? initialBalance : 0;
    }

    public void deposit(double amount) {
        if (amount > 0) { balance += amount; System.out.println("Deposited: " + amount); }
        else System.out.println("Invalid deposit amount");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { balance -= amount; System.out.println("Withdrawn: " + amount); }
        else System.out.println("Insufficient balance or invalid amount");
    }

    public double getBalance() { return balance; }
    public String getOwner() { return owner; }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ali", 1000);
        acc.deposit(500);
        acc.withdraw(2000);
        acc.withdraw(300);
        System.out.println(acc.getOwner() + " balance: " + acc.getBalance());
    }
}
