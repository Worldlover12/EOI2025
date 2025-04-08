package Vehículos;

public class Automovil extends Vehiculos {
    int precioDia = 50;
    int numLlantas = 4;
    int numAsientos = 4;

    public Automovil(String marca, String modelo) {
        super(marca, modelo);
        precioDia=this.precioDia;
        numLlantas=this.numLlantas;
        numAsientos=this.numAsientos;
    }
}
