public abstract class Paquete  implements Enviable{

    private String codigoTrack;
    private double pesoKg;
    private String destino;

    public Paquete(String codigoTrack, double pesoKg, String destino) {



        if (codigoTrack == null || codigoTrack.isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }

        if (pesoKg <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
        }

        this.codigoTrack = codigoTrack;
        this.pesoKg = pesoKg;
        this.destino = destino;
    }

    public void actualizarDestino(String nuevoDestino) {
        this.destino = nuevoDestino;
    }

    public void actualizarDestino(String nuevoDestino, boolean express) {
        this.destino = nuevoDestino;

        if (express) {
            this.destino += " [PRIORITARIO]";
        }
    }

    public abstract String obtenerDetalle();

    public String getCodigoTrack() {
        return codigoTrack;
    }

    public void setCodigoTrack(String codigoTrack) {
        if (codigoTrack == null || codigoTrack.isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }

        this.codigoTrack = codigoTrack;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
        }

        this.pesoKg = pesoKg;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}