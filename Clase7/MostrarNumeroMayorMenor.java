package Clase7;
import java.util.Scanner;
public class MostrarNumeroMayorMenor {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un número: " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Los numeros ingresados son:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }

        }

        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);


    }
}