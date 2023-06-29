package PracticaEvaluacion;

public class SumaDeMultiplos3y5 {
    public static void main(String[] args){
        int tpoe = 1000;
        int suma = 0;

        for (int i = 0; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                suma += i;
            }
        }
        System.out.println("La suma de los multiplos de 3 0 5 menores a " + tpoe + "es: " + suma);

    }
}
