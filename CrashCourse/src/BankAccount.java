public class BankAccount {


    private int balance = 0;
    private boolean isOpen = false;

    void open() {

        this.isOpen = true;
        BankAccount bankAccount = new BankAccount();
    }


    synchronized void deposit(Integer amount) {

        if (this.isOpen) {
            balance += amount;
        }
    }

    synchronized void withdraw(Integer amount) {
        int onlyIfBalanceNotNegative = balance - amount;
        if (this.isOpen && onlyIfBalanceNotNegative >= 0) {
            balance -= amount;
        }
    }

    public synchronized int getBalance() {
        if (this.isOpen) {
            System.out.println(balance);
            return balance;
        }

        return 0;
    }

    void close() {
        this.isOpen = false;
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.open();
        bankAccount.deposit(10);
        bankAccount.withdraw(15);
        bankAccount.getBalance();

    }
}
