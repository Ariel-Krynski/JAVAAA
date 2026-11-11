
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;

public class PredictorCaracteres {

    public static void main(String[] args) throws IOException {

        // Creamos una lista donde vamos a guardar todos los caracteres del archivo
        List<Character> caracteres = new ArrayList<>();

        // Abrimos el archivo de texto para poder leer su contenido
        FileReader lector = new FileReader("texto.txt");

        int c;

        // Leemos el archivo carácter por carácter hasta llegar al final
        while ((c = lector.read()) != -1) {

            // Convertimos el valor leído a char y lo guardamos en la lista
            caracteres.add((char) c);
        }

        // Cerramos el archivo porque ya terminamos de leerlo
        lector.close();

        // Comprobamos que tengamos al menos dos caracteres para poder trabajar
        if (caracteres.size() < 2) {
            System.out.println("No hay suficientes caracteres.");
            return;
        }

        // Elegimos un carácter al azar para comenzar a generar el texto
        char actual = caracteres.get(
                (int) (Math.random() * caracteres.size())
        );

        // Mostramos el primer carácter
        System.out.print(actual);

        // Repetimos el proceso hasta generar un máximo de 20 caracteres
        for (int paso = 0; paso < 20; paso++) {

            // Creamos una lista para guardar los caracteres que pueden aparecer después del actual
            List<Character> posiblesSiguientes = new ArrayList<>();

            // Recorremos la lista buscando todas las apariciones del carácter actual
            for (int i = 0; i < caracteres.size() - 1; i++) {

                // Si encontramos el carácter actual, guardamos el que aparece después
                if (caracteres.get(i) == actual) {
                    posiblesSiguientes.add(caracteres.get(i + 1));
                }
            }

            // Si no encontramos ningún carácter siguiente, terminamos el ciclo
            if (posiblesSiguientes.isEmpty()) {
                break;
            }

            // Elegimos al azar uno de los caracteres posibles
            int indiceAleatorio = (int) (
                    Math.random() * posiblesSiguientes.size()
            );

            char siguiente = posiblesSiguientes.get(indiceAleatorio);

            // Mostramos el carácter elegido y lo convertimos en el nuevo carácter actual
            System.out.print(siguiente);
            actual = siguiente;
        }
    }
}
