public class BankAccount {
    
    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Php " + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: Php " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Php " + balance);
        System.out.println(); 
    }

        public static void main(String[] args) {
        
        BankAccount account = new BankAccount("123456789", "Ianna Evasco", 1000.00);

        
        System.out.println("Initial Account Details:");
        account.displayBalance();

        account.deposit(500.00); 
        account.displayBalance();

        account.withdraw(300.00); 
        account.displayBalance();

        account.withdraw(1100.00); 
        account.displayBalance();
    }
}