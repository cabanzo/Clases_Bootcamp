package clase5;
import java.util.Scanner;

class CalculadoraPropinas {
    public static void main(String[] args) {
        Scanner cargarPropinas = new Scanner(System.in);
        System.out.println("Ingrese el valor de la cuenta del Restaurante ");
        double totalCuenta = cargarPropinas.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar ");
        double porcentajePropina = cargarPropinas.nextDouble();
        double totalPropina = totalCuenta * (porcentajePropina / 100);
        System.out.println("El valor de la propina es " + totalPropina);
    }
}
