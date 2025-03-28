import java.util.Scanner;

public class CalculaNota {
    //Realiza un programa que calcule la nota que hace falta sacar en el segundo
    //examen de la asignatura Programación para obtener la media deseada. Hay
    //que tener en cuenta que la nota del primer examen cuenta el 40% y la del
    //segundo examen un 60%.
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca la primera nota");
        float nota1 = (scan.nextFloat() * 0.4f);
        System.out.println("Introduzca la nota deseada");
        float notaDeseada =scan.nextFloat();

        float nota2 = (notaDeseada - nota1) / 0.6f;
        System.out.printf("%.2f",nota2);
                //nota deseada = nota1 *  0,4 + nota 2 * 0,6;
    }
}
