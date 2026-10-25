public class Main {

    public static void main(String[] args) {

        ListaEstatica lista = new ListaEstatica(5);


        lista.insertarValor(8);
        lista.insertarValor(3);
        lista.insertarValor(3);
        lista.insertarValor(2);


        lista.mostrarValor();
        System.out.println("La cantidad de elementos de la lista es: "+ lista.getCantidad());
        System.out.println (lista.buscarValor(0));

        /////
        lista.insertarEnPosicion(2,3);
        //lista.eliminarEnPosicion(1);
        lista.eliminarTodas(3);
        lista.mostrarValor();
        System.out.println("La cantidad de elementos de la lista es: "+ lista.getCantidad());

    }

}
