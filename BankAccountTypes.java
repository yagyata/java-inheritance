class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + "\nBalance: $" + balance);
    }

    public void displayAccountType() {
        System.out.println("This is a general bank account.");
    }
}

class SavingsAccount extends BankAccount {
    protected double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }
}

class CheckingAccount extends BankAccount {
    protected double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {

    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("452153100", 1000, 5);
        CheckingAccount checking = new CheckingAccount("47865410", 2000, 500);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("16863620", 5000);

        // Display account types
        savings.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();

        // Display balances
        savings.displayBalance();
        checking.displayBalance();
        fixedDeposit.displayBalance();
    }
}
