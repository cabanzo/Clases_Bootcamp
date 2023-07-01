package Clase7;

import java.util.Scanner;

public class OtroPromedio {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero: " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Los numeros ingresados son:");

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
        suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio de los numeros es: " + promedio);
        
    }
}
