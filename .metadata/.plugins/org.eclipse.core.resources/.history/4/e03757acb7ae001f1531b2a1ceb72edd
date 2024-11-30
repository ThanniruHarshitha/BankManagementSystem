import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException; // Import this class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register Customer");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = 0;
            boolean validInput = false;

            // Loop until a valid integer is entered
            while (!validInput) {
                try {
                    choice = scanner.nextInt();
                    validInput = true; // Input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    scanner.next(); // Clear invalid input
                }
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    System.out.print("Enter password: ");
                    String password = scanner.next();
                    bank.registerCustomer(name, email, password);
                    break;

                case 2:
                    System.out.print("Enter email for deposit: ");
                    email = scanner.next();
                    double depositAmount;
                    validInput = false;

                    // Loop until a valid double is entered
                    while (!validInput) {
                        try {
                            System.out.print("Enter amount to deposit: ");
                            depositAmount = scanner.nextDouble();
                            bank.deposit(email, depositAmount);
                            validInput = true; // Input is valid
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid amount. Please enter a valid number.");
                            scanner.next(); // Clear invalid input
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter email for withdrawal: ");
                    email = scanner.next();
                    double withdrawAmount;
                    validInput = false;

                    // Loop until a valid double is entered
                    while (!validInput) {
                        try {
                            System.out.print("Enter amount to withdraw: ");
                            withdrawAmount = scanner.nextDouble();
                            bank.withdraw(email, withdrawAmount);
                            validInput = true; // Input is valid
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid amount. Please enter a valid number.");
                            scanner.next(); // Clear invalid input
                        }
                    }
                    break;

                case 4:
                    bank.calculateInterest();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}