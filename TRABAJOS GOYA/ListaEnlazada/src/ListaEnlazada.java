public class ListaEnlazada {

    //CLASE NODO CON SU CONSTRUCTOR
    private class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // Referencia al primer nodo de la lista y cantidad de elementos
    private Nodo primero;
    private int cantidad;

    //constructor de la clase lista
    public ListaEnlazada() {
        primero = null;
        cantidad = 0;
    }


    public void insertarInicio(int dato) {
        // Creamos un nuevo nodo con el dato recibido
        Nodo nuevo = new Nodo(dato);

        // El nuevo nodo apunta al que antes era el primero
        nuevo.siguiente = primero;
        primero = nuevo;

        cantidad++;
    }

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        // Si la lista está vacía, el nuevo nodo pasa a ser el primero
        if (primero == null) {
            primero = nuevo;
        } else {

            //crear var auxiliar
            Nodo actual = primero;

            // Avanzamos hasta encontrar el último nodo
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            // El último nodo apunta al nuevo nodo
            actual.siguiente = nuevo;
        }

        cantidad++;
    }

    public boolean buscar(int valor) {
        Nodo actual = primero;

        // Recorremos la lista mientras existan nodos
        while (actual != null) {
            // Si el dato del nodo actual coincide con el valor buscado
            if (actual.dato == valor) {
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

    public int tamanio() {
        return cantidad;
    }

    public void mostrar() {
        Nodo actual = primero;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    public int contarOcurrencias(int valor) {
        int contador = 0;
        Nodo actual = primero;

        while (actual != null) {
            if (actual.dato == valor) {
                contador++;
            }

            actual = actual.siguiente;
        }

        return contador;
    }

    public void eliminarTodas(int valor) {

        // Eliminamos todas las apariciones del valor al principio de la lista
        while (primero != null && primero.dato == valor) {
            //El segundo nodo pasa a ser el primero
            primero = primero.siguiente;
            cantidad--;
        }

        Nodo actual = primero;
        // Recorremos la lista mientras existan el nodo actual y el siguiente
        while (actual != null && actual.siguiente != null) {

            if (actual.siguiente.dato == valor) {

                // Saltamos el nodo que queremos eliminar
                // conectando el nodo actual con el siguiente del que eliminamos
                actual.siguiente = actual.siguiente.siguiente;
                cantidad--;
            } else {
                // Si el dato no coincide, avanzamos al siguiente nodo
                actual = actual.siguiente;
            }
        }
    }

    /*
     * En una ListaEstatica, al eliminar un elemento es necesario desplazar
     * hacia la izquierda los elementos posteriores para mantenerlos contiguos.
     * Si hay varias ocurrencias, estos desplazamientos pueden repetirse.
     *
     * En una ListaEnlazada, basta con modificar las referencias entre nodos
     * para desconectar los elementos que se quiere eliminar, sin desplazar
     * los demás dato
     */
}