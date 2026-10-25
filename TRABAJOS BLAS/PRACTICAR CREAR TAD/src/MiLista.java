public class MiLista {

    //No hace falta guardar todos, solo necesito el primero, el primero me dara acceso a todos los otros
    private Nodo primero;
    private Nodo actual;
    private int size;

    //nuevo 22/10
    //Agregar Elemento a la lista al principio
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo (dato);
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
        size++;
    }

    //Esto es redundante, por defecto primero estara apuntando a null
    public MiLista() {
        primero = null;
    }

    public void agregarFinal(int dato) {
        Nodo nuevo = new Nodo (dato);

        if (primero == null) {
            primero = nuevo;


        } else {
            Nodo actual = primero;

            while (actual.siguiente != null ) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
        size++;
    }

    //nuevo 22/10
    public boolean contiene(int dato) {
        actual = primero;

        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }

            actual = actual.siguiente;
        }

        System.out.println("FIN");
        return false;
    }

    //nuevo 22/10
    public void eliminarPrimero() {
        if (primero == null) {
            return;
        }
        primero = primero.siguiente;
        size--;
    }

    //nuevo 22/10
    public void eliminarFinal() {
        if (primero == null) {
            return;
        }
        if (primero.siguiente == null ) {
            primero = null;
        } else {
            Nodo actual = primero;

            while (actual.siguiente != null ) {
                actual = actual.siguiente;
            }
            actual.siguiente = null;

        }
        size--;
    }

    //nuevo 22/10
    // tarea
    public void eliminarDato (int dato) {
       // verificasr si no esta en el primero
        //recorrer para buscar
        //return
    }

    //Nodo primero y actual son los mismos. Son variables que son utilizadas como punteros
    public void recorrer() {
        Nodo actual = primero;

        while (actual != null) {
            System.out.println (actual.dato + "----");
            actual = actual.siguiente;

        }
        System.out.println ("FIN");
        System.out.println ();

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

// copiar enunciado en word. //