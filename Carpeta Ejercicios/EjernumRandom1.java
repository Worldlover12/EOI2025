//Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
//también la suma total (los puntos que suman entre los tres dados).

public class EjernumRandom1 {
    public static void main(String[] args) {
        int rnd1 = (int)(Math.random()*5 + 1);
        int rnd2 = (int)(Math.random()*5 + 1);
        int rnd3 = (int)(Math.random()*5 + 1);
        int suma = rnd1 + rnd2 + rnd3;
        System.out.println("1er núm " + rnd1 + ", 2 núm " + rnd2 + ", 3 núm " + rnd3 + ", La suma es: " + suma);
    }
}
