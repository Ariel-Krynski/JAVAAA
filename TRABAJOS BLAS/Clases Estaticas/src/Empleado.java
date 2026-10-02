public class Empleado {

    //Al ser Static, no necesita instanciarse
    //La idea es que sueldoBase es static, entonces pertenece a la clase Empleado, no a un empleado particular.
    static double sueldoBase = 100000;

    public static void mostrarSueldoBase() {
        System.out.println("Sueldo base: $" + sueldoBase);
    }
}
