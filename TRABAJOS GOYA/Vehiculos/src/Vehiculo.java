///
public class Vehiculo {

    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo (String marca, String vehiculo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    //GETTERS Y SETTERS
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override //Sobreescribir toString()
    public String toString() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Precio: $" + precio;
    }
}
