import java.util.ArrayList;
import java.util.List;

// Cada nodo puede tener una cantidad variable de hijos
public class NodoN {
    int dato;
    List<NodoN> hijos = new ArrayList<>();

    public NodoN(int dato) {
        this.dato = dato;
    }
}
