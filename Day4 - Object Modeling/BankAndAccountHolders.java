import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initalBalance) {
        Account newAccount = new Account(this, initalBalance);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account Opened for " + customer.getName() + " in " + name);
    }

    public String getName() {
        return name;
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalances() {
        System.out.println("Accounts of " + name + " :");
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getName() + ", Balance: $" + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class Account {
    private Bank bank;
    private double balance;

    public Account(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank bank1 = new Bank("HDFC");
        Bank bank2 = new Bank("ICICI");

        Customer customer1 = new Customer("Ragul");
        Customer customer2 = new Customer("Sankar");

        bank1.openAccount(customer1, 5000);
        bank1.openAccount(customer2, 7500);

        bank2.openAccount(customer2, 10000);

        customer1.viewBalances();
        System.out.println();
        customer2.viewBalances();
    }
}