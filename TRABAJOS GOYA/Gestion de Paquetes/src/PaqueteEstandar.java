public class PaqueteEstandar extends Paquete {

    private int diasEstimados;

    public PaqueteEstandar(String codigoTrack, double pesoKg, String destino, int diasEstimados) {
        super(codigoTrack, pesoKg, destino);
        this.diasEstimados = diasEstimados;
    }

    public double calcularCostoEnvio() {
        double costo = 1000 * getPesoKg();
        return costo;
    }

    public boolean esAptoParaEnvioAereo() {
        if (getPesoKg() <= 15 ) {
            return true;
        } else {
           return false;
        }

    }


    public String obtenerDetalle() {
        return "Resumen del Paquete: "
                + getCodigoTrack() + " "
                + getDestino() + " "
                + getPesoKg() + " kg "
                + diasEstimados + " días";
    }
}