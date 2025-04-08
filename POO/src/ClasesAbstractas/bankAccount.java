package ClasesAbstractas;

import java.util.Scanner;

public abstract class bankAccount {
    public int balance;

    public abstract void deposit(Scanner Scan);

    public abstract void remove(Scanner Scan);


    public bankAccount(int balance) {
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("the account has " + balance);
    }

    ;
}
