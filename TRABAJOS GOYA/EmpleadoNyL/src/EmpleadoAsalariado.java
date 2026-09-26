//CLASE 6 - TEMA 1 - EJERCICIO 1  Jerarquías con extends y constructores con super()
public class EmpleadoAsalariado extends EmpleadoNyL {

    private double bono;
    private double sueldoBasico;

    //Constructor original
    public EmpleadoAsalariado (String nombre, int legajo, double bono, double sueldoBasico) {

        super(nombre, legajo);

        this.bono = bono;
        this.sueldoBasico= sueldoBasico;

    }

    //Sobrecarga del constructor
    public EmpleadoAsalariado (String nombre, int legajo) {

        super(nombre, legajo);

        this.bono = 0;
        this.sueldoBasico = 0;

    }

    //sobre escritura
    @Override
    public double calcularSueldo(){

        return sueldoBasico + bono;
    }
}
