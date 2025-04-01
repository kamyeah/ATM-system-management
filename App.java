public class App {
    // setting variables (attributes)
    String accountname;
    double balance;
    int accountnum;

    // default constructor
    public App() {
        this.accountname = "";
        this.balance = 0.0;
        this.accountnum = 0;
    }

    // parameterized constructor which takes 1 or more parameters
    public App(String accountname, double balance, int accountnum) {
        this.accountname = accountname;
        this.balance = balance;
        this.accountnum = accountnum;
    }

    // deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("An amount has been deposited into your account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn successfully: " + amount);
        } else {
            System.out.println("Invalid amount to be withdrawn.");}
        }
    // check balance
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
