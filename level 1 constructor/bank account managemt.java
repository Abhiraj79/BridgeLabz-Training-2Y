class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int n, String h, double b) {
        accountNumber = n;
        accountHolder = h;
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int n, String h, double b, double r) {
        super(n, h, b);
        interestRate = r;
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount(1001, "Aarohi", 5000);
        System.out.println(a.accountNumber + " " + a.accountHolder + " " + a.getBalance());

        a.setBalance(6000);
        System.out.println("Updated Balance: " + a.getBalance());

        SavingsAccount s = new SavingsAccount(2001, "Divyam", 8000, 5.0);
        System.out.println(s.accountNumber + " " + s.accountHolder + " " + s.getBalance() + " " + s.interestRate);
    }
}
