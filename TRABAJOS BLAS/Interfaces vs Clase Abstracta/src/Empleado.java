public class Empleado extends Persona implements Nadador {

    public Empleado(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando");
    }
}