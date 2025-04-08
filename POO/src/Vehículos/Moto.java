package Vehículos;

public class Moto extends Vehiculos {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
        this.precioDia = 30;
        this.numLlantas = 2;
        this.numAsientos = 1;

    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public void bajarVentana(){
        System.out.println("No tiene ventana");
    }
}
