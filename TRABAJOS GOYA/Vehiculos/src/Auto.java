// Clase 6 - Tema 2 - Ejercicio 2
public class Auto extends Vehiculo {
    private int cantidadDePuertas;

    public Auto(String marca, String vehiculo, double precio, int cantidadDePuertas) {
        super(marca, vehiculo, precio);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Cantidad de Puertas: " + cantidadDePuertas;
    }

}
