package herencia;
public class Empleado {

    protected String nombre;
    protected int legajo;
    protected double sueldo;


    public Empleado(String nombre, int legajo, double sueldo) {

        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = sueldo;

    }

    public double calcularSueldo() {
        return 0.0;
    }

    @Override  //estoy sobrescribiendo un método que ya existe en la clase padre
    public String toString() {

        //Retorna 0 por defecto
        //return "Nombre: " + nombre +  "(Legajo: " + legajo + " ) " + "$Sueldo: " + calcularSueldo();
        return "Nombre: " + nombre +  "(Legajo: " + legajo + " ) " + "$Sueldo: " + sueldo;

    }

    public double getSueldo() {
        return sueldo;
    }
}
