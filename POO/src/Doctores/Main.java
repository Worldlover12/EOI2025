package Doctores;

public class Main {
    public static void main(String[] args) {
        Cirujano c = new Cirujano();
        if(c.puedeOperar){
            System.out.println("Puede c operar" + c.puedeOperar);
        }
        Doctor d = new Doctor();
        if(d.puedeOperar){
            System.out.println("Puede d operar" + d.puedeOperar);
        }
        Pediatra p = new Pediatra();
        if(p.puedeOperar){
            System.out.println("Puede p operar" + p.puedeOperar);
        }
    }
}
