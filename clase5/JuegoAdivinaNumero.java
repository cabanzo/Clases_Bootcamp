package clase5;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero {
    public static void main(String[] args){
        jugar();
    }
    public static void jugar(){
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número entre 1 y 100. ¿Puedes adivinar cuál es?");

        Scanner scanner = new Scanner(System.in);

        while (true){
            intentos++;
            System.out.println("Introduce tu suposición: ");
            int adivinanza = scanner.nextInt();

            if (adivinanza < numeroSecreto){
                System.out.println("Es un número mas alto. Sigue intendolo. ");
            } else if (adivinanza > numeroSecreto) {
                System.out.println("Es un número más bajo. Sigue intentándolo.");
            } else {
                System.out.println("¡Felicidades! ¡Adivinaste el número en " + intentos + " intentos!");
                break;
            }
        }
        scanner.close();
    }
}