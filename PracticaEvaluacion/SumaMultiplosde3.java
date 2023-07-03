package PracticaEvaluacion;

public class SumaMultiplosde3 {


        public static void main(String[] args) {
            int suma = 0;

            for (int i = 3; i < 1000; i += 3) {
                suma += i;
            }

            System.out.println("La suma de los múltiplos de 3 menores a 1000 es: " + suma);
        }
    }




