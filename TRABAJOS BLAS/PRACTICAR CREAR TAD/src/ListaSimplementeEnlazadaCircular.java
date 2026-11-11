public class ListaSimplementeEnlazadaCircular {

    private class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo primero;
    private int cantidad;

    public ListaSimplementeEnlazadaCircular() {
        primero = null;
        cantidad = 0;
    }

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (primero == null) {
            primero = nuevo;
            nuevo.siguiente = primero;
        } else {
            Nodo actual = primero;

            while (actual.siguiente != primero) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
            nuevo.siguiente = primero;
        }

        cantidad++;
    }

    public void mostrar() {
        if (primero == null) {
            return;
        }

        Nodo actual = primero;

        do {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        } while (actual != primero);
    }

    public int tamanio() {
        return cantidad;
    }
}