//CLASE 2 - TEMA 3 - EJERCICIO 2
public class Potencia {


    public static void main(String[] args) {

        int base = 2;
        int exponente = 8;

        int resultadoRecursivo = potenciaRecursiva(base, exponente);
        int resultadoIterativo = potenciaIterativa(base, exponente);

        System.out.println("Resultado recursivo: " + resultadoRecursivo);
        System.out.println("Resultado iterativo: " + resultadoIterativo);

        // Confirmamos que ambas versiones dan el mismo resultado
        if (resultadoRecursivo == resultadoIterativo) {
            System.out.println("Ambas versiones devuelven el mismo resultado");
        }
    }

    // Versión recursiva
    public static int potenciaRecursiva(int base, int exponente) {

        // Caso base, cualquier número elevado a 0 es 1
        if (exponente == 0) {
            return 1;
        }

        // Caso recursivo, va a ir resolviendo "de atras hacia adelante"
        int resultado = base * potenciaRecursiva(base, exponente - 1); //NOTA: puedo retornar directamente esto tambien, sin ponerlo en una variable
        return resultado;
    }

    // Versión iterativa: vamos multiplicando de uno en uno
    public static int potenciaIterativa(int base, int exponente) {

        int resultado = 1;

        // Repetimos la multiplicación según el exponente
        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }

        return resultado;
    }

}

// Entre las dos versiones implementadas, se recomienda la versión iterativa para un programa real con exponentes grandes.
// La versión recursiva realiza una llamada al método por cada unidad del exponente, por lo que puede consumir mucha memoria de la pila si el exponente es muy grande.
// La versión iterativa utiliza un ciclo for y no genera llamadas recursivas, por lo que es más segura para exponentes grandes

// ANALIZAR PROBLEMA: Creamos una clase llamada Potencia que contiene dos métodos para calcular una potencia.
// El método potenciaRecursiva(int base, int exponente) calcula la potencia utilizando recursividad,
// mientras que el método potenciaIterativa(int base, int exponente) la calcula mediante un ciclo for.
// LLamamos a ambos métodos desde el main con la misma base y exponente,
// mostramos los resultados y comprobamos que ambas versiones devuelvan el mismo resultado

//DIAGRAMA: https://miro.com/app/board/uXjVHvShtyI=/?share_link_id=550197477609