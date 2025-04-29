import java.util.Arrays;

public class EjerciciosMatrices {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {5, 5, 6},
                {7, 7, 9}
        };
        float total = 0;
        float elementos = 0;
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0 && i != j) {
                    matriz[i][j] = 0;
                }
                if (i > j) {
                    total += matriz[i][j];
                    elementos++;

                }
            }
        }

        System.out.println("La media es " + total / elementos);

        int nfilas = 13;
        int ncolumnas = 3;
        int dep1[][] = new int[nfilas][ncolumnas];
        llenarDeposito(110,dep1);
        mostrarMatriz(dep1);
    }
    public static void llenarDeposito(int llenado,int deposito[][]){
        if (llenado >= 0 && llenado <= 100){
            int lineaLlenado = (int) Math.ceil(deposito.length*llenado/100);
            for (int i = 0; i < deposito.length; i++) { // Recorre las filas
                for (int j = 0; j < deposito[i].length; j++) {
                    if(i>=(deposito.length-lineaLlenado)){
                        deposito[i][j]=1;
                    } else {
                        deposito[i][j]=0;
                    }

                }
            }
        } else {
            System.out.println("% invalido");
        }

    }
    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}