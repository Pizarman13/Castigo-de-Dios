public class Ej5 {

    public static void main(String[] args) {

        int n = 5;

        int[][] tablas = tablasMultiplicar(n);

        for (int i = 0; i < tablas.length; i++) {
            for (int j = 0; j < tablas[i].length; j++) {
                System.out.print(tablas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] tablasMultiplicar(int n) {
        int[][] tablas = new int[n + 1][10];

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i) * (j);
            }
        }

        return tablas;
    }

}
