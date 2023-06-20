package Clase6;

import java.util.Scanner;

public class EnlaceWhatsapp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número de telefono: ");
        String telefono = scanner.nextLine();

        String url = "https://api.whatsapp.com/send?phone=" + telefono;
        System.out.println("El enlace de whatsapp es: " + url);

    }
}