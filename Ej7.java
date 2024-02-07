import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] factores = descomponerFactoresPrimos(num);

        for (int i = 0; i < factores.length; i++) {
            if (factores[i] != 0) {
                System.out.print(factores[i] + " ");
            }
        }
    }

    public static int[] descomponerFactoresPrimos(int n) {
        int[] factores = new int[n];

        int i = 0;
        int j = 2;
        while (n > 1) {
            if (n % j == 0) {
                factores[i] = j;
                i++;
                n = n / j;
            } else {
                j++;
            }
        }

        return factores;
    }
}
