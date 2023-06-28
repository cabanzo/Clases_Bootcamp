package Clase6;

import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego Piedra, Papel, Tijeras!");

        String[] opciones = {"piedra", "papel", "tijeras"};

        while (true) {
            // Obtener la elección del usuario
            System.out.print("Elige tu opción (piedra, papel, tijeras): ");
            String eleccionUsuario = scanner.nextLine().toLowerCase();

            // Verificar la elección del usuario
            if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijeras")) {
                System.out.println("Opción inválida. Por favor, intenta de nuevo.");
                continue;
            }

            // Generar la elección aleatoria de la computadora
            int indiceEleccionComputadora = random.nextInt(3);
            String eleccionComputadora = opciones[indiceEleccionComputadora];

            System.out.println("Computadora elige: " + eleccionComputadora);

            // Determinar el ganador
            if (eleccionUsuario.equals(eleccionComputadora)) {
                System.out.println("Empate!");
            } else if (
                    (eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijeras")) ||
                            (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                            (eleccionUsuario.equals("tijeras") && eleccionComputadora.equals("papel"))
            ) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("Perdiste. ¡Inténtalo de nuevo!");
            }

            // Preguntar al usuario si quiere jugar de nuevo
            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();

            if (!respuesta.equals("s")) {
                break;
            }
        }

        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }
}
