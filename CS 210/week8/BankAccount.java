package week8;

public abstract class BankAccount {
    
    private int accountNumber;

    private String accountType;

    private double balance;

    public BankAccount(int userAccountNumber, String userAccountType, double userBalance) {
        this.accountNumber = userAccountNumber;
        this.accountType = userAccountType;
        this.balance = userBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double userBalance) {
        this.balance = userBalance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public Boolean deposit(double userDeposit) {
        Boolean result = false;
        if (userDeposit > 0) {
            this.balance += userDeposit;
            result = true;
            System.out.println("Successful Deposit");
        } else {
            System.out.println("Unsuccessful Deposit. Deposit amount must be greater than 0.");
        }
        return result;
    }

    public Boolean withdraw(double userWithdrawl) {
        Boolean result = false;
        if (this.balance > 0) {
            if (userWithdrawl > 0) {
                if (this.balance >= userWithdrawl) {
                    this.balance -= userWithdrawl;
                    result = true;
                } else {
                    System.out.println("Unsuccessul WIthdrawl. Balance must be greater than withdrawl amount.");
                }
            } else {
                System.out.println("Unsuccessful Withdrawl. Withdrawl amount must be greater than 0");
            }
        } else {
            System.out.println("Unsuccessful Withdrawl. Balance must be greater than 0.");
        }
        return result;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void applyInterest() {

    }

}