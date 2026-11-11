package arbolesygrafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Grafo no dirigido representado mediante listas de adyacencia
public class Grafo {
    private Map<Integer, List<Integer>> adyacencias = new HashMap<>();

    // Agrega un vertice si todavia no existe
    public void agregarVertice(int vertice) {
        adyacencias.putIfAbsent(vertice, new ArrayList<>());
    }

    // Conecta dos vertices en ambas direcciones
    public void agregarArista(int origen, int destino) {
        agregarVertice(origen);
        agregarVertice(destino);

        adyacencias.get(origen).add(destino);
        adyacencias.get(destino).add(origen);
    }

    // BFS: recorre primero los vertices mas cercanos
    // Utiliza una cola (FIFO)
    public void BFS(int inicio) {
        if (!adyacencias.containsKey(inicio)) {
            return;
        }

        Queue<Integer> cola = new LinkedList<>();
        Set<Integer> visitados = new HashSet<>();

        cola.add(inicio);
        visitados.add(inicio);

        while (!cola.isEmpty()) {
            int actual = cola.remove();
            System.out.print(actual + " ");

            for (int vecino : adyacencias.get(actual)) {
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    cola.add(vecino);
                }
            }
        }

        System.out.println();
    }

    // DFS: profundiza por un camino antes de retroceder
    // Esta version utiliza recursividad
    public void DFS(int inicio) {
        Set<Integer> visitados = new HashSet<>();
        DFSRecursivo(inicio, visitados);
        System.out.println();
    }

    private void DFSRecursivo(int actual, Set<Integer> visitados) {
        if (!adyacencias.containsKey(actual) || visitados.contains(actual)) {
            return;
        }

        visitados.add(actual);
        System.out.print(actual + " ");

        for (int vecino : adyacencias.get(actual)) {
            if (!visitados.contains(vecino)) {
                DFSRecursivo(vecino, visitados);
            }
        }
    }
}
