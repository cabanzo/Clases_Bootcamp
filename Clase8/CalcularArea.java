package Clase8;
import java.util.Scanner;
public class CalcularArea {

    public static double calcularElArea(double lado){
        double area = lado * lado;
        return area;
    }
    public static void main(String[] args){
        Scanner teclaco = new Scanner(System.in);

        System.out.println("Ingerse el valor del lado del cuadrado: ");
        double lado = teclaco.nextDouble();

        double calcularArea = calcularElArea(lado);
        System.out.println("El area del cuadrado es: " + calcularArea);
    }
}
