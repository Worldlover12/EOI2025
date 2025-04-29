
import java.util.Random;
import java.util.Scanner;

public class EjerciciosFunciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Seleccionamos el número de dígitos
        System.out.println("Introduce el número de dígitos");
        int numeroElementos = scanner.nextInt();
        System.out.println("Introduce la complejidad");
        // Seleccionamos el nivel de complejidad del pass
        int complejidad = seleccionarComplejidad(scanner);

        // Generar el password
        String passwordGenerado = generarPassword(numeroElementos, complejidad);

        String complejidadCalculada = calcularComplejidad(numeroElementos, complejidad);

        System.out.println("El password generado es :" + passwordGenerado + " y su complejidad es :" + complejidadCalculada);

        scanner.close();

    }

    private static String calcularComplejidad(int numeroElementos, int complejidad) {
        int puntos = complejidad;
        if (numeroElementos > 23) {
            puntos += 2;
        } else if (numeroElementos > 8) {
            puntos += 1;
        }
        return "La complejidad de su comtraseña del 1-5 es " + puntos;
    }

    // Esta función generará el password, en base a los criterios del usuario
    private static String generarPassword(int numeroElementos, int complejidad) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < numeroElementos; i++) {
            password.append(selectChar(selectSubset(complejidad)));
        }
        return password.toString();
    }

    // Mostrar el menu de complejidad y el usuario introducirá 1,2 o 3
    private static int seleccionarComplejidad(Scanner scanner) {
        System.out.println("1.- Si quieres sólo dígitos");
        System.out.println("2.- Si quieres sólo dígitos y letras");
        System.out.println("3.- Si quieres dígitos, letras y símbolos");

        int complejidad = 0;
        do {
            System.out.println("\n. Introduce opcion [1,2 ó 3]");
            complejidad = scanner.nextInt();
        } while (complejidad < 1 || complejidad > 3);

        return complejidad;

    }
    private static char selectChar(String Subset) {
        Random rand = new Random();
        char character = Subset.charAt(rand.nextInt(Subset.length()));
        return character;
    }
    private static String selectSubset(int complejidad) {

        final String numeros = "0123456789";

        final String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        final String minusculas = "abcdefghijklmnopqrstuvwxyz";

        final String simbolos = "~`!@#$%^&*()_-+={[}]|:;'<,>.?/";

        String subset = "";
        switch (complejidad) {
            case 1:
                subset = numeros;
                break;
            case 2:
                subset = numeros + mayusculas + minusculas;
                break;
            case 3:
                subset = numeros + mayusculas + minusculas + simbolos;
                break;
        }
        return subset;
    }

}
// generador de contraseñas, usuario introduce nº dígitos y a complejidad:
// complejidad 1: letras y números
// complejidad 2: mayúsculas y minúsculas
//complejidad 3 : con símbolos también
// devolver fortaleza: si usa complejidad 2 y > 28 dígitos mediana, si usa 3 y > 28 fuerte, si no, débil;


