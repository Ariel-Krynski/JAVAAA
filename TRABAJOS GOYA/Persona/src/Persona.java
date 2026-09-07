public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    //TAREA DEL PROFESOR
    //CONSTRUCTOR PARAMETRIZADO
    public Persona (String nombre, String dni, int edad) {

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;

    }

    // Devuelve representación de la persona
    public String toString() {
        return "Bienvenido " + nombre + ". Tu dni es " + dni + " y tu edad es " + edad;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}



