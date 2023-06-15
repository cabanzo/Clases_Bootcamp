package clase5;
import java.util.Scanner;
public class EdadPromedio {
   public static void main(String[] args){
        Scanner edadPromedio = new Scanner(System.in);

    String nombre1;
    String nombre2;
    String nombre3;
    Integer edad1;
    Integer edad2;
    Integer edad3;

    System.out.println("Ingrese el nombre de la persona 1: ");
    nombre1 = edadPromedio.nextLine();
    System.out.println("Ingrese la edad de la persona 1: ");
    edad1 = edadPromedio.nextInt();
    edadPromedio.nextLine();

    System.out.println("Ingrese el nombre de la persona 2: ");
    nombre2 = edadPromedio.nextLine();
    System.out.println("Ingrese la edad de la persona 2: ");
    edad2 = edadPromedio.nextInt();
    edadPromedio.nextLine();

    System.out.println("Ingrese el nombre de la persona 3: ");
    nombre3 = edadPromedio.nextLine();
    System.out.println("Ingrese la edad de la persona 3: ");
    edad3 = edadPromedio.nextInt();
    edadPromedio.nextLine();

    String personaMayor;
    String personaMenor;
    Integer edadMayor;
    Integer edadMenor;

    //Comparar las edades para determinar la persona de mayor edad
    if (edad1 >= edad2 && edad1 >= edad3) {
     personaMayor = nombre1;
     edadMayor = edad1;
    }
    else if (edad2 >= edad1 && edad2 >= edad3){
     personaMayor = nombre2;
     edadMayor = edad2;
    }
    else {
     personaMayor = nombre3;
     edadMayor = edad3;
    }
    // Comparar las edades para determinar la persona de menor edad
    if (edad1 <= edad2 && edad1<= edad3){
     personaMenor = nombre1;
     edadMenor = edad1;
    } else if (edad2 <= edad1 && edad2 <= edad3) {
     personaMenor = nombre2;
     edadMenor = edad2;
    }
    else {
     personaMenor = nombre3;
     edadMenor = edad3;
    }

    // Mostrar en pantalla los resultados de la pantalla
    System.out.println("La persona de mayor edad es: " + personaMayor + " con " + edadMayor + " años" );
    System.out.println("La persona de menor edad es: " + personaMenor + " con " + edadMenor + " años");

    edadPromedio.close(); // Cerrar el objeto Scanner para liberar recursos
   }
}
