//EJERCICIO CLASE 5 - TEMA 1 - EJERCICIO 2
public class Main {

    public static void main(String[] args) {

        //DEFINIR ARREGLO
        EmpleadoNyL[] empleados = {
                new EmpleadoNyL("Emmanuel",102),
                new EmpleadoNyL("Daniel", 101),
                new EmpleadoNyL("Ryan", 103),
                new EmpleadoNyL("Ariel", 104)

        };

        EmpleadoNyL[] empleadosPorHoraYAsalariados = {
                new EmpleadoPorHoras("Candela", 233, 45, 1000),
                new EmpleadoAsalariado("Samir", 908, 50000, 10000),
                new EmpleadoPorHoras("Daniel", 101, 35, 1000),
                new EmpleadoAsalariado("Ryan", 103, 60000, 5000)
        };


        //USANDO SOBRE CARGA

        //////////////////////////////////////////
        // Usa el constructor con 4 parámetros
        EmpleadoNyL e1 = new EmpleadoAsalariado("Daniel", 101, 50000, 10000);

        // Usa el constructor con 2 parámetros
        EmpleadoNyL e2 = new EmpleadoAsalariado("Juan", 102);

        System.out.println(e1.calcularSueldo()); //DA UN NUM
        System.out.println(e2.calcularSueldo()); //DA 0
        //////////////////////////////////////////

        /*
        SOBRECARGA: mismo nombre, distinta firma. Se resuelve en compilación.
        Ejemplo: EmpleadoAsalariado("Daniel", 101) o
        EmpleadoAsalariado("Daniel", 101, 50000, 10000).

        SOBRESCRITURA: misma firma, distinta implementación. Se resuelve en ejecución.
        Ejemplo: EmpleadoNyL e = new EmpleadoAsalariado(...);
        e.calcularSueldo();
       */

        // Aunque la referencia es de tipo Empleado (e), se ejecuta el método
        // de la subclase correspondiente gracias al polimorfismo y al
        // binding dinámico

        for (EmpleadoNyL e : empleadosPorHoraYAsalariados) {
            System.out.println(e.getNombre() + ":" + " " + e.calcularSueldo());
        }

        //Empleado por Horas
        EmpleadoNyL e6 = new EmpleadoPorHoras("Candela" , 233, 45, 1000);
        EmpleadoNyL e7 = new EmpleadoPorHoras("Samir" , 908, 35, 1000);

        System.out.println (e1.calcularSueldo());
        System.out.println (e2.calcularSueldo());

        //llamar a la clase ... metodo (parametro)
        EmpleadoNyL.CalcularLegajoMayorYMenor(empleados);

    }
}
