import java.util.Scanner;
public class Ej9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión de los vectores: ");
        int dimension = scanner.nextInt();
        double[] vector1 = solicitarVector(dimension);
        double[] vector2 = solicitarVector(dimension);
        double producto = calcularProductoEscalar(vector1, vector2);
        System.out.println("El producto escalar de los vectores es " + producto);
    }

    public static double[] solicitarVector(int dimension) {
        Scanner scanner = new Scanner(System.in);
        double[] vector = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            System.out.println("Introduce el elemento " + (i+1) + " del vector: ");
            vector[i] = scanner.nextDouble();
        }
        return vector;
    }

    public static double calcularProductoEscalar(double[] vector1, double[] vector2) {
        double producto = 0;
        for (int i = 0; i < vector1.length; i++) {
            producto += vector1[i] * vector2[i];
        }
        return producto;
    }


}
