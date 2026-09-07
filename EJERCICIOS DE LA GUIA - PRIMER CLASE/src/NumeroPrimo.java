//CLASE 1 - TEMA 1 - EJERCICIO 1
//Importamos clase Scanner para poder leer
import java.util.Scanner;

// Analizar problema: Ingreso el num, verifico que sea menor o igual a 1, si se cumple la
//  condición, entonces el num no es primo, caso contrario utilizaremos un for que recorra
//  desde el 2 hasta num-1 para verificar si el num es divisible por algún otro num.
// Si su resto en algún momento da distinto de 0, no es primo, de lo contrario, es primo.

// Declaramos la clase NumeroPrimo
public class NumeroPrimo {

    // Definimos Método Principal Main
    public static void main(String[] args) {

        // Declaramos el Objeto Scanner para poder leer los datos ingresados
        Scanner teclado = new Scanner(System.in);

        // Pedimos que ingrese un num
        System.out.print("Ingrese un número: ");

        // Guardamos num ingresado en la variable num
        int num = teclado.nextInt();

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

        // Cerramos el Scanner

        teclado.close();
    }
}

//ANALIZAR PROBLEMA:Analizar Problema: Ingresamos un número entero por teclado.
//  Primero verificamos si el número es mayor que 1, ya que los números menores o iguales a 1 no son primos.
// Luego comprobamos si el número es divisible por algún valor entre 2 y el número anterior.
// Si encontramos un divisor, informamos que el número no es primo.
//  Si no encontramos ningún divisor, informamos que el número es primo.

//DIAGRAMA: https://miro.com/app/board/uXjVHv--02c=/?share_link_id=237833918109