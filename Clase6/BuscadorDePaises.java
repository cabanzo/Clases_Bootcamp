package Clase6;
import java.util.Scanner;

public class BuscadorDePaises {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un pais:  ");
        String pais = scanner.nextLine();

        String url = "https://www.google.com/maps/search/" + pais;

        System.out.println("Enlace de búsqueda: " + url);


    }
}
