package week8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    
    private static int nextAccountNumber = 0;
    private static BankAccount[] accounts = new BankAccount[10];
    static Scanner userInput = new Scanner(System.in);


    public static void addAccount( double initialBalance, String accountType, double overdraftLimit) {
        if (accountType.equals("CheckingAccount")) {
            accounts[nextAccountNumber] = new CheckingAccount(nextAccountNumber, accountType, initialBalance, overdraftLimit);
        } else if (accountType.equals("SavingAccount")) {
            accounts[nextAccountNumber] = new SavingAccount(nextAccountNumber, accountType, initialBalance);
        }
        nextAccountNumber += 1;
    }

    public static void deposit( int accountNumber, double depositAmount) {
        accounts[accountNumber].deposit(depositAmount);
    }

    public static void withdraw( int accountNumber, double withdrawlAmount) {
        accounts[accountNumber].withdraw(withdrawlAmount);
    }

    public static void displayAllAccounts() {
        System.out.println("Displaying " + nextAccountNumber + " accounts.");
        System.out.println();
        for (int i = 0; i < nextAccountNumber; i++) {
            System.out.print("Account Number: AC" + accounts[i].getAccountNumber());
            System.out.print(", Type: " + accounts[i].getAccountType());
            System.out.print(", Balance: " + accounts[i].getBalance());
            System.out.println();
        }
        System.out.println();
    }

    public static int getSelection() {
        int userSelection;
        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Apply Interest Rate to Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            try {
                userSelection = userInput.nextInt();
                userInput.nextLine();
                if (6 < userSelection || userSelection < 1) {
                    throw new IllegalArgumentException("Please enter a number 1 - 6");
                }
                break;
            } catch (InputMismatchException ime) {
                userSelection = 0;
                userInput.nextLine();
                System.out.println();
                System.out.println("Error: Thats not a valid number. Please enter an integer");
                System.out.println();
            } catch (IllegalArgumentException iae) {
                userSelection = 0;
                System.out.println();
                System.out.println("Error: " + iae.getMessage());
                System.out.println();
            }
        }
        System.out.println();
        return userSelection;
    }

    public static double getDouble() {
        double userInitBalance;
        while (true) {
            try {
                userInitBalance = userInput.nextDouble();
                userInput.nextLine();
                if (userInitBalance < 0) {
                    throw new IllegalArgumentException("Please enter a number greater than 0.");
                }
                break;
            } catch (InputMismatchException ime) {
                userInitBalance = 0;
                userInput.nextLine();
                System.out.println();
                System.out.print("Error: Thats not a valid number. Please enter a float. : ");
            } catch (IllegalArgumentException iae) {
                userInitBalance = 0;
                System.out.println();
                System.out.print("Error: " + iae.getMessage() + " : ");
            }
        }
        System.out.println();
        return userInitBalance;
    }

    public static String getNewAccountType() {
        String userSelection;
        while (true) {
            System.out.print("Enter 's' for Saving or 'c' for Checking: ");

            try {
                userSelection = userInput.next();
                if (!userSelection.equals("s") && !userSelection.equals("c")) {
                    throw new IllegalArgumentException("Please enter an 's' for Saving or 'c' for Checking");
                }
                break;
            } catch (IllegalArgumentException iae) {
                userSelection = "";
                System.out.println();
                System.out.println("Error: " + iae.getMessage());
                System.out.println();
            }
        }
        System.out.println();
        if (userSelection.equals("s")) {
            return "SavingAccount";
        } else {
            return "CheckingAccount";
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the online bank portal!");
        System.out.println("Choose from the options below!");
        System.out.println();

        String accountNumber;
        int accountNumberInt;

        while (true) {

            int userSelection = getSelection();
            
            switch (userSelection) {
                case 1:
                    if (nextAccountNumber < 10) {
                        String accountType = getNewAccountType();
                        System.out.print("Enter initial balance: ");
                        double balance = getDouble();
                        double overdraftLimit = 0;
                        if (accountType.equals("CheckingAccount")) {
                            System.out.print("Enter overdraft limit: ");
                            overdraftLimit = getDouble();
                        }
                        Bank.addAccount(balance, accountType, overdraftLimit);

                        System.out.println("Account created");
                        displayAllAccounts();
                    } else {
                        System.out.println("Max 10 accounts have been created");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = userInput.nextLine();
                    accountNumberInt = Integer.parseInt(accountNumber.substring(2));
                    if (accountNumberInt < nextAccountNumber) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = getDouble();
                        Bank.deposit(accountNumberInt, depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    displayAllAccounts();
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = userInput.nextLine();
                    accountNumberInt = Integer.parseInt(accountNumber.substring(2));
                    if (accountNumberInt < nextAccountNumber) {
                    System.out.print("Enter withdrawl amount: ");
                    double withdrawlAmount = getDouble();
                    Bank.withdraw(accountNumberInt, withdrawlAmount);
                    displayAllAccounts();
                } else {
                    System.out.println("Account not found.");
                }
                    break;
                case 4:
                    Bank.displayAllAccounts();
                    break;
                case 5:
                    for (int i = 0; i < nextAccountNumber; i++) {
                        if (accounts[i].getAccountType().equals("SavingAccount")) {
                            accounts[i].applyInterest();
                        }
                    }
                    Bank.displayAllAccounts();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    userInput.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
