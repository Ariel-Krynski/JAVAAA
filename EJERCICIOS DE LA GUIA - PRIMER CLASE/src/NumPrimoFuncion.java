//CLASE 1 - TEMA 3 - EJERCICIO 2
import java.util.Scanner; //Importamos clase Scanner para poder leer

public class NumPrimoFuncion { //Creamos la clase NumPrimoFuncion

    public static void main(String[] args) { //Clase Principal

        // Declaramos el Objeto Scanner para poder leer los datos ingresados
        Scanner teclado = new Scanner(System.in);

        // Pedimos que ingrese un num
        System.out.print("Ingrese un número: ");
        // Guardamos num ingresado en la variable num
        int num = teclado.nextInt(); //Asignamos lo ingresado en la var num
        EsPrimo(num); //Llamamos a la funcion EsPrimo

        // Cerramos el Scanner
        teclado.close();

    }

    public static void EsPrimo(int num) { //Funcion

        // Comprobamos si num es menor o igual a 1
        if (num <= 1) {

            //Si se cumple la condición, entonces el num no es primo
            System.out.println(num + " no es primo");

        } else { //sino se cumple la condición

            // Recorremos los posibles divisores desde 2 hasta num-1
            for (int i = 2; i < num; i++) { //i se inicializa en 2, mientras i sea menor que num, seguirá recorriendo y se va a incrementar +1

                // Si el número se puede dividir exactamente por i, entonces no es primo
                if (num % i == 0) {

                    System.out.println("El num no es primo");
                    return;   // Retornamos y salimos del for
                }
            }

            // Si el for terminó sin encontrar ningún divisor, el num es primo
            System.out.println("El num es primo");
        }

    }

}

// DIAGRAMA: https://miro.com/app/board/uXjVHvKn_n8=/?share_link_id=745991129760