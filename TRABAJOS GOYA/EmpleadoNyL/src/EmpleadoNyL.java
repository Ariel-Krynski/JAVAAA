public class EmpleadoNyL {
    private String nombre;
    private int legajo;

    //CONSTRUCTOR
    public EmpleadoNyL(String nombre, int legajo) {

        this.nombre = nombre;
        this.legajo = legajo;

    }

    public double CalcularSueldo() {
        return 0; //LO AVANZAMOS EN LA CLASE 6
    }

    //METODO
    public static void CalcularLegajoMayorYMenor(EmpleadoNyL[] empleados) {

        int menor = 1000000;
        int mayor = 0;

        for (int i = 0; i < empleados.length; i++) {

            if (empleados[i].getLegajo() < menor) {
                menor = empleados[i].getLegajo();
            }

            if (empleados[i].getLegajo() > mayor) {
                mayor = empleados[i].getLegajo();
            }
        }

        System.out.println("Legajo menor: " + menor);
        System.out.println("Legajo mayor: " + mayor);
    }



    //GETTERS Y SETTERS
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
