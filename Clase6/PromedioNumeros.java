package Clase6;

import java.util.Scanner;
    /*
Armar un programa que permita cargar
 3 números y mostrar cual es el número promedio
*/

public class PromedioNumeros {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        Scanner scanner = new Scanner(System.in);

        //Aqui carga los números
        System.out.println("Ingrese tres números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i +1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        //Calcular el promedio
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double promedio = (double) suma / numeros.length;

        //Mostrar el Resultado
        System.out.println("El Promedio es: " + promedio);

        scanner.close();
    }
}
