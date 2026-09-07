import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    private String dni;
    private String direccion;
    private LocalDate fechaNacimiento;
    int dinero;

    // Es private para aplicar ENCAPSULAMIENTO
    // No puede ser accedido directamente desde fuera de la clase

    //ESTE ES UN CONSTRUCTOR PARAMETRIZADO PORQUE TIENE PARAMETROS
    public Persona(String nombre, String apellido, String dni) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario =  00;
        this.direccion = "SIN DIRECCION";
        this.edad = 9;

    }

    public String saludar() {
        return "Bienvenido a tu clase del 04/09/26 : " + nombre + " " + apellido + " Edad : " + CalcularEdad();
    }

    // El metodo setter va a recibir una fecha de nacimiento y la va a guardar en el atributo fechaNacimiento
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int CalcularEdad() {
        LocalDate ahora = LocalDate.now(); //Creamos una variable a la cual le asignamos la fecha actual

        return Period.between(fechaNacimiento, ahora).getYears(); //retornamos
    }

    //GETTERS Y SETEERS

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { //Si cuando modificamos el nombre... Pasa x, hacer y
        if (nombre == null || nombre.trim().isEmpty()) {
            throw  new IllegalArgumentException ("El nombre no puede estar vacio");
        }

        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

}