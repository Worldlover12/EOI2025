import java.util.Scanner;

public class EjercicioAutobus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String respuesta = asignarRespuestaEdad(introducirEdad(scan));
        System.out.println(respuesta);
    }

    public static int introducirEdad(Scanner scan) {
        System.out.println("Introduzca su edad:");

        return Integer.parseInt(scan.nextLine());
    }

    public static String asignarRespuestaEdad(int edad) {
        String respuesta = "";

        if (edad > 65) {
            respuesta = "Descuento 3ª edad";
        }
        else if (edad > 18 && edad < 25) {
            respuesta = "Descuento joven";
        }
        else if (edad<12) {
            respuesta = "A casa niño";
        }
        else {
            respuesta = "Paga por ventanilla";
        }

        return respuesta;
    }
}
