// EJERCICIO 5.7 - FACTORIAL VERSION ITERATIVA

public class FactorialVersionIterativa{

    public static void main(String[] args) {

        factorialITERATIVA(5);

    }

    public static void factorialITERATIVA(int n) {

        long resultado = 1; // Variable donde se va acumulando el resultado

        // Recorre los números desde 2 hasta n
        for (int i = 2; i <= n; i++) {

            resultado = resultado * i; // Multiplica el resultado por el número actual

        }

        System.out.println("El factorial de " + n + " es " + resultado); // Muestra el factorial calculado

    }

}

// ANALIZAR PROBLEMA: Creamos una clase llamada FactorialVersionIterativa que contiene un método para calcular el factorial de un número de forma iterativa.
// El métod recibe un número y utiliza un ciclo for para multiplicar todos los números desde 2 hasta n.
// La variable resultado acumula las multiplicaciones y guarda el factorial calculado.
// Llamamos al método desde el main pasando el número 5 y mostramos el resultado en pantalla.

// DIAGRAMA: https://miro.com/app/board/uXjVHvSAQwc=/?share_link_id=67627412272

