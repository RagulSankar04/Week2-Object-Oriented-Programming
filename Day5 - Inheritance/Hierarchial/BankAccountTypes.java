class BankAccount {
    int accountNumber;
    int balance;

    BankAccount(int number, int bal) {
        this.accountNumber = number;
        this.balance = bal;
    }

    void displayAccountType() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    int interestRate;

    SavingsAccount(int number, int bal, int interestRate) {
        super(number, bal);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Account Type: Savings \n");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawlLimit;

    CheckingAccount(int number, int bal, int withdrawlLimit) {
        super(number, bal);
        this.withdrawlLimit = withdrawlLimit;
    }

    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Withdrawl Limit: " + withdrawlLimit);
        System.out.println("Account Type: Checking \n");
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(int number, int bal, int maturityPeriod) {
        super(number, bal);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
        System.out.println("Account Type: Fixed Deposit\n");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1001, 50000, 5);
        CheckingAccount checking = new CheckingAccount(1002, 30000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount(1003, 100000, 12);

        savings.displayAccountType();
        checking.displayAccountType();
        fd.displayAccountType();
    }
}
