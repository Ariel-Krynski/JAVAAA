//CLASE 7 - TEMA 1 - EJERCICIO 1
public class Calculadora {

    //UTILIZANDO SOBRE ESCRITURA CON INT
    public int operar (int a, int b) {
        return a + b;
    }


    //UTILIZANDO SOBRE ESCRITURA CON NUM DOUBLE
    public double operar (double a, double b)  {
        return a + b;
    }

    //UTILIZANDO SOBRE ESCRITURA CON UN ARREGLO
    public int operar (int [] numeros)  {

        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }
}