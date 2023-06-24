package Clase6;

import java.util.Scanner;

public class Mayormenor {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        Scanner scanner = new Scanner(System.in);

        String[] mensajes = {"primer", "segundo", "tercer"};

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese el " + mensajes[i] + " número:");
            numeros[i] = scanner.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
