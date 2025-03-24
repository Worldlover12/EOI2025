import java.util.Scanner;
public class JuegoDani {
    //Programa pide 2 números por teclado, y tienes que intercambiar el valor de los mismos.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(num1 + "  " + num2);
        int numAux = num1;
        num1 = num2;
        num2 = numAux;
        System.out.println(num1 + "  " + num2);
    }
}
