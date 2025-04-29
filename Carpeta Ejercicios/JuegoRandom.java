import java.util.Random;
import java.util.Scanner;

//Escribir un programa que te diga si el número que introduces es menor o mayor que un número random.

public class JuegoRandom {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100) + 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el siguiente número: ");

        int miNumero = scan.nextInt();

        int numeroDeIntentos = 2;

        boolean terminado = false;

        do {
            if (miNumero != numeroSecreto) {
                if (numeroDeIntentos == 0) {
                    System.out.println("Has perdido");
                    terminado = true;
                }

                if (miNumero < numeroSecreto) {
                    System.out.println("Mayor! Introduce el siguiente número: ");
                } else {
                    System.out.println("menor! Introduce el siguiente número: ");
                }
                miNumero = scan.nextInt();
                numeroDeIntentos -= 1;
            } else {
                System.out.println("El número es el correcto");
                terminado = true;
            }
        }
        while (!terminado);
    }
}

