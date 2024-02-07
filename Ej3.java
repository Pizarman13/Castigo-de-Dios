public class Ej3 {

        public static void main(String[] args) {

            int nM5 = 0;

            for (int i = 1; i <= 100 ; i++) {

                if (i % 5 == 0) {

                    nM5++;
                }
            }

            int[] multiplos = multiplosDe5(nM5);

            for (int i = 0; i < multiplos.length; i++) {
                System.out.print(multiplos[i] + " ");
            }
            System.out.println();

            System.out.println("La suma de los multiplos de 5 es: " + sumaArray(multiplos));



        }
        public static int[] multiplosDe5(int nM) {
            int[] multiplos = new int[nM];

            int begin = 1;
            int end = 100;

            int j = 0;
            for (int i = begin; i <= end ; i++) {

                if (i % 5 == 0) {
                    multiplos[j] = i;
                    j++;
                }
            }
            return multiplos;
        }

        public static int sumaArray(int[] t) {
            int suma = 0;
            for (int i = 0; i < t.length; i++) {
                suma += t[i];
            }
            return suma;
        }
}
