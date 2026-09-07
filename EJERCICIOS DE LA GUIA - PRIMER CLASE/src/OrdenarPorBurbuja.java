import java.util.Arrays;
//NOTA, EL PROFESOR USO "temp", como var auxiliar. Yo he cambiado ese termino por "aux", por costumbre

// Arrays.toString() MUESTRA EL CONTENIDO DEL ARREGLO

public class OrdenarPorBurbuja {

    public static void main(String[] args) {

        int[] matriz = {9, 3, 8, 4, 6, 7, 2, 3};

        for (int n = 1; n < matriz.length; n++) {
            // Controla la cantidad de pasadas que se realizan sobre el arreglo.. Imaginemoslo como un lapiz arrastrandose


            for (int i = 0; i < matriz.length - n; i++) {
                // Compara elementos consecutivos
                // Se resta n porque en cada pasada el elemento más grande ya queda colocado al final

                System.out.println("Posición que se esta analizando: "+ i);
                // Muestra la posición que se está analizando

                System.out.println(Arrays.toString( matriz));
                // Muestra cómo está el arreglo antes de realizar la comparación de elementos

                System.out.println((matriz[i]) + " - " + (matriz[i + 1]));
                // Muestra los dos elementos que se van a comparar


                if (matriz[i] > matriz[i + 1]) {
                    // Si el elemento actual es mayor que el siguiente,
                    // significa que están en el orden incorrecto y hay que intercambiarlos.

                    int aux = matriz[i + 1];
                    // Guardamos temporalmente el segundo elemento.

                    matriz[i + 1] = matriz[i];
                    // Colocamos el elemento mayor en la posición siguiente.

                    matriz[i] = aux;
                    // Colocamos el elemento que habíamos guardado
                    // en la posición actual.
                }

                System.out.println(Arrays.toString(matriz));
                // Mostramos el arreglo después de la comparacióN (PUEDE O NO HABER INTERCAMBIO)

            }
        }

        System.out.println(Arrays.toString(matriz));
        // Cuando terminan todos los ciclos, mostramos el arreglo

    }
}