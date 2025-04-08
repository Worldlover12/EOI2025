package Vehículos;

class Vehiculos {


    public int precioDia = 0;
    public String marca = "";
    public String modelo = "";
    public int numLlantas = 0;
    public boolean motor = true;
    public int numAsientos;

    public Vehiculos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numLlantas = numLlantas;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public boolean isMotor() {
        return motor;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Numero de Llantas: " + getNumLlantas());
        System.out.println("numAsientos: " + getNumAsientos());
        System.out.println("Precio/Día: " + getPrecioDia());
    }

    public void encenderMotor() {
        System.out.println("Encendiendo motor");
        motor = true;
    }

    public void apagarMotor() {
        motor = false;
        System.out.println("Apagando motor");
    }

    public boolean funciona() {
        System.out.println("Funciona? " + motor);
        return motor;
    }
    public void bajarVentana() {
        System.out.println("Bajando ventana");
    }

}

