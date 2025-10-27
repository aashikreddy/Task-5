import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🏦 Welcome to Java Bank Simulation!");
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        SavingsAccount acc = new SavingsAccount(accNo, name, 5000, 5.0);
        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println("1️. Deposit");
            System.out.println("2️. Withdraw");
            System.out.println("3️. Apply Interest");
            System.out.println("4️. Show Balance");
            System.out.println("5️. Show Transaction History");
            System.out.println("0️. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;
                case 3:
                    acc.applyInterest();
                    break;
                case 4:
                    acc.displayBalance();
                    break;
                case 5:
                    acc.printTransactionHistory();
                    break;
                case 0:
                    System.out.println("👋 Thank you for banking with us!");
                    break;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
