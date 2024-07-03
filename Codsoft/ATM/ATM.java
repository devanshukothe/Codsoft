package ATM;

import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\n--- ATM Menu ---");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    checkBalance();
                    break;
                case "2":
                    deposit();
                    break;
                case "3":
                    withdraw();
                    break;
                case "4":
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void checkBalance() {
        double balance = account.getBalance();
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    private void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        if (account.deposit(amount)) {
            System.out.printf("Successfully deposited $%.2f.%n", amount);
        } else {
            System.out.println("Invalid deposit amount. Please try again.");
        }
    }

    private void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        if (account.withdraw(amount)) {
            System.out.printf("Successfully withdrew $%.2f.%n", amount);
        } else {
            System.out.println("Invalid or insufficient amount. Please try again.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0); // Starting with a balance of $100
        ATM atm = new ATM(account);
        atm.run();
    }
}
