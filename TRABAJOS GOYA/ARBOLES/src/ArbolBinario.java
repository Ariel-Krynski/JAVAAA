import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinario {

    // Guardo la referencia al primer nodo del árbol
    private Nodo raiz;

    // Esta clase representa cada nodo que voy agregando al árbol
    private static class Nodo {
        int dato;
        Nodo izquierdo, derecho;

        // Inicializo el nodo con el valor que recibo
        Nodo(int dato) {
            this.dato = dato;
        }
    }

    // Inserto los valores por niveles, sin importar si son mayores o menores
    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);

        // Si todavía no hay ningún nodo, el nuevo pasa a ser la raíz
        if (raiz == null) {
            raiz = nuevo;
            return;
        }

        // Uso una cola para ir recorriendo los nodos por niveles
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();

            // Si el lugar izquierdo está vacío, inserto ahí el nuevo nodo
            if (actual.izquierdo == null) {
                actual.izquierdo = nuevo;
                return;
            }

            // Si ya tiene hijo izquierdo, lo guardo en la cola para revisarlo después
            cola.add(actual.izquierdo);

            // Hago lo mismo con el hijo derecho
            if (actual.derecho == null) {
                actual.derecho = nuevo;
                return;
            }

            cola.add(actual.derecho);
        }
    }

    // Recorro primero la raíz, después la izquierda y finalmente la derecha
    public void preOrden() {
        preOrden(raiz);
        System.out.println();
    }

    private void preOrden(Nodo n) {
        // Si llego a un nodo vacío, termino esta llamada
        if (n == null) return;

        System.out.print(n.dato + " ");

        // Sigo recorriendo primero el lado izquierdo y después el derecho
        preOrden(n.izquierdo);
        preOrden(n.derecho);
    }

    // Primero recorro la izquierda, después la raíz y finalmente la derecha
    public void inOrden() {
        inOrden(raiz);
        System.out.println();
    }

    private void inOrden(Nodo n) {
        // Si el nodo está vacío, termino esta llamada
        if (n == null) return;

        inOrden(n.izquierdo);
        System.out.print(n.dato + " ");
        inOrden(n.derecho);
    }

    // Primero recorro los dos hijos y al final muestro la raíz
    public void postOrden() {
        postOrden(raiz);
        System.out.println();
    }

    private void postOrden(Nodo n) {
        // Si el nodo está vacío, termino esta llamada
        if (n == null) return;

        postOrden(n.izquierdo);
        postOrden(n.derecho);
        System.out.print(n.dato + " ");
    }

    // Recorro el árbol por niveles utilizando una cola
    public void porNiveles() {

        // Si el árbol está vacío, no tengo nada para recorrer
        if (raiz == null) return;

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            // Saco el primer nodo de la cola para procesarlo
            Nodo actual = cola.poll();

            System.out.print(actual.dato + " ");

            // Agrego sus hijos a la cola para recorrerlos después
            if (actual.izquierdo != null) cola.add(actual.izquierdo);
            if (actual.derecho != null) cola.add(actual.derecho);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Creo el árbol y le agrego algunos valores para probarlo
        ArbolBinario arbol = new ArbolBinario();

        for (int v : new int[]{1, 2, 3, 4, 5, 6, 7}) {
            arbol.insertar(v);
        }

        // Pruebo los diferentes recorridos del árbol
        System.out.print("Pre-orden: ");
        arbol.preOrden();

        System.out.print("In-orden: ");
        arbol.inOrden();

        System.out.print("Post-orden: ");
        arbol.postOrden();

        System.out.print("Por niveles: ");
        arbol.porNiveles();
    }
}

// DIAGRAMA : https://miro.com/welcomeonboard/bHpieGE2MFJzbFpGeGEyZHZvS1VETzBqdVVGamc1M3ZCWTV1R2xFbGdUQUsyQi81MjJnNUhyYU01RXI4bUt6YSs1N3Rld09DQ1lFUE5sc3Bzczhjb0RHbnRBaXA2ZU1QeGZCbDdsOW1UQU02N2VXZ1RPeTVhY3Z5Q01namFmakNNakdSWkpBejJWRjJhRnhhb1UwcS9BPT0hdjE=?share_link_id=465017685889