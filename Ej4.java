import java.util.ArrayList;
import java.util.Scanner;


public class Ej4 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> numeros = new ArrayList<Integer>();

            while (true) {
                System.out.println("Introduce un número entero (negativo para terminar): ");
                int n = sc.nextInt();
                if (n < 0) {
                    break;
                }
                numeros.add(n);
            }

            if (numeros.size() > 0) {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for (int i = 0; i < numeros.size(); i++) {
                    if (numeros.get(i) < min) {
                        min = numeros.get(i);
                    }
                    if (numeros.get(i) > max) {
                        max = numeros.get(i);
                    }
                }

                System.out.println("El número mayor es: " + max);
                System.out.println("El número menor es: " + min);
            } else {
                System.out.println("No se ha introducido ningún número.");
            }
        }

}
