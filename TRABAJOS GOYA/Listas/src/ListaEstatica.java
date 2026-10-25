public class ListaEstatica {

    private int cantidad;
    private int[] datos;

    public ListaEstatica(int capacidad) {
        datos = new int[capacidad];
        cantidad = 0;
    }

    public void insertarValor(int valor) {

        if (cantidad == datos.length) {
            throw new IllegalArgumentException ("Lista Llena ");
        }

        datos[cantidad] = valor;
        cantidad++;
    }

    public String buscarValor(int valor) {

        for (int i = 0; i < cantidad; i++) {
            if (datos[i] == valor) {
                return "El valor se encontro en el indice: " + i;
            }
        }

        return "El valor no ha sido encontrado en la lista";
    }

    public void mostrarValor() {

        for (int i = 0; i < cantidad; i++) {
            System.out.println(datos[i]);
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //////////
    /// De atras hacia adelante para evitar sobrescribir valores antes de haberlos desplazado
    public void insertarEnPosicion(int indice, int valor) {
        if (indice < 0 || indice > cantidad) {
            throw new IndexOutOfBoundsException();
        }

        if (cantidad == datos.length) {
            throw new IllegalStateException("Lista llena");
        }

        for (int i = cantidad; i > indice; i--) {
            datos[i] = datos[i - 1];
        }

        datos[indice] = valor;
        cantidad++;
    }

    ////////////

    public void eliminarEnPosicion(int indice) {
        if (indice < 0 || indice >= cantidad) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = indice; i < cantidad - 1; i++) {
            datos[i] = datos[i + 1];
        }

        cantidad--;
    }
    public int eliminarTodas(int valor) {
        int eliminados = 0;
        int i = 0;

        while (i < cantidad) {
            if (datos[i] == valor) {

                for (int j = i; j < cantidad - 1; j++) {
                    datos[j] = datos[j + 1];

                }

                cantidad--;
                eliminados++;

            } else {
                i++;
            }

        }

        return eliminados;
    }
}