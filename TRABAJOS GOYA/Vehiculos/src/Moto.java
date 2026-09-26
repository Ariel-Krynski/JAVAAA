// Clase 6 - Tema 2 - Ejercicio 2
public class Moto extends Vehiculo {

    private int cilindrada;


    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Cilindrada: " + cilindrada;
    }

}
