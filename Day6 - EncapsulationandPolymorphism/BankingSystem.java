import java.util.*;

interface Loanable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan of ₹" + amount + " applied by Savings Account holder.");
    }

    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan of ₹" + amount + " applied by Current Account holder.");
    }

    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV001", "Riya Sharma", 50000));
        accounts.add(new CurrentAccount("CUR002", "Amit Verma", 80000));

        for (BankAccount acc : accounts) {
            System.out.println("-------- Account Details --------");
            acc.displayDetails();
            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: ₹" + interest);
            if (acc instanceof Loanable) {
                ((Loanable) acc).applyForLoan(25000);
                System.out.println("Loan Eligibility: ₹" + ((Loanable) acc).calculateLoanEligibility());
            }
            System.out.println("---------------------------------\n");
        }
    }
}
