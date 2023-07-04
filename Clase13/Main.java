package Clase13;
import java.util.Scanner;

// Clase principal Main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Crear triángulo");
            System.out.println("2. Crear rectángulo");
            System.out.println("3. Crear círculo");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los lados del triángulo:");
                    double lado1 = scanner.nextDouble();
                    double lado2 = scanner.nextDouble();
                    double lado3 = scanner.nextDouble();
                    Figura triangulo = new Triangulo(lado1, lado2, lado3);
                    System.out.println("Área del triángulo: " + triangulo.calcularArea());
                    System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                    break;
                case 2:
                    System.out.println("Ingrese la base y la altura del rectángulo:");
                    double baseRectangulo = scanner.nextDouble();
                    double alturaRectangulo = scanner.nextDouble();
                    Figura rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("Ingrese el radio del círculo:");
                    double radioCirculo = scanner.nextDouble();
                    Figura circulo = new Circulo(radioCirculo);
                    System.out.println("Área del círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}
