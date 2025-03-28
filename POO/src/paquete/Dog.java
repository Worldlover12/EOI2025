package paquete;

public class Dog {
    private String size = this.size;
    private String breed = this.breed;
    private String name = this.name;

    public Dog(String size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("I am " + getName() + "and I guau");
    }
    public static void main(String[] args){

    }
}
