import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear una lista de tipo String
        List<String> frutas = new ArrayList<>();

        // Agregar elementos a la lista
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Kiwi");

        // Recorrer la lista usando un bucle for-each e imprimir los elementos
        System.out.println("Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Mostrar el tamaño de la lista
        System.out.println("Número de frutas: " + frutas.size());
    }
}