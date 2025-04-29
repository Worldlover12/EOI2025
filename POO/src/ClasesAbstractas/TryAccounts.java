package ClasesAbstractas;

import java.util.Scanner;

public class TryAccounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankAccount account = new CurrentAccount(sc.nextInt());
        account.checkBalance();
        account.remove(sc);
        account.checkBalance();
        account.deposit(sc);
        account.checkBalance();
    }
}
