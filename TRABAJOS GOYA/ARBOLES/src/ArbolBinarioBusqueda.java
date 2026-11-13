
public class ArbolBinarioBusqueda {

    // Guardo la referencia a la raíz del árbol
    private Nodo raiz;

    // Represento cada elemento del árbol mediante un nodo
    private static class Nodo {
        int dato;
        Nodo izquierdo, derecho;

        Nodo(int dato) {
            this.dato = dato;
        }
    }

    // Llamo al método recursivo para insertar el valor
    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    private Nodo insertar(Nodo n, int valor) {

        // Si encuentro un lugar vacío, creo el nuevo nodo
        if (n == null) return new Nodo(valor);

        // Si el valor es menor, sigo buscando por la izquierda
        if (valor < n.dato) {
            n.izquierdo = insertar(n.izquierdo, valor);
        }

        // Si es mayor, sigo buscando por la derecha
        else if (valor > n.dato) {
            n.derecho = insertar(n.derecho, valor);
        }

        // Si es igual, no lo inserto para evitar valores repetidos

        // Devuelvo el nodo para mantener la estructura del árbol
        return n;
    }

    // Inicio la búsqueda desde la raíz
    public boolean buscar(int valor) {
        return buscar(raiz, valor);
    }

    private boolean buscar(Nodo n, int valor) {

        // Si llego a un lugar vacío, significa que no encontré el valor
        if (n == null) return false;

        // Si el valor coincide con el nodo actual, lo encontré
        if (valor == n.dato) return true;

        // Según el valor, decido si tengo que buscar a la izquierda o a la derecha
        // Así evito recorrer ramas que no necesito
        return valor < n.dato
                ? buscar(n.izquierdo, valor)
                : buscar(n.derecho, valor);
    }

    // Recorro el árbol en in-orden para mostrar los valores ordenados
    public void inOrden() {
        inOrden(raiz);
        System.out.println();
    }

    private void inOrden(Nodo n) {
        // Si el nodo está vacío, termino esta llamada
        if (n == null) return;

        // Primero recorro los valores menores
        inOrden(n.izquierdo);

        // Después muestro el valor actual
        System.out.print(n.dato + " ");

        // Por último recorro los valores mayores
        inOrden(n.derecho);
    }

    public static void main(String[] args) {

        // Creo el árbol binario de búsqueda
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

        // Inserto algunos valores para comprobar cómo se ordenan
        for (int v : new int[]{50, 30, 70, 20, 40, 60, 80}) {
            abb.insertar(v);
        }

        // Muestro los valores de menor a mayor
        abb.inOrden();

        // Compruebo qué pasa cuando busco un valor que existe
        System.out.println("¿Contiene 40? " + abb.buscar(40));

        // Compruebo qué pasa cuando busco un valor que no existe
        System.out.println("¿Contiene 45? " + abb.buscar(45));
    }
}

// DIAGRAMA: https://miro.com/welcomeonboard/VURKdlFndFo5dWFaQW9iRXgwYXN3WThBTGtlR29SL1VGNk5qSjl2NlZtSFNIekdKblZJNWU3blcvK3dSUTJqNjdWejRFME10SWp4eExtOFNHbjQ3T2pHbnRBaXA2ZU1QeGZCbDdsOW1UQU5EQ05NeFdacnB6WDY5Wm5adkc4TS9NakdSWkpBejJWRjJhRnhhb1UwcS9BPT0hdjE=?share_link_id=656843337342