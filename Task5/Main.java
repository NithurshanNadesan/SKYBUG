package SKYBUG.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);
        ATM atm = new ATM(userAccount);
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("\nExiting ATM.....\nThank you!, Come Again.");
                    break;
                default:
                    System.out.println("\nInvalid choice!!\nPlease try again...");
            }
        } while (choice != 4);

        scanner.close();
    }
}
