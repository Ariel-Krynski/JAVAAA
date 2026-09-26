//CLASE 6 - TEMA 1 - EJERCICIO 1 Jerarquías con extends y constructores con super()
public class EmpleadoPorHoras extends EmpleadoNyL {

    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras (String nombre, int legajo, int horasTrabajadas , double valorHora) {

        super(nombre, legajo);

        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;

    }

    //sobre escritura
    @Override
    public double calcularSueldo(){
        if (horasTrabajadas > 40) {
            double sueldoTotal = horasTrabajadas * valorHora;
            return sueldoTotal;
        }
        return 10000;
    }


}
