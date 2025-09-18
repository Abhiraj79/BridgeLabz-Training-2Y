public class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final String accountNumber;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", "1234567890");
        BankAccount account2 = new BankAccount("Jane Smith", "0987654321");
        Object obj = new Object();

        if (account1 instanceof BankAccount) {
            System.out.println("Account 1 Details:");
            account1.displayDetails();
        }

        if (account2 instanceof BankAccount) {
            System.out.println("\nAccount 2 Details:");
            account2.displayDetails();
        }

        if (obj instanceof BankAccount) {
            System.out.println("\nObject is a BankAccount");
        } else {
            System.out.println("\nObject is not a BankAccount");
        }

        System.out.println("\nTotal Accounts: " + BankAccount.getTotalAccounts());
    }
}