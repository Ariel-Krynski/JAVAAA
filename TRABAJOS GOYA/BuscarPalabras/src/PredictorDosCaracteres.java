
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;

public class PredictorDosCaracteres {

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

        // Comprobamos que tengamos al menos tres caracteres para poder trabajar
        if (caracteres.size() < 3) {
            System.out.println("No hay suficientes caracteres.");
            return;
        }

        // Elegimos una posición al azar para obtener los dos primeros caracteres
        int inicio = (int) (
                Math.random() * (caracteres.size() - 1)
        );

        // Guardamos los dos caracteres elegidos
        char primero = caracteres.get(inicio);
        char segundo = caracteres.get(inicio + 1);

        // Mostramos los dos primeros caracteres
        System.out.print("" + primero + segundo);

        // Repetimos el proceso hasta generar un máximo de 20 caracteres
        for (int paso = 0; paso < 20; paso++) {

            // Creamos una lista para guardar los caracteres que pueden aparecer después de los dos actuales
            List<Character> posiblesSiguientes = new ArrayList<>();

            // Recorremos la lista buscando todas las apariciones de los dos caracteres juntos
            for (int i = 0; i < caracteres.size() - 2; i++) {

                // Comprobamos si encontramos la misma combinación de dos caracteres
                if (caracteres.get(i) == primero &&
                        caracteres.get(i + 1) == segundo) {

                    // Si coinciden, guardamos el carácter que aparece después
                    posiblesSiguientes.add(caracteres.get(i + 2));
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

            // Mostramos el carácter elegido
            System.out.print(siguiente);

            // Actualizamos los dos caracteres para continuar buscando
            primero = segundo;
            segundo = siguiente;
        }
    }
}
