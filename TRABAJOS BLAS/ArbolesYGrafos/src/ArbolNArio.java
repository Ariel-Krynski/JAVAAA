// Ejemplo de construccion y operaciones sencillas de un arbol n-ario
public class ArbolNArio {
    private NodoN raiz;

    public ArbolNArio(int datoRaiz) {
        raiz = new NodoN(datoRaiz);
    }

    public NodoN getRaiz() {
        return raiz;
    }

    // Agrega un hijo a un nodo que ya pertenece al arbol
    public void agregarHijo(NodoN padre, int datoHijo) {
        if (padre != null) {
            padre.hijos.add(new NodoN(datoHijo));
        }
    }

    // Muestra el arbol recorriendolo en profundidad
    public void mostrar(NodoN nodo) {
        if (nodo == null) {
            return;
        }

        System.out.print(nodo.dato + " ");

        for (NodoN hijo : nodo.hijos) {
            mostrar(hijo);
        }
    }
}
