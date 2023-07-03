package PracticaEvaluacion;

public class SumaImpares {

    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i < 1000; i += 2) {
            suma += i;
        }

        System.out.println("La suma de los números impares menores a 1000 es: " + suma);
    }
}
