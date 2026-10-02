public class Pato extends Animal implements Nadador {

    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando");
    }
}