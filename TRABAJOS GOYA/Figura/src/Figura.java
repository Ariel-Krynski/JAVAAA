//CLASE 6 - TEMA 1 - EJERCICIO 2
//CLASE 7 - TEMA 2 - EJERCICIO 1
//CLASE 7 - TEMA 2 - EJERCICIO 2
public abstract class  Figura implements Comparable<Figura> {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea ();

    public void mostrar() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + calcularArea());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Figura otra) {
        return Double.compare(this.calcularArea(), otra.calcularArea());
    }
}

//Figura no se puede instanciar directamente porque representa ua clase general, abstracta
//Sirve como base para el resto de figuras (en este caso Rectángulo y Círculo)
