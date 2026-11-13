
public class Producto {

    // Atributos del producto
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Devuelvo el codigo del producto
    public String getCodigo() {
        return codigo;
    }

    // Devuelvo el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Devuelvo el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Devuelvo el stock del producto
    public int getStock() {
        return stock;
    }
}
