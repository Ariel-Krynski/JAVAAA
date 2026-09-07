// EJERCICIO 5.7 - FACTORIAL VERSION ITERATIVA

public class FactorialItera {

    public static void main(String[] args) {

        factorialVersionIterativa57(5);

    }

    public static void factorialVersionIterativa57(int n) {

        long resultado = 1; // Variable donde se va acumulando el resultado

        // Recorre los números desde 2 hasta n
        for (int i = 2; i <= n; i++) {

            resultado = resultado * i; // Multiplica el resultado por el número actual

        }

        System.out.println(resultado); // Muestra el factorial calculado

    }

}