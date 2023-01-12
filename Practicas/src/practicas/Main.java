package practicas;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablaEnteros = new int[10];
        int[] tablaSinRepetir = new int[10];
        int numeroDeElementosSinRepetir = 0;

        // Leer 10 valores enteros por teclado y almacenarlos en tablaEnteros
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un valor entero: ");
            tablaEnteros[i] = scanner.nextInt();
        }

        // Construir una tabla sin elementos repetidos
        for (int i = 0; i < 10; i++) {
            int elementoActual = tablaEnteros[i];
            int index = Arrays.binarySearch(tablaSinRepetir, 0, numeroDeElementosSinRepetir, elementoActual);

            if (index < 0) {
                // El elemento no se encuentra en la tabla sin repetir
                tablaSinRepetir[numeroDeElementosSinRepetir] = elementoActual;
                numeroDeElementosSinRepetir++;
                Arrays.sort(tablaSinRepetir,0,numeroDeElementosSinRepetir);
            }
        }

        // Imprimir la tabla sin elementos repetidos
        System.out.print("Tabla sin elementos repetidos: ");
        for (int i = 0; i < numeroDeElementosSinRepetir; i++) {
            System.out.print(tablaSinRepetir[i] + " ");
        }
    }
}
