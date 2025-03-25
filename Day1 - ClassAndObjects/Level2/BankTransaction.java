import java.util.Scanner;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String name, int accNum, double bal) {
        this.accountHolder = name;
        this.accountNumber = accNum;
        this.balance = bal;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
            return false;
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        } else {
            balance -= amount;
            System.out.println("INR" + amount + " withdrawn successfully.");
            return true;
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: INR " + balance);
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Account Holder Name: ");
        String name = input.nextLine();
        System.out.print("Enter the Account Number: ");
        int accNum = input.nextInt();
        System.out.print("Enter the Current Balance: ");
        double bal = input.nextDouble();

        BankAccount account = new BankAccount(name, accNum, bal);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}