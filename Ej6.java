public class Ej6 {

    public static void main(String[] args) {

            int nPrimos = 10;

            int[] primos = nPrimos(nPrimos);

            for (int i = 0; i < primos.length; i++) {
                System.out.print(primos[i] + " ");
            }
            System.out.println();

    }

    public static int[] nPrimos(int n) {
        int[] primos = new int[n];

        int i = 0;
        int j = 2;
        while (i < n) {
            if (esPrimo(j)) {
                primos[i] = j;
                i++;
            }
            j++;
        }
        return primos;
    }

    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
