package herencia;

public class Docente extends Persona {  //FORMA DE HACER QUE UNA CLASE (Docente) HEREDE UNA SUPER CLASE (Persona)

    double hsTrabajadas;  //SOLO AGREGAMOS LOS ATRIBUTOS QUE NO SE ENCUENTRAN EN LA SUPER CLASE
    String cargo;

    public Docente(String nombre, String apellido, String dni, int edad, String direccion, String telefono, double hsTrabajadas, String cargo) {

        super(nombre, apellido, dni, edad, direccion, telefono); //super esta siendo como un puntero hacia la clase padre

        this.cargo = cargo;
        this.hsTrabajadas = hsTrabajadas;
    }

    @Override //SE UTILIZA PARA LLAMAR A UN METODO DE UNA SUPER CLASE Y PODER SOBREESCRIBIRLO
    public double calcularSueldo() {
        double sueldo = super.calcularSueldo(); //super = "puntero". dice que el sueldo tiene esa base

        if (this.hsTrabajadas > 50) {
            sueldo += sueldo * 0.1;
        }

        return sueldo;
    }
}