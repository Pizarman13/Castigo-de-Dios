import java.util.Random;
import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión de la matriz: ");
        int dimension = scanner.nextInt();
        generarEImprimirMatrizSimetrica(dimension);
    }

    public static void generarEImprimirMatrizSimetrica(int dimension) {
        Random random = new Random();
        int[][] matriz = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int aleatorio = random.nextInt(100);
                matriz[i][j] = aleatorio;
                matriz[j][i] = aleatorio;
            }
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
