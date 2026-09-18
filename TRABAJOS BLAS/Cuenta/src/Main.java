import herencia.Docente;

public class Main {

    public static void main(String[] args) {

        // UTILIZANDO ASOCIACION
        Cliente cliente1 = new Cliente("Beto Acosta", 20000, "3488290", "Calle 12");
        Cliente cliente2 = new Cliente("Juan Perez", 30000, "1234567", "Calle 15");

        Cuenta cta1 = new Cuenta(cliente1);
        Cuenta cta2 = new Cuenta(cliente2);
        Cuenta cta3 = new Cuenta(cliente1); // repetido, consta de 2 cuentas

        // FORMA SIN USAR ASOCIACION
        // Cuenta cta1 = new Cuenta("Beto Acosta");

        // Creamos arreglo de las cuentas
        Cuenta[] cuentas = {cta1, cta2, cta3};

        // Buscamos a un determinado cliente en esas cuentas
        // Nos aparecen las cuentas que tenga
        Cuenta.buscarCuentas(cliente1, cuentas);


        // UTILIZANDO HERENCIA //EN JAVA SOLO PODEMOS USAR HERENCIA SIMPLE
        Docente d1 = new Docente("Ariel", "Perez", "12345678", 25, "Calle 10", "3624000000", 60, "Titular"
        );

        System.out.println(d1);
        System.out.println("Sueldo: " + d1.calcularSueldo());
    }
}