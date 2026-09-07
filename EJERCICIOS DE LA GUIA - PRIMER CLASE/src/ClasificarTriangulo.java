//CLASE 1 - TEMA 1 - EJERCICIO 2
// ESTOY PROBANDO GIT HUBB
import java.util.Scanner; //importamos clase Scannerrr

public class ClasificarTriangulo {
    public static void main(String[] args) {

        //Declaramos el Objeto Scanner para poder leer los datos ingresadosss
        Scanner teclado = new Scanner(System.in);

        // Ingresamos los tres lados del triángulo
        System.out.print("Ingrese el lado A: ");
        int a = teclado.nextInt();

        System.out.print("Ingrese el lado B: ");
        int b = teclado.nextInt();

        System.out.print("Ingrese el lado C: ");
        int c = teclado.nextInt();

        // Verificamos si es un triangulo valido o no
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("No es un triángulo válido");

            // Verifica si los tres lados son iguales
        } else if (a == b && b == c) {
            System.out.println("Equilátero");

            // Verifica si dos lados son iguales
        } else if (a == b || a == c || b == c) {
            System.out.println("Isósceles");

            // Si todos los lados son diferentes
        } else {
            System.out.println("Escaleno");

        }

        teclado.close(); // Cerramos el Scanner

    }
}

// ANALIZAR PROBLEMA: Analizar Problema: Ingresamos tres valores que representan los lados de un posible triángulo.
//  Primero verificamos si los 3 lados ingresados cumplen las condiciones de un triángulo válido (a+b es mayor que c).
//  Si es válido, se comparan sus lados para clasificarlo como equilátero, isósceles o escaleno.
// Si no cumple la condición, se informa que los valores no forman un triángulo.

// DIAGRAMA: https://miro.com/app/board/uXjVHv90tGs=/?share_link_id=197850867047


//PSEUDO CODIGO CORREGIDO
//INICIO
//    Si a + b > c Entonces
//        Escribir("Error")
//   Sino
//        Si a = b Y b = c Entonces
//            Escribir("Equilatero")
//        Sino
//            Si a = b O b = c Entonces
//                Escribir("Isosceles")
//          Sino
//              Escribir("Escaleno")
//          FinSi
//      FinSi
//  FinSi
// Fin