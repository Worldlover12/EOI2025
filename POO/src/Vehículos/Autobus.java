package Vehículos;

public class Autobus extends Vehiculos {

    int precioDia = 200;
    int numLlantas = 8;
    int numAsientos = 40;

    public Autobus(String marca, String modelo) {
        super(marca, modelo);
        this.precioDia = precioDia;
        this.numLlantas = numLlantas;
        this.numAsientos = numAsientos;
    }
}
