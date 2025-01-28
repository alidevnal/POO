package ejercicio1;

public class Account {
    protected float balance;
    protected int numberOfDeposits = 0;
    protected int numberOfWithdrawals = 0;
    protected float annualRate;
    protected float monthlyCommission = 0;

    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public void deposit(float amount) {
        balance += amount;
        numberOfDeposits++;
    }

    public void withdraw(float amount) {
        float newBalance = balance - amount;
        if (newBalance >= 0) {
            balance -= amount;
            numberOfWithdrawals++;
        } else {
            System.out.println("The amount to withdraw exceeds the current balance.");
        }
    }

    public void calculateInterest() {
        float monthlyRate = annualRate / 12;
        float monthlyInterest = balance * monthlyRate;
        balance += monthlyInterest;
    }

    public void monthlyStatement() {
        balance -= monthlyCommission;
        calculateInterest();
    }
}