package ClasesAbstractas;

import java.util.Scanner;

public class SavingAccount extends bankAccount {
    public SavingAccount(int balance) {
        super(balance);
    }

    @Override
    public void remove(Scanner Scan) {
        System.out.println("How much do you want to remove from saving?");
        balance -= Scan.nextInt();
    }

    @Override
    public void deposit(Scanner Scan) {
        System.out.println("How much do you want to deposit to saving?");
        balance += Scan.nextInt();
    }
}