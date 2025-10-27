import java.util.ArrayList;
import java.util.List;

public class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    protected List<String> transactionHistory;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + " | Balance: " + balance);
            System.out.println("✅ Deposited ₹" + amount + " successfully.");
        } else {
            System.out.println("❌ Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount + " | Balance: " + balance);
            System.out.println("✅ Withdrawn ₹" + amount + " successfully.");
        } else {
            System.out.println("❌ Invalid withdrawal amount or insufficient funds!");
        }
    }

    public void displayBalance() {
        System.out.println("💰 Current Balance: ₹" + balance);
    }

    public void printTransactionHistory() {
        System.out.println("\n📜 Transaction History for " + accountHolder + ":");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
