package Doctores;

public class Pediatra extends Doctor{
    public void pasarConsulta(String niño) {
        super.pasarConsulta();
        System.out.println("Esta pasando consulta a : " + niño);
    }
}
