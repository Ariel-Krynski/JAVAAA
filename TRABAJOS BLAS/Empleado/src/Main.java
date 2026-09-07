public class Main {

    public static void main(String[] args) {

        //int nro = 34;

        //DEFINO ISNTANCIAS = Clase nomInstancia = new Clase ();
        Empleado e1 = new Empleado("Juan", "Perez", "12232332");
        Empleado e2 = new Empleado("Maria", "Gomez", "34534534");
        Empleado e3 = new Empleado("Pedro", "Gimenez", "345345");
        Empleado e4 = new Empleado("Juan", "Perez", "345345", "Barrio Mujeres Argentinas");

        String nombre1 = e1.getNombre();
        e1.setNombre("Juan Pab");

        String mensaje = e1.trabajando();
        String mensaje2 = e2.trabajando();

        System.out.println(mensaje);
        System.out.println(mensaje2);
        System.out.println(e3.trabajando());

    }
}