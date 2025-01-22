package entities;

public class BankAccount {
    private static final double WITHDRAWAL_FEE = 5.00;

    private final int accountNumber;
    private String cardholderName;
    private double balance;

    public BankAccount(int accountNumber, String cardholderName) {
        this.accountNumber = accountNumber;
        this.cardholderName = cardholderName;
    }

    public BankAccount(int accountNumber, String cardholderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.cardholderName = cardholderName;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + WITHDRAWAL_FEE;
    }

    @Override
    public String toString() {
        return "Account " + accountNumber + ", Holder: " + cardholderName + " , Balance: $ " + String.format("%.2f", balance);
    }
}
