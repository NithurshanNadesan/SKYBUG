package SKYBUG.Task5;

class ATM {
    private final BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("\n\n---------------------------");
        System.out.println( "|   - A T M   M E N U -   |");
        System.out.println("---------------------------\n");
        System.out.println("\t 01. Withdraw");
        System.out.println("\t 02. Deposit");
        System.out.println("\t 03. Check Balance");
        System.out.println("\t 04. Exit");
        System.out.println("\n. . . . . . . . . . . . . .\n");
    }

    public void withdraw(double amount) {
        if (userAccount.getBalance() >= amount) {
            userAccount.withdraw(amount);
            System.out.println("\nWithdrawal successful.\n\t-> Remaining balance: " + userAccount.getBalance());
        } else {
            System.out.println("\nInsufficient balance!!...");
        }
    }

    public void deposit(double amount) {
        userAccount.deposit(amount);
        System.out.println("\nDeposit successful.\n\t-> New balance: " + userAccount.getBalance());
    }

    public void checkBalance() {
        System.out.println("\n\t-> Current balance: " + userAccount.getBalance());
    }
}
