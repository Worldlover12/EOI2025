public class EJ2 {
        public static void main(String[] args) {
            int a = 10, b = 5;

            // Suma, resta, multiplicación y división
            int suma = a + b;        // 10 + 5 = 15
            int resta = a - b;       // 10 - 5 = 5
            int producto = a * b;    // 10 * 5 = 50
            int divisionEntera = a / b;  // 10 / 5 = 2

            // División real (decimal)
            double divisionReal = (double) a / b;  // 10 / 5 = 2.0
            double sumaReal = (a+1.4234);
            // Módulo (resto de la división)
            int modulo = 10 % 3;     // 10 % 3 = 1

            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Producto: " + producto);
            System.out.println("División entera: " + divisionEntera);
            System.out.println("División real: " + divisionReal);
            System.out.println("Módulo: " + modulo);
            System.out.println("Suma Real: " + sumaReal);

            int sumaRealSimpl= (int) sumaReal;

            System.out.println("Suma Real Simple: " + sumaRealSimpl);

            // Incremento y decremento
            a++;  // a pasa de 10 a 11
            b--;  // b pasa de 5 a 4
            System.out.println("Después de incremento/decremento: a = " + a + ", b = " + b);
        }
    }

