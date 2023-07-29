public class Account {
    private double accountBalance;

    public Account(double initialBalance) {
        this.accountBalance = initialBalance;
    }

    public double getaccountBalance() {
        return accountBalance;
    }

    public void getDepositamount(double amount) {
        accountBalance += amount;
    }

    public boolean getWithdrawamount(double amount) {
        if (amount > accountBalance) {
            return false;
        } else {
            accountBalance -= amount;
            return true;
        }
    }
}