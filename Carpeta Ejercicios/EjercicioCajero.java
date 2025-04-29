import java.util.Scanner;

public class EjercicioCajero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean finished = false;

        float balance = 0;

        int select;

        while (!finished) {
            System.out.println("Elija la operación que quiere realizar: \n  1)Depositar dinero \n  2)Retirar dinero \n  3)Cosultar Saldo \n  1)Salir");

            select = Integer.parseInt(scan.nextLine());


            switch (select) {
                case 1:
                    System.out.println("Especifique la cantidad a depositar: ");
                    float deposit = Float.parseFloat(scan.nextLine());
                    if (deposit < 0) {
                        System.out.println("el depósito debe ser mayor que cero");
                    } else {
                        balance += deposit;
                    }
                    break;

                case 2:
                    System.out.println("Especifique la cantidad a retirar: ");
                    float cash = Float.parseFloat(scan.nextLine());
                    if (cash < 0) {
                        System.out.println("el depósito debe ser mayor que cero");
                    } else {
                        balance -= cash;
                    }
                    break;

                case 3:
                    System.out.println("Su saldo es de" + balance);
                    break;

                case 4:
                    System.out.println("Adiós");
                    finished = true;
                    break;

                default:
                    throw new IllegalStateException("El valor no corresponde con ninguno de los requeridos" + select);
            }
        }
    }
}
