public class Main {

    public static void main(String[] args) {

        //DEFINIR ARREGLO
        EmpleadoNyL[] empleados = {
                new EmpleadoNyL("Emmanuel",102),
                new EmpleadoNyL("Daniel", 101),
                new EmpleadoNyL("Ryan", 103),
                new EmpleadoNyL("Ariel", 104)
        };

        //llamar a la clase . metodo (parametro)
        EmpleadoNyL.CalcularLegajoMayorYMenor(empleados);
    }
}