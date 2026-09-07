//CLASE 2 - TEMA 1 - EJERCICO 1
public class EjerciciosMetodos { //Clase Principal

    public static void main(String[] args) {

        TablaDeMultiplicar (2);              //Llamamos al procedimiento TablaDeMultiplicar y le asignamos un valor
        int[] valores = {156, 8, 7, 9, 6};     // Definimos un arreglo
        promedio(valores);                    // Llamamos a la función promedio y le asignamos un arreglo

    }

    public static void TablaDeMultiplicar (int n) {

        // Es un procedimiento porque realiza una acción

        for (int i = 0; i <= 10; i++) {  //Empieza a recorrer en 0 hasta el 10. Se va incrementante +1

            System.out.println( n + " x " +  i + " = " + (n * i)); //imprime el resultado de la multiplicación de i x el valor que le demos
        }

    }

    public static double promedio(int[] valores) {

        // Es una función porque realiza un calculo y devuelve un valor
        int suma = 0;  //suma vale 0

        for (int i = 0; i < valores.length; i++) { //Empieza a recorrer en 0 hasta la cantidad de elementos del arreglo y se incrementa +1

            suma = suma + valores[i]; //suma va a ir sumando los elementos del arreglo
        }

        double promedio = suma / valores.length;  // Definimos que promedio será la suma total / la cantidad de elementos que contiene el arreglo
        System.out.println("El promedio es: " + promedio);  //Imprimimos el promedio

        return promedio;


    }

}

// En Java esta distinción no existe a nivel de sintaxis porque Java considera ambos como métodos. La diferencia
// está en el tipo de retorno (un valor o void).

//ANALIZAR PROBLEMA: Creamos una clase llamada EjerciciosMetodos que contiene dos métodos.
// Primer tablaDeMultiplicar(int n) recibe un número y muestra su tabla de multiplicar del 1 al 10.
//  Promedio(int[] valores) recibe varios valores, los suma y calcula su promedio.
// Finalmente, llamamos a los dos métodos desde el main.

//DIAGRAMA DE TABLA DE MULTIPLICAR: https://miro.com/app/board/uXjVHvSkDhM=/?share_link_id=328524890873
//DIAGRAMA DE PROMEDIO: https://miro.com/app/board/uXjVHvSn5Fk=/?share_link_id=575430200893