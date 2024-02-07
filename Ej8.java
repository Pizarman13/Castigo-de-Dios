import java.util.ArrayList;
import java.util.Scanner;

public class Ej8 {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> numeros = new ArrayList<Integer>();

    public static void main(String[] args) {

        añadirNum();
        System.out.println("La media de los números introducidos es: " + media());
        System.out.println("El número mayor es: " + maximo());
        System.out.println("El número menor es: " + minimo());

    }

    public static void añadirNum() {
        while(true) {
            System.out.println("Introduce un número (cero para salir):");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            numeros.add(num);
        }
    }

    public static float media() {
        float suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }
        return suma / numeros.size();
    }

    public static int minimo() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < min) {
                min = numeros.get(i);
            }
        }
        return min;
    }

    public static int maximo() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > max) {
                max = numeros.get(i);
            }
        }
        return max;
    }
}
