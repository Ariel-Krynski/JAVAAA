public class MiLista {

    //No hace falta guardar todos, solo necesito el primero, el primero me dara acceso a todos los otros
    Nodo primero;

    //Agregar Elemento a la lista al principio //VER
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo (dato);
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
    }

    //Esto es redundante, por defecto primero estara apuntando a null
    public MiLista() {
        primero = null;
    }

    //Nodo primero y actual son los mismos. Son variables que son utilizadas como punteros
    public void recorrer() {
        Nodo actual = primero;

        while (actual != null) {
            System.out.println (actual.dato + "----");
            actual = actual.siguiente;

        }

    }
}
