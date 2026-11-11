// Ejecutamos ejemplos de arboles y grafos
public class Main {
    public static void main(String[] args) {

        // Creamos un arbol binario de busqueda
        arbolesygrafos.ArbolBinario arbol = new arbolesygrafos.ArbolBinario();

        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.println("ARBOL BINARIO DE BUSQUEDA");

        System.out.println("Buscar 40: " + arbol.buscar(40));
        System.out.println("Grado del arbol: " + arbol.gradoArbol());
        System.out.println("Altura: " + arbol.altura());
        System.out.println("Profundidad del 40: " + arbol.profundidad(40));

        System.out.print("Preorden: ");
        arbol.preorden();

        System.out.print("Inorden: ");
        arbol.inorden();

        System.out.print("Postorden: ");
        arbol.postorden();

        System.out.print("Por nivel: ");
        arbol.porNivel();

        arbol.eliminar(30);
        System.out.print("Luego de eliminar 30 (inorden): ");
        arbol.inorden();


        // Creamos un arbol n-ario y agregamos hijos en distintos niveles
        ArbolNArio arbolN = new ArbolNArio(50);
        NodoN raizN = arbolN.getRaiz();

        arbolN.agregarHijo(raizN, 30);
        arbolN.agregarHijo(raizN, 70);
        arbolN.agregarHijo(raizN, 90);

        NodoN nodo30 = raizN.hijos.get(0);
        arbolN.agregarHijo(nodo30, 20);
        arbolN.agregarHijo(nodo30, 40);

        NodoN nodo20 = nodo30.hijos.get(0);
        arbolN.agregarHijo(nodo20, 10);

        System.out.print("\nARBOL N-ARIO (recorrido en profundidad): ");
        arbolN.mostrar(raizN);
        System.out.println();


        // Creamos un grafo no dirigido
        arbolesygrafos.Grafo grafo = new arbolesygrafos.Grafo();

        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(3, 5);
        grafo.agregarArista(4, 5);

        System.out.println("\nGRAFO");
        System.out.print("BFS desde 1: ");
        grafo.BFS(1);

        System.out.print("DFS desde 1: ");
        grafo.DFS(1);
    }
}
