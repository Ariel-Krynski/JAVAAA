public class EscritorioIndividual extends Escritorio implements Contrato {

    private boolean monitorExtra;

    public EscritorioIndividual (String id, int capacidadMaximaPersonas, double precioBasePorHora, int horas, boolean monitorExtra) {
        super (id, capacidadMaximaPersonas, precioBasePorHora, horas);
        this.monitorExtra = monitorExtra;
    }

    // Escritorios Individuales: Poseen adicionalmente un atributo booleano para
    //indicar si cuentan con monitor extra. El costo por hora es el precio base, pero
    //si cuenta con monitor extra se adiciona un 15% al costo final. Un escritorio
    //individual siempre está disponible para reserva.

    @Override
    public double costoTotalReserva() {

        if (monitorExtra) {
            precioBasePorHora = precioBasePorHora * 1.15;
        }
        double precioFinal = precioBasePorHora * horas;
        return precioFinal;
    }


    @Override
    public boolean espacioDisponible() {
        return true;
    }



}
