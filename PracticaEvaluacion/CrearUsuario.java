package PracticaEvaluacion;

import java.util.Scanner;

public class CrearUsuario {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String telefono;

    public CrearUsuario() {
    }

    public CrearUsuario(int id, String nombre, String apellido, String email, String password, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
    }

    public void imprimirDatosUsuario() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Email: " + email);
        System.out.println("Teléfono: " + telefono);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        CrearUsuario usuario = new CrearUsuario(id, nombre, apellido, email, password, telefono);
        usuario.imprimirDatosUsuario();

        scanner.close();
    }
}
