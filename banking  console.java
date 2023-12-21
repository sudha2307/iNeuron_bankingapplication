import java.util.Scanner;

public class SimpleBankingApplication {
    private static double balance = 1000; // Initial balance, you can set it to any value

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to Simple Banking Application!");

        while (true) {
            // Display menu
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            // Get user choice
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Process user choice
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using Simple Banking Application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance: $" + balance);
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal amount exceeds balance.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }
}