import java.util.Scanner;

class CalculadoraEdadPerro {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingresa la edad del Perrito");
        Integer edad = cargaDeDatos.nextInt();
        Integer edadPerruna = edad * 7;
        System.out.println("La edad de tu perrito es " + edadPerruna);
    }
}
