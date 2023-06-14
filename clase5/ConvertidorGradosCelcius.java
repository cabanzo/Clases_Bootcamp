package clase5;
import java.util.Scanner;

class ConvertidorGradosCelcius{
    public static void main(String[] args) {
        Scanner ingresaCelcius = new Scanner(System.in);
        System.out.println("Ingresa el valor en grados Celcius");
        double valorCelcius = ingresaCelcius.nextDouble();
        double valorFahrenheit = valorCelcius * 9/5 + 32;
        System.out.println("El valor en Grados Fahrenheit es " + valorFahrenheit);
    }
}