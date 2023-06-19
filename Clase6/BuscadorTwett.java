package Clase6;
import java.util.Scanner;

class BuscadorTwett{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre del famosoa bu8scar en Twitter: ");
        String nombreFamoso = scanner.nextLine();

        String url = "https://twitter.com/search?q=" + nombreFamoso;
        System.out.println("El Twetter del famosos es :" + url);

    }
}