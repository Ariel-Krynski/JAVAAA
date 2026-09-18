import java.util.ArrayList;

public class Concesionaria {

    // Atributos de la concesionaria
    private String nombre;
    private ArrayList<Vehiculo> vehiculos; //Declaro un atributo privado llamado vehiculos, que es una lista de objetos Vehiculo

    // Constructor
    public Concesionaria(String nombre) {
        this.nombre = nombre;

        // Creamos la lista donde se van a guardar los vehículos
        this.vehiculos = new ArrayList<>();
    }

    // Agrega un vehículo a la lista
    public void agregarVehiculo(Vehiculo nuevoVehiculo) {
        vehiculos.add(nuevoVehiculo);
    }

    // BUSCAR VEHICULO POR SU MARCA
    public Vehiculo buscarPorMarca(String marca) {

        // Recorremos todos los vehículos de la lista
        for (Vehiculo vehiculo : vehiculos) {

            // Comparamos la marca buscada con la marca del vehículo
            if (vehiculo.getMarca().equals(marca)) { //.equals() FUNCIONA COMO ==, compara contenido de texto

                return vehiculo;
            }
        }
        // SI NO ENCUENTRA NADA
        return null;
    }

    // CALCULAR VALOR $ DEL STOCK
    public double valorTotalStock() {

        double total = 0;

        // Recorremos todos los vehículos
        for (Vehiculo v : vehiculos) { // : se lee “en” // v = var temporal para recorrer

            // Sumamos el precio de cada uno
            total += v.getPrecio();
        }


        return total;
    }
}