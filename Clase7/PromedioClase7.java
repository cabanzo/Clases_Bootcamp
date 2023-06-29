package Clase7;
import java.util.Scanner;
public class PromedioClase7 {
    public static void main(String[] args){
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("ingrese un  número: " + (i+1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Los números egresados son:");

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
         double promedio = (double) suma / numeros.length;
        System.out.println("El promediuo de los numeros es: " + promedio);


    }
}
