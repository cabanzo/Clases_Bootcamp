package PracticaEvaluacion;

public class SumaMultiplosDe2 {
    public static void main(String[] args){
        int tope = 1000;
        int suma = 0;

        for (int i = 2; i < tope; i += 2){
            suma += i;
        }
        System.out.println("La suma de los multiplos de 2 menores a " + tope + "es " + suma);
    }
}
