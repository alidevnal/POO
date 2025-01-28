package ejercicio1;

public class SavingsAccount extends Account {
    private boolean active;

    public SavingsAccount(float balance, float rate) {
        super(balance, rate);
        active = balance >= 10000;
    }

    public void withdraw(float amount) {
        if (active) super.withdraw(amount);
    }

    public void deposit(float amount) {
        if (active) super.deposit(amount);
    }

    public void monthlyStatement() {
        if (numberOfWithdrawals > 4) {
            monthlyCommission += (numberOfWithdrawals - 4) * 1000;
        }
        super.monthlyStatement();
        if (balance < 10000) active = false;
    }

    public void print() {
        System.out.println("Balance = $" + balance);
        System.out.println("Monthly Commission = $" + monthlyCommission);
        System.out.println("Number of Transactions = " + (numberOfDeposits + numberOfWithdrawals));
        System.out.println();
    }
}
