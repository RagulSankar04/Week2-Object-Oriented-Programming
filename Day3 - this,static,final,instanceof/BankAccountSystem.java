class BankAccount {
    static String bankName = "Global Bank";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }

}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Ragul", 5000.0);
        BankAccount acc2 = new BankAccount(1002, "Sankar", 7000.0);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();
        System.out.println();

        BankAccount.getTotalAccounts();
    }
}