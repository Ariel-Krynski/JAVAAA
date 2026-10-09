public class SalaDeReuniones extends Escritorio implements Contrato {

    double costoAdicional;
    boolean proyector;

    public SalaDeReuniones (String id, int capacidadMaximaPersonas, double precioBasePorHora, int horas, double costoAdicional, boolean proyector) {
        super (id, capacidadMaximaPersonas, precioBasePorHora, horas);
        this.costoAdicional = costoAdicional;
        this.proyector = proyector;
    }

    @Override
    public double costoTotalReserva() {

        double costoFinal = ((precioBasePorHora * horas) + costoAdicional);

        return costoFinal;
    }

    @Override
    public boolean espacioDisponible() {
        if (proyector && costoAdicional == 0) {
            return false;
        }

        return true;
    }

    
}
