
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MarkovArchivo {

    public static void main(String[] args) throws IOException {

        // Creamos una lista donde vamos a guardar todas las palabras del archivo
        List<String> palabras = new ArrayList<>();

        // Abrimos el archivo de texto para poder leerlo
        BufferedReader lector = new BufferedReader(
                new FileReader("texto.txt")
        );

        String linea;

        // Leemos el archivo línea por línea hasta llegar al final
        while ((linea = lector.readLine()) != null) {

            // Pasamos todo a minúsculas y eliminamos algunos signos de puntuación
            linea = linea.toLowerCase().replaceAll("[.,;:!?]", "");

            // Separamos cada línea en palabras usando los espacios como separación
            String[] partes = linea.split("\\s+");

            // Recorremos las palabras que encontramos en la línea
            for (String palabra : partes) {

                // Si la palabra no está vacía, la agregamos a nuestra lista
                if (!palabra.isEmpty()) {
                    palabras.add(palabra);
                }
            }
        }

        // Cerramos el archivo porque ya terminamos de leerlo
        lector.close();

        // Comprobamos que tengamos al menos dos palabras para poder trabajar
        if (palabras.size() < 2) {
            System.out.println("No hay suficientes palabras.");
            return;
        }

        // Elegimos una palabra al azar para comenzar a generar el texto
        String actual = palabras.get(
                (int) (Math.random() * palabras.size())
        );

        // Mostramos la primera palabra
        System.out.print(actual);

        // Repetimos el proceso hasta generar un máximo de 20 palabras
        for (int paso = 0; paso < 20; paso++) {

            // Creamos una lista para guardar las palabras que pueden aparecer después de la actual
            List<String> posiblesSiguientes = new ArrayList<>();

            // Recorremos la lista buscando todas las apariciones de la palabra actual
            for (int i = 0; i < palabras.size() - 1; i++) {

                // Si encontramos la palabra actual, guardamos la que aparece después
                if (palabras.get(i).equals(actual)) {
                    posiblesSiguientes.add(palabras.get(i + 1));
                }
            }

            // Si no encontramos ninguna palabra siguiente, terminamos el ciclo
            if (posiblesSiguientes.isEmpty()) {
                break;
            }

            // Elegimos al azar una de las palabras posibles
            int indiceAleatorio = (int) (
                    Math.random() * posiblesSiguientes.size()
            );

            String siguiente = posiblesSiguientes.get(indiceAleatorio);

            // Mostramos la palabra elegida y la convertimos en la nueva palabra actual
            System.out.print(" " + siguiente);
            actual = siguiente;
        }
    }
}
