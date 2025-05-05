package week8;

public class CheckingAccount extends BankAccount {
    
    private double overDraftLimit;

    public CheckingAccount(int userAccountNumber, String userAccountType, double userBalance, double overDraftLimit) {
        super(userAccountNumber, userAccountType, userBalance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return this.overDraftLimit;
    }

    @Override
    public Boolean withdraw(double userWithdrawl) {
        Boolean result = false;
        double balance = super.getBalance();
        if (balance > 0) {
            if (userWithdrawl > 0) {
                if ((balance + overDraftLimit) >= userWithdrawl) {
                    balance -= userWithdrawl;
                    result = true;
                } else {
                    System.out.println("Unsuccessul WIthdrawl. Balance must be greater than withdrawl amount and overdraft limit.");
                }
                super.setBalance(balance);
            } else {
                System.out.println("Unsuccessful Withdrawl. Withdrawl amount must be greater than 0");
            }
        } else {
            System.out.println("Unsuccessful Withdrawl. Balance must be greater than 0.");
        }
        return result;
    }
}