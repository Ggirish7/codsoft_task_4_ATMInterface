import java.util.Scanner;

public class ATM {
    private Account account;
    private Scanner sc;

    public ATM(Account account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void runAtm() {
        int choice = 0;
        while (choice != 4) {

            menu();
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    depositAmount();
                    break;

                case 3:
                    withdrawAmount();
                    break;

                case 4:
                    System.out.println("Thank You for using the ATM!");
                    break;

                default:
                    System.out.println("Inalid option, Try again.");
            }
        }
    }

    private void menu() {
        System.out.println("\nWelcome To xyz ATM\n");
        System.out.println("Press:1. To check Account balance");
        System.out.println("Press:2. To Deposit amount");
        System.out.println("Press:3. To Withdraw amount");
        System.out.println("Press:4. To Exit\n");
    }

    private void checkBalance() {
        System.out.println("\nYour account balance is Rs. " + account.getaccountBalance());
    }

    private void depositAmount() {
        System.out.println("Enter the amount to be deposited: ");
        int amount = sc.nextInt();
        account.getDepositamount(amount);
        System.out.println("Rs. " + amount + " has been deposited.\nTotal balance: " + account.getaccountBalance());
    }

    private void withdrawAmount() {
        System.out.println("Enter the amount to be withdrawn: ");
        int amount = sc.nextInt();
        account.getWithdrawamount(amount);
        System.out.println("Rs. " + amount + " Withdrawn.\nTotal balance: " + account.getaccountBalance());
    }
}
