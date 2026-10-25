public class Main {

    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        // Insertamos valores
        lista.insertarFinal(4);
        lista.insertarFinal(7);
        lista.insertarFinal(4);
        lista.insertarFinal(8);
        lista.insertarFinal(4);
        lista.insertarFinal(4);

        System.out.println("Lista original:");
        lista.mostrar();

        // Contamos apariciones
        System.out.println( "Ocurrencias del 4: " + lista.contarOcurrencias(4) );

        // Eliminamos todas las apariciones de un vaalor
        lista.eliminarTodas(4);

        System.out.println("Lista después de eliminar los 4:  ");
        lista.mostrar();

        // Ver tam
        System.out.println("Tamaño final: " + lista.tamanio());
    }
}