public class Main {
    public static void main(String[] args) {
        Account account = new Account(5000);
        ATM atm = new ATM(account);
        atm.runAtm();
    }
}
