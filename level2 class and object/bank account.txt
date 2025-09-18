class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Aarohi Mishra";
        acc.accountNumber = 12345;
        acc.balance = 1000;

        acc.displayBalance();
        System.out.println("------------------");

        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500);
        System.out.println("------------------");

        acc.displayBalance();
    }
}
