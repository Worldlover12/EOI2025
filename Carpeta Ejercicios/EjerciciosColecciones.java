import java.util.HashMap;
import java.util.Map;

public class EjerciciosColecciones {
    public static void main(String[] args) {
        HashMap<String, int[]> notasAlumnos = new HashMap<>();
        notasAlumnos.put("A101", new int[]{1, 2, 3, -1});
        notasAlumnos.put("A102", new int[]{2, 3, 4, 5});
        notasAlumnos.put("A103", new int[]{7, 6, 4, 5});
        notasAlumnos.put("A104", new int[]{2, 3, 8, 5});
        notasAlumnos.put("A105", new int[]{5, 3, 4, 9, 10});
        mostrarMatriz(notasAlumnos.get("A105"));
        float media1 = calcularMediaNota(notasAlumnos.get("A105"));
        System.out.println(media1);
    }

    public static void mostrarMatriz(int matriz[]) {
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas
            System.out.print(matriz[i] + " ");
        }
    }

    public static float calcularMediaNota(int[] notas) {
        float total = 0;

        for (int nota : notas) {
            if (nota >= 0) {
                total += nota;
            }
        }

        float media = total / notas.length;

        return media;

    }
}
