package paquete;

public class Main {
    public static void main(String[]args){
        Dog perrete = new Dog("grande","caniche","matías");
        perrete.setSize("pequeño");
        System.out.println(perrete.getSize());
        perrete.bark();
    }


}
