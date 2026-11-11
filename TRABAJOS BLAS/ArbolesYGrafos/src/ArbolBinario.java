package arbolesygrafos;
import java.util.LinkedList;
import java.util.Queue;

// Contiene las operaciones principales de un arbol binario de busqueda (ABB)
public class ArbolBinario {
    private arbolesygrafos.Nodo raiz;

    public arbolesygrafos.Nodo getRaiz() {
        return raiz;
    }

    // Inserta un valor respetando la regla del ABB
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private arbolesygrafos.Nodo insertarRecursivo(arbolesygrafos.Nodo nodo, int valor) {
        if (nodo == null) {
            return new arbolesygrafos.Nodo(valor);
        }

        if (valor < nodo.dato) {
            nodo.izq = insertarRecursivo(nodo.izq, valor);
        } else if (valor > nodo.dato) {
            nodo.der = insertarRecursivo(nodo.der, valor);
        }

        // Si el valor ya existe, no lo insertamos nuevamente
        return nodo;
    }

    // Busca un valor en el ABB
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(arbolesygrafos.Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        }

        if (nodo.dato == valor) {
            return true;
        }

        if (valor < nodo.dato) {
            return buscarRecursivo(nodo.izq, valor);
        }

        return buscarRecursivo(nodo.der, valor);
    }

    // Devuelve la cantidad de hijos que tiene un nodo
    public int grado(arbolesygrafos.Nodo nodo) {
        if (nodo == null) {
            return 0;
        }

        int cantidad = 0;

        if (nodo.izq != null) {
            cantidad++;
        }

        if (nodo.der != null) {
            cantidad++;
        }

        return cantidad;
    }

    // Devuelve el mayor grado entre todos los nodos
    public int gradoArbol() {
        return gradoArbolRecursivo(raiz);
    }

    private int gradoArbolRecursivo(arbolesygrafos.Nodo nodo) {
        if (nodo == null) {
            return 0;
        }

        return Math.max(grado(nodo),
                Math.max(gradoArbolRecursivo(nodo.izq),
                        gradoArbolRecursivo(nodo.der)));
    }

    // Altura expresada en cantidad de niveles
    // Un arbol vacio tiene altura 0 y una hoja tiene altura 1
    public int altura() {
        return alturaRecursiva(raiz);
    }

    private int alturaRecursiva(arbolesygrafos.Nodo nodo) {
        if (nodo == null) {
            return 0;
        }

        int alturaIzquierda = alturaRecursiva(nodo.izq);
        int alturaDerecha = alturaRecursiva(nodo.der);

        return 1 + Math.max(alturaIzquierda, alturaDerecha);
    }

    // Profundidad de un valor: cantidad de aristas desde la raiz
    // Devuelve -1 si el valor no se encuentra
    public int profundidad(int valor) {
        return profundidadRecursiva(raiz, valor, 0);
    }

    private int profundidadRecursiva(arbolesygrafos.Nodo nodo, int valor, int nivel) {
        if (nodo == null) {
            return -1;
        }

        if (nodo.dato == valor) {
            return nivel;
        }

        if (valor < nodo.dato) {
            return profundidadRecursiva(nodo.izq, valor, nivel + 1);
        }

        return profundidadRecursiva(nodo.der, valor, nivel + 1);
    }

    // PREORDEN: raiz, izquierda, derecha
    public void preorden() {
        preordenRecursivo(raiz);
        System.out.println();
    }

    private void preordenRecursivo(arbolesygrafos.Nodo nodo) {
        if (nodo == null) {
            return;
        }

        System.out.print(nodo.dato + " ");
        preordenRecursivo(nodo.izq);
        preordenRecursivo(nodo.der);
    }

    // INORDEN: izquierda, raiz, derecha
    public void inorden() {
        inordenRecursivo(raiz);
        System.out.println();
    }

    private void inordenRecursivo(arbolesygrafos.Nodo nodo) {
        if (nodo == null) {
            return;
        }

        inordenRecursivo(nodo.izq);
        System.out.print(nodo.dato + " ");
        inordenRecursivo(nodo.der);
    }

    // POSTORDEN: izquierda, derecha, raiz
    public void postorden() {
        postordenRecursivo(raiz);
        System.out.println();
    }

    private void postordenRecursivo(arbolesygrafos.Nodo nodo) {
        if (nodo == null) {
            return;
        }

        postordenRecursivo(nodo.izq);
        postordenRecursivo(nodo.der);
        System.out.print(nodo.dato + " ");
    }

    // POR NIVEL: utiliza una cola para visitar nivel por nivel
    public void porNivel() {
        if (raiz == null) {
            return;
        }

        Queue<arbolesygrafos.Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            arbolesygrafos.Nodo actual = cola.remove();
            System.out.print(actual.dato + " ");

            if (actual.izq != null) {
                cola.add(actual.izq);
            }

            if (actual.der != null) {
                cola.add(actual.der);
            }
        }

        System.out.println();
    }

    // Elimina un valor contemplando los tres casos
    public void eliminar(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }

    private arbolesygrafos.Nodo eliminarRecursivo(arbolesygrafos.Nodo nodo, int valor) {
        if (nodo == null) {
            return null;
        }

        if (valor < nodo.dato) {
            nodo.izq = eliminarRecursivo(nodo.izq, valor);
        } else if (valor > nodo.dato) {
            nodo.der = eliminarRecursivo(nodo.der, valor);
        } else {
            // Caso 1: el nodo es una hoja
            if (nodo.izq == null && nodo.der == null) {
                return null;
            }

            // Caso 2: el nodo tiene un solo hijo
            if (nodo.izq == null) {
                return nodo.der;
            }

            if (nodo.der == null) {
                return nodo.izq;
            }

            // Caso 3: tiene dos hijos
            // Buscamos el menor valor del subarbol derecho
            arbolesygrafos.Nodo sucesor = nodo.der;

            while (sucesor.izq != null) {
                sucesor = sucesor.izq;
            }

            nodo.dato = sucesor.dato;
            nodo.der = eliminarRecursivo(nodo.der, sucesor.dato);
        }

        return nodo;
    }
}
