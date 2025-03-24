//Realiza un programa que muestre al azar el nombre de una carta de la
//baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
// y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
//cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
//sería el 1). Para convertir un número en una cadena de caracteres podemosusar String.valueOf(n).

public class Ejrnd2 {
    public static void main(String[] args) {
        int numero = (int) (Math.random()*12 + 1);
        int npalo = (int) (Math.random()*4 + 1);
        String pnumero = String.valueOf(numero);
        String palo = "";
        switch (npalo) {
            case 1:
                palo = "picas";
                break;
            case 2:
                palo = "corazones";
                break;
            case 3:
                palo = "tréboles";
                break;
            case 4:
                palo = "diamantes";
                break;
        }
        switch (numero) {
            case 1:
                pnumero =  "As de ";
            case 10:
                pnumero = "Jota de ";
            case 11:
                pnumero = "Reina de ";
            case 12:
                pnumero = "Rey de ";
        }
        System.out.println("La carta es el " + pnumero + " de " + palo);
    }
}


