package Interfaces;

public class Bicicleta implements Frenable {
    public int marcha;
    public int velocidad;
    public boolean frenos = true;

    @Override
    public void frenar() {
        frenos = true;
        System.out.println("La bicicleta está frenando");
    }

    public void soltarFrenos() {
        frenos = false;
        System.out.println("La bicicleta no está frenando");
    }

    public void subirMarcha() {
        marcha++;
    }

    public void bajarMarcha() {
        marcha--;
    }

    public int velocidad() {
        return velocidad += 10;
    }
}
