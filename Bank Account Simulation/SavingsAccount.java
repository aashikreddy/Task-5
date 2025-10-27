public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        transactionHistory.add("Interest applied: " + interest + " | New Balance: " + balance);
        System.out.println("💹 Interest of ₹" + interest + " added to balance.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 1000) {  // Minimum balance condition
            System.out.println("⚠️ Cannot withdraw. Minimum balance of ₹1000 required!");
        } else {
            super.withdraw(amount);
        }
    }
}
