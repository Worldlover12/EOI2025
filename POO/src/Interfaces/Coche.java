package Interfaces;

public class Coche implements Frenable {
    public boolean frenos = true;
    public int velocidad;
    public int marcha;

    @Override
    public void frenar() {
        frenos = true;
        System.out.println("Frenando");
    }

    @Override
    public void soltarFrenos() {
        frenos = false;
        System.out.println("el coche no está frenando");
    }

    public int velocidad() {
        return velocidad += 10;
    }
}
