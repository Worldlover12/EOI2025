import java.util.Scanner;

public class EjercicioSara {
    public static void main (String[] args){
        System.out.println(generateShape(4));
    }
    public static final String generateShape(int n) {
        String cuadrado = "";

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {
                cuadrado += "+";
            }
            if (i != n){
                cuadrado += "\n";
            }
        }

        return cuadrado;
    }
}
