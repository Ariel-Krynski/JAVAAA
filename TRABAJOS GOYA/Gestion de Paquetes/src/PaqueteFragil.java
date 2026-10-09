public class PaqueteFragil extends Paquete {

    private String proteccion;

    public PaqueteFragil(String codigoTrack, double pesoKg, String destino, String proteccion) {

        super(codigoTrack, pesoKg, destino);

        if (!(proteccion.equals("Baja")
                || proteccion.equals("Media")
                || proteccion.equals("Alta"))) {

            throw new IllegalArgumentException("La protección es inválida");
        }

        this.proteccion = proteccion;
    }

    public double calcularCostoEnvio() {

        double costo;

        if (proteccion.equals("Alta")) {
            costo = (1000 * getPesoKg()) * 1.30;

        } else if (proteccion.equals("Media")) {
            costo = (1000 * getPesoKg()) * 1.15;

        } else {
            costo = 1000 * getPesoKg();
        }

        return costo;
    }

    public boolean esAptoParaEnvioAereo() {
        return false;
    }


    public String obtenerDetalle() {

        return "Resumen del Paquete: "
                + getCodigoTrack() + " "
                + getDestino() + " "
                + getPesoKg() + " kg "
                + proteccion;
    }
}