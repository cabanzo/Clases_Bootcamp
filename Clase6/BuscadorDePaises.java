package Clase6;
import java.util.Scanner;

class BuscadorPaisesGoogleMaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un país: ");
        String pais = scanner.nextLine();

        String url = "https://www.google.com/maps/search/" + pais;

        System.out.println("Enlace de búsqueda: " + url);
        // Aquí podrías abrir la ubicación automáticamente utilizando la clase java.awt.Desktop
        // o simplemente copiar y pegar el enlace en tu navegador web para abrirlo manualmente.
    }
}
