// Interfaz Reparable

public interface Reparable {

    public double calcularCostoReparacion();

    public boolean esReparableEnGarantia();

}


// Clase abstracta Equipo

public abstract class Equipo implements Reparable {

    private String numeroSerie;
    private double horasDiagnostico;
    private String cliente;

    public Equipo(String numeroSerie, double horasDiagnostico, String cliente) {

        if (numeroSerie == null || numeroSerie.isEmpty()) {
            throw new IllegalArgumentException("El numero de serie no puede estar vacio");
        }

        if (horasDiagnostico <= 0) {
            throw new IllegalArgumentException("Las horas deben ser mayores a cero");
        }

        this.numeroSerie = numeroSerie;
        this.horasDiagnostico = horasDiagnostico;
        this.cliente = cliente;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        if (numeroSerie == null || numeroSerie.isEmpty()) {
            throw new IllegalArgumentException("El numero de serie no puede estar vacio");
        }

        this.numeroSerie = numeroSerie;
    }

    public double getHorasDiagnostico() {
        return horasDiagnostico;
    }

    public void setHorasDiagnostico(double horasDiagnostico) {
        if (horasDiagnostico <= 0) {
            throw new IllegalArgumentException("Las horas deben ser mayores a cero");
        }

        this.horasDiagnostico = horasDiagnostico;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void actualizarCliente(String nuevoCliente) {
        cliente = nuevoCliente;
    }

    public void actualizarCliente(String nuevoCliente, boolean urgente) {
        cliente = nuevoCliente;

        if (urgente) {
            cliente = cliente + " [URGENTE]";
        }
    }

    public abstract String obtenerDetalle();

}


// Clase Notebook

public class Notebook extends Equipo {

    private int antiguedadAnios;

    public Notebook(String numeroSerie, double horasDiagnostico,
                    String cliente, int antiguedadAnios) {

        super(numeroSerie, horasDiagnostico, cliente);
        this.antiguedadAnios = antiguedadAnios;
    }

    @Override
    public double calcularCostoReparacion() {
        return 5000 * getHorasDiagnostico();
    }

    @Override
    public boolean esReparableEnGarantia() {
        return antiguedadAnios <= 2;
    }

    @Override
    public String obtenerDetalle() {
        return "Notebook: " + getNumeroSerie()
                + " | Cliente: " + getCliente()
                + " | Horas: " + getHorasDiagnostico()
                + " | Antiguedad: " + antiguedadAnios + " años";
    }

}


// Clase Celular

public class Celular extends Equipo {

    private String nivelDanio;

    public Celular(String numeroSerie, double horasDiagnostico,
                   String cliente, String nivelDanio) {

        super(numeroSerie, horasDiagnostico, cliente);

        if (nivelDanio == null ||
                (!nivelDanio.equals("Leve")
                && !nivelDanio.equals("Moderado")
                && !nivelDanio.equals("Grave"))) {

            throw new IllegalArgumentException("El nivel de daño no es valido");
        }

        this.nivelDanio = nivelDanio;
    }

    @Override
    public double calcularCostoReparacion() {

        double costo = 5000 * getHorasDiagnostico();

        if (nivelDanio.equals("Grave")) {
            costo = costo + costo * 0.25;
        } else if (nivelDanio.equals("Moderado")) {
            costo = costo + costo * 0.10;
        }

        return costo;
    }

    @Override
    public boolean esReparableEnGarantia() {
        return nivelDanio.equals("Leve");
    }

    @Override
    public String obtenerDetalle() {
        return "Celular: " + getNumeroSerie()
                + " | Cliente: " + getCliente()
                + " | Horas: " + getHorasDiagnostico()
                + " | Daño: " + nivelDanio;
    }

}


// Clase CentroServicio

import java.util.ArrayList;

public class CentroServicio {

    private ArrayList<Reparable> inventario;

    public CentroServicio() {
        inventario = new ArrayList<Reparable>();
    }

    public void registrarEquipo(Reparable r) {
        inventario.add(r);
    }

    public void mostrarReporteReparaciones() {

        for (Reparable r : inventario) {

            if (r instanceof Equipo) {
                Equipo equipo = (Equipo) r;

                System.out.println(equipo.obtenerDetalle());
                System.out.println("Costo de reparacion: $"
                        + r.calcularCostoReparacion());
                System.out.println("En garantia: "
                        + r.esReparableEnGarantia());
                System.out.println();
            }
        }
    }

    public double calcularRecaudacionTotal() {

        double total = 0;

        for (Reparable r : inventario) {
            total = total + r.calcularCostoReparacion();
        }

        return total;
    }

}


// Clase Main

public class Main {

    public static void main(String[] args) {

        CentroServicio centro = new CentroServicio();

        // Creamos los equipos
        Celular c1 = new Celular("123", 30, "Candela", "Leve");
        Celular c2 = new Celular("678", 80, "Mario", "Grave");

        Notebook n1 = new Notebook("129", 56, "Cesar", 7);
        Notebook n2 = new Notebook("345", 78, "Camila", 2);

        // Registramos los equipos
        centro.registrarEquipo(c1);
        centro.registrarEquipo(c2);
        centro.registrarEquipo(n1);
        centro.registrarEquipo(n2);

        // Probamos los metodos actualizarCliente
        c1.actualizarCliente("Maria");
        c2.actualizarCliente("Mario", true);

        // Probamos una excepcion con un dato invalido
        try {
            Celular c3 = new Celular("999", 20, "Prueba", "Extremo");
            centro.registrarEquipo(c3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Mostramos el reporte
        centro.mostrarReporteReparaciones();

        // Mostramos la recaudacion total
        System.out.println("Recaudacion total: $"
                + centro.calcularRecaudacionTotal());
    }

}