//CLASE 2 - TEMA 3 - EJERCICIO 1
//EJERCICIO 5.4
public class SumarDigitosDeFormaRecursivaeIterativa {


    public static void main(String[] args) {

        int Resultado = sumarDigitos(111);
        int Resul = sumarDigitos(4);
        System.out.println (Resultado);
        System.out.println (Resul);

    }

    public static int sumarDigitos(int n) {

        // Caso base: si n tiene un solo dígito, devolvemos ese dígito.
        if (n < 10) {

            return n;

        }

        // Caso recursivo: sumamos el último dígito con el resultado de volver a llamar al método usando el resto del número

        int recursivo = (n % 10) + sumarDigitos(n / 10); //n / 10 elimina el ultimo digito y n % 10 da el resto de la division.
        return recursivo;
    }

}

// ANALIZAR PROBLEMA: Creamos un método llamado sumarDigitos(int n) que recibe un número entero positivo.
// El método suma todos los dígitos del número utilizando recursividad.
// toma el último dígito y vuelve a llamar al método con el número restante.
// Establecemos un caso base para detener la recursividad cuando el número llega a 0.

//DIAGRAMA: https://miro.com/app/board/uXjVHvS2gP8=/?share_link_id=164752194465