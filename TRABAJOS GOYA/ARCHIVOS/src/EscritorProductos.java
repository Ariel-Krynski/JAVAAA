
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscritorProductos {

    // Guardo los productos en un archivo CSV
    public static void guardarCSV(ArrayList<Producto> productos, String archivo) {

        // Abro el archivo para escribir
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {

            // Recorro la lista de productos
            for (Producto producto : productos) {

                // Obtengo los datos de cada producto y los separo por comas
                String linea = producto.getCodigo() + ","
                        + producto.getNombre() + ","
                        + producto.getPrecio() + ","
                        + producto.getStock();

                // Escribo los datos en el archivo
                writer.write(linea);

                // Paso a la siguiente linea
                writer.newLine();
            }

            System.out.println("Archivo generado correctamente");

        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Creo la lista de productos
        ArrayList<Producto> productos = new ArrayList<>();

        // Agrego los productos a la lista
        productos.add(new Producto("P001", "Teclado", 25000, 10));
        productos.add(new Producto("P002", "Mouse", 12000, 15));
        productos.add(new Producto("P003", "Monitor", 180000, 5));

        // Llamo al metodo para guardar los productos
        guardarCSV(productos, "productos.csv");
    }
}
