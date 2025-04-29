package genericos.after;

import genericos.before.Bolsa;

public class Main {
    public static void main(String[] args) {
        genericos.before.Bolsa bolsa = new Bolsa(5);
        Chocolatina c =  new Chocolatina("Milka");
        Chocolatina d =  new Chocolatina("Ferrero");
        Chocolatina f =  new Chocolatina("Aero");
        Golosina g1 = new Golosina("gominola");
        Golosina g2 = new Golosina("chicle");

        bolsa.add(c);
        bolsa.add(d);
        bolsa.add(f);
        bolsa.add(g1);
        bolsa.add(g2);

        for (Object o: bolsa){
            if(o instanceof Chocolatina){
                Chocolatina chocolatina = (Chocolatina) o;
                System.out.println(chocolatina.getMarca());
            }
            else{
                Golosina golosina = (Golosina) o;
                System.out.println(golosina.getName());
            }
        }
    }






}
