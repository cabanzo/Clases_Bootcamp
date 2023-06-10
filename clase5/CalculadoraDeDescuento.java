package clase5;

import java.util.Scanner;

class calculadoraDescuento {
    public static void main(String[] args) {
        Scanner cargarDescuento = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precioOriginal = cargarDescuento.nextDouble();

        System.out.println("Escriba el valor del descuento en porcentaje de 1 a 100");
        double descuento = cargarDescuento.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("El valor final aplicando el descuento es de " + precioFinal);
    }
}
