package herencia;
public class EmpleadoPorHoras extends Empleado {

    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, double sueldo, int legajo, double horasTrabajadas, double valorHora) {

        super(nombre, legajo, sueldo);

        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {

        //Esto lo dejamos solo en el caso de querer que el sueldo por defecto sea 0, pero si ingresamos el sueldo
        // Como en este caso calculamos el sueldo usando las horas trabajadas, no nos conviene usar super.calcularSueldo()
        double sueldo = super.calcularSueldo();

        if (this.horasTrabajadas > 40) {
            sueldo += sueldo * 0.2;
        }

        return sueldo;
    }
}
