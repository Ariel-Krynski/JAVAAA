public abstract class Escritorio {

    String id;
    int capacidadMaximaPersonas;
    double precioBasePorHora;
    int horas;

    public Escritorio(String id, int capacidadMaximaPersonas, double precioBasePorHora, int horas) {

        /////////////////////////////////
        try {
            if (id.isEmpty() || id == null) {
                throw new IllegalArgumentException ( "No puede ser vacio o nulo el ID ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println (e.getMessage());
        }
        /////////////////////////////////

        try {
            if (capacidadMaximaPersonas < 0) {
                throw new IllegalArgumentException ("La capacidad maxima de personas debe de ser mayor a 0");
            }
        } catch (IllegalArgumentException e) {
            System.out.println (e.getMessage());
        }

        /////////////////////////////////
        try {
            if (precioBasePorHora < 0 ) {
                throw new IllegalArgumentException ("El precio base debe de ser mayor a 0");
            }
        } catch (IllegalArgumentException e) {
                System.out.println (e.getMessage());
        }
        /////////////////////////////////


        this.id = id;
        this.capacidadMaximaPersonas = capacidadMaximaPersonas;
        this.precioBasePorHora = precioBasePorHora;
        this.horas = horas;

    }

    public void actualizarCapacidadPersonas(int nuevaCapacidad) {

        this.capacidadMaximaPersonas = nuevaCapacidad;

    }

    public void actualizarCapacidadPersonas (int nuevaCapacidad, boolean n) {
        this.capacidadMaximaPersonas = nuevaCapacidad;

        if (n) {
            this.id += "[Mobiliario Especial]";
        }
    }

}
