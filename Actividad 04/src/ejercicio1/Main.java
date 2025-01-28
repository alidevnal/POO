package ejercicio1;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Savings Account");
        System.out.print("Enter initial balance: $");
        float initialBalance = input.nextFloat();
        System.out.print("Enter interest rate: ");
        float rate = input.nextFloat();
        SavingsAccount account1 = new SavingsAccount(initialBalance, rate);
        System.out.print("Enter amount to deposit: $");
        float depositAmount = input.nextFloat();
        account1.deposit(depositAmount);
        System.out.print("Enter amount to withdraw: $");
        float withdrawAmount = input.nextFloat();
        account1.withdraw(withdrawAmount);
        account1.monthlyStatement();
        account1.print();
    }
}