package Clase8;

import java.util.Scanner;
public class CalcularAreaTriangulo {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la base del triangulo: ");
        double base = teclado.nextDouble();

        System.out.println("Ingresa la altura del triangulo");
        double altura = teclado.nextDouble();

        double area = calcularArea(base, altura);

        System.out.println("El area del triangulo es:" + area);
    }
    public static double calcularArea (double base, double altura){
        double area = (base * altura) / 2;
        return area;
    }
}
