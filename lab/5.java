import java.util.Scanner;

class Bank {
    private String name;
    private int accountNumber;
    private double amount;

    public void insert(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.amount = 0;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            amount += depositAmount;
            System.out.println("Deposit successful. Current balance: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0) {
            if (withdrawAmount <= amount) {
                amount -= withdrawAmount;
                System.out.println("Withdrawal successful. Current balance: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + amount);
    }

    public void display() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current balance: " + amount);
    }
}

class BankingSystemDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        bank.insert(name, accountNumber);

        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                case 4:
                    bank.display();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}