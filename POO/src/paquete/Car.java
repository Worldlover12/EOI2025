package paquete;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String model, String brand, int year) { //constructor, no devuleve dato.
        this.model = model; //this = el valor en blanco asigna el parámetro a cada atributo, da estados.
        this.brand = brand;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
