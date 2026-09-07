//CLASE 1 - TEMA 3 -  EJERCICIO 1
import java.util.Scanner;

public class HolaProgramacion {

    //SALIDA DE COMANDOS
    //java version "26.0.2" 2026-07-21
    //javac 26.0.2

    // Declaramos el objeto Scanner para poder leer datos ingresados
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) { //Metodo principal Main, debemos de llamarlo desde aquí

        // Llamamos a la función y le pasamos el nombre que queramos
        saludarUsuario("Ariel");
    }

    public static void saludarUsuario(String nombre) {

        // Cuando el código llame a la función, imprimirá esto:
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Programación II.");

        System.out.println("ADIOS " + nombre); // Línea de prueba
    } // Fin de la función
}
