package ClasesAbstractas;

import java.util.Scanner;

public class CurrentAccount extends bankAccount {
    @Override
    public void remove(Scanner Scan) {
        System.out.println("How much do you want to remove?");
        balance += Scan.nextInt();
    }

    @Override
    public void deposit(Scanner Scan) {
        System.out.println("How much do you want to deposit?");
        balance += Scan.nextInt();
    }

    public CurrentAccount(int balance) {
        super(balance);
    }
}
