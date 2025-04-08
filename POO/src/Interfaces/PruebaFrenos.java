package Interfaces;

public class PruebaFrenos {
    public static void main(String[] args) {
        Frenable c1 = new Coche();
        Frenable b1 = new Bicicleta();
        c1.soltarFrenos();
        b1.soltarFrenos();
    }
}
