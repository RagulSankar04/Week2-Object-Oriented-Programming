import java.util.Scanner;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("\nBank Account Details:");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("\nSavings Account Details:");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}

public class BankMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = input.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accHolder = input.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = input.nextDouble();

        BankAccount acc = new BankAccount(accNo, accHolder, balance);
        acc.displayAccountDetails();

        System.out.print("\nEnter deposit amount: ");
        double depositAmt = input.nextDouble();
        acc.deposit(depositAmt);
        acc.displayAccountDetails();

        System.out.print("\nEnter withdrawal amount: ");
        double withdrawAmt = input.nextDouble();
        acc.withdraw(withdrawAmt);
        acc.displayAccountDetails();

        System.out.print("\nEnter Interest Rate for Savings Account: ");
        double rate = input.nextDouble();

        SavingsAccount savAcc = new SavingsAccount(accNo, accHolder, acc.getBalance(), rate);
        savAcc.displaySavingsDetails();

        input.close();
    }
}
