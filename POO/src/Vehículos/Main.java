package Vehículos;

public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Yamaha", "3");
        moto1.bajarVentana();
        moto1.setNumAsientos(3);
        moto1.mostrarCaracteristicas();
    }
}

