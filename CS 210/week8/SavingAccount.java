package week8;

public class SavingAccount extends BankAccount {
    
    private static double interestRate = 2.5;

    public SavingAccount(int userAccountNumber, String userAccountType, double userBalance) {
        super(userAccountNumber, userAccountType, userBalance);
    }

    @Override
    public void applyInterest() {
        double balance = calculateInterest();
        super.setBalance(balance);
    }

    public double calculateInterest() {
        double balance = super.getBalance();
        balance += (balance * (interestRate / 100));
        return balance;
    }
}