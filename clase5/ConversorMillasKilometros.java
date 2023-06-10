package clase5;

import java.util.Scanner;

        class conversorMillas {
    public static void main(String[] args){
        Scanner recibeDatos = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en millas");
        Double distancia = recibeDatos.nextDouble();
        Double conversion = distancia * 1.60934;
        System.out.println("La distancia en kilometros es de " + conversion);
    }
        }
