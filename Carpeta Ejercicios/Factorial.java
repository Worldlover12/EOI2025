public class Factorial {
    public static void main(String[] args) {
        int n = 0;
        int factorial = calcularFactorial(n);
        System.out.println(factorial);
    }

    public static int calcularFactorial(int n) {
        int factorial = 1;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            throw new IllegalArgumentException("El número es 0 o negativo");
        }

        return factorial;
    }
}
