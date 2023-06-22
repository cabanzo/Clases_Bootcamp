package Clase6;

import java.util.Scanner;

public class EligeTuPropiaAventura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a tu aventura!");
        System.out.println("Estás caminando por un oscuro bosque y encuentras dos caminos frente a ti.");
        System.out.println("¿Cuál camino eliges? (1/2)");

        int camino = scanner.nextInt();

        if (camino == 1) {
            System.out.println("Has elegido el camino de la izquierda.");
            System.out.println("Te encuentras con un río y no puedes cruzarlo.");
            System.out.println("¿Qué haces? (1/2)");
            System.out.println("1. Buscar un puente.");
            System.out.println("2. Intentar nadar.");

            int decision = scanner.nextInt();

            if (decision == 1) {
                System.out.println("Encuentras un puente y lo cruzas de manera segura.");
                System.out.println("Felicidades, has superado el primer obstáculo.");
            } else if (decision == 2) {
                System.out.println("Intentas nadar, pero te arrastra la corriente y te quedas atrapado.");
                System.out.println("Fin del juego.");
            } else {
                System.out.println("Opción inválida.");
            }
        } else if (camino == 2) {
            System.out.println("Has elegido el camino de la derecha.");
            System.out.println("Encuentras una cueva oscura.");
            System.out.println("¿Qué haces? (1/2)");
            System.out.println("1. Entrar a la cueva.");
            System.out.println("2. Seguir caminando por el bosque.");

            int decision = scanner.nextInt();

            if (decision == 1) {
                System.out.println("Entras a la cueva y encuentras un tesoro escondido.");
                System.out.println("¡Felicidades, has ganado el juego!");
            } else if (decision == 2) {
                System.out.println("Decides seguir caminando y te pierdes en el bosque.");
                System.out.println("Fin del juego.");
            } else {
                System.out.println("Opción inválida.");
            }
        } else {
            System.out.println("Opción inválida.");
        }

        scanner.close();
    }
}
