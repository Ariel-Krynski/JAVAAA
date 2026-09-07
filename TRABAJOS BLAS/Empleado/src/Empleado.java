//ENCAPSULAMIEMNTO
public class Empleado { //CLASE EMPLEADO

    //DEFINIMOS ATRIBUTOS
    String nombre;
    String apellido;
    double salario;
    String dni;
    String direccion;

    //Creamos un CONECTORES (con el mismo podemos hacer que ciertos valores sean determinados para los atributos)
    public Empleado(String nombre, String apellido, String dni) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

    }

    public Empleado(String nombre, String apellido, String dni, String direccion) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = "direccionERROR";

    }

    //METODOS LLAMADOS DESDE EL MAIN
    public String trabajando() {
        return nombre + " " + apellido + " esta trabajando";
    }

    //GETTER Y SETTER: GET RETURNA Y SET ME PERMITE MODIFICAR EL VALOR DE LA INSTANCIA
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

}

