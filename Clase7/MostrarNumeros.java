package Clase7;
import java.util.Scanner;

//Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
public class MostrarNumeros {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un número: " + (i+1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Los números ingresados son:");

        for (int i = 0; i < 5; i++){
            System.out.println(numeros[i]);
        }
    }
}
