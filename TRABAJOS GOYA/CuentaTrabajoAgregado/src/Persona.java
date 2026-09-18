package CuentaTrabajoAgregado;
public class Persona {

    //NO PUEDO PONER COMO PRIVADOS LOS ATRIBUTOS DE UNA SUPER CLASE
    String nombre;
    String apellido;
    String dni;
    int edad;
    String direccion;
    String telefono;

    public Persona(String nombre, String apellido, String dni, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //POLIMORFISMO: El mismo metodo tiene varias maneras de implementarse dependiendo de la clase. A eso se le llama Polimorfismo
    //Este es el metodo inicial
    public double calcularSueldo() {
        return 100000.0;
    }

    @Override  //estoy sobrescribiendo un método que ya existe en la clase padre
    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nDNI: " + dni +
                "\nEdad: " + edad +
                "\nDirección: " + direccion +
                "\nTeléfono: " + telefono;
    }
}