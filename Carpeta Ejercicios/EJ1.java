//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EJ1 {
    public static void main(String[] args) {
        int dni = 71095457;
        double DoubleDni = dni;
        int resto = dni % 23;
        String codigo = "TRWAGMYFPDXBNJZSQVHLCK";
        char miLetra = codigo.charAt(resto);
        System.out.print(miLetra);
    }}

