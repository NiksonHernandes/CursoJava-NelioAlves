package entities;

public class Account {

    private int accountNumber;
    private String accountName;
    private double balance;

    public Account() {

    };

    public Account(int accountNumber, String accountName, double initialMoney) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = initialMoney;
    }

    public Account(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public String toString() {
        return "Account " + this.getAccountNumber() + ", Holder: " + this.getAccountName() + ", Balance: $ " + String.format("%.2f", this.getBalance());
    }

    public void depositMoney(double valueMoney) {
        this.balance += valueMoney;
    }

    public void withdrawMoney(double valueMoney) {
        this.balance = (this.balance - valueMoney) - 5.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }
}
