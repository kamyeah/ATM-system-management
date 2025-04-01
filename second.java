public class second {
    public static void main(String[] args) throws Exception {

        // Create first ATM object using the default constructor
        App cousAtm1 = new App();

        // Check the balance for user's new account (Account 1)
        System.out.println("Account 1:");
        cousAtm1.checkBalance(); // Check initial balance

        // Deposit amount into account (Account 1)
        cousAtm1.deposit(100000);

        // Check the balance after deposit (Account 1)
        System.out.println("After depositing 100000:");
        cousAtm1.checkBalance();

        // Withdraw money from the account (Account 1)
        cousAtm1.withdraw(20000);

        // Check the balance after withdrawal (Account 1)
        System.out.println("After withdrawing 20000:");
        cousAtm1.checkBalance();

        // Create a second ATM object using the parameterized constructor
        App cousAtm2 = new App("Jane Doe", 50000.0, 987654);

        // Check balance for the second account (Account 2)
        System.out.println("\nAccount 2:");
        cousAtm2.checkBalance();
    }
}
