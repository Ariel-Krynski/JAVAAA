// EJERCICIO 5.7 - sumar digitos VERSION ITERATIVA

public class SumarDigitosVersionIterativa {

    public static void main(String[] args) {

        sumarDigitosITERATIVO(1234);

    }

    public static void sumarDigitosITERATIVO(int numero) {

        int suma = 0; // Variable donde se va acumulando la suma de los dígitos

        // Mientras el número sea mayor que 0
        while (numero > 0) {

            suma += numero % 10; // Obtiene el último dígito y lo suma

            numero /= 10; // Elimina el último dígito

        }

        System.out.println("La suma de los dígitos es: " + suma);
        //return suma; podemos hacer esto tambien y eliminar lo anterior

    }

}

// ANALIZAR PROBLEMA: Creamos una clase llamada SumarDigitosVersionIterativa.
// El método recibe un número y utiliza un ciclo while para recorrer sus dígitos.
// La variable suma acumula el valor de cada dígito, mientras que numero % 10 obtiene el último dígito y numero /= 10 lo elimina.
// Llamamos al método desde el`main pasando el número 1234 y mostramos la suma de sus dígitos en pantalla.

//DIAGRAMA: https://miro.com/app/board/uXjVHvSKvhc=/?share_link_id=227733656329