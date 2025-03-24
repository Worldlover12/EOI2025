public class EJ3 {
    public static void main(String[] args) {
        boolean esAdulto = true;
        boolean tienePermiso = false;

        // Operador AND: ambos deben ser verdaderos para que el resultado sea true.
        boolean puedeConducir = esAdulto && tienePermiso;  // false, porque tienePermiso es false

        // Operador OR: basta que una sea verdadera.
        boolean puedeEntrar = esAdulto || tienePermiso;  // true, porque esAdulto es true

        // Operador NOT: invierte el valor de la variable.
        boolean noEsAdulto = !esAdulto;  // false

        System.out.println("Puede conducir (adulto y con permiso): " + puedeConducir);
        System.out.println("Puede entrar (adulto o con permiso): " + puedeEntrar);
        System.out.println("No es adulto: " + noEsAdulto);
    }
}