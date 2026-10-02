public class Main {

    public static void main(String[] args) {

        //No necesitamos crear un objeto para utilkizarlo, son miembros de la clase
        Empleado empleado1 = new Empleado();

        // empleado1.mostrarSueldo(); forma en la que no es static, es decir, el metodo pertenece a un empleado puntualmente
        Empleado.mostrarSueldoBase();

    }
}