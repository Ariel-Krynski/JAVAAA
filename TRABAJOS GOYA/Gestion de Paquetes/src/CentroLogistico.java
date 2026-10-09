import java.util.ArrayList;

public class CentroLogistico {

     ArrayList<Enviable> inventario = new ArrayList<>();

    public void registrarPaquete(Enviable e)  {
        inventario.add(e);
    }

    public void mostrarReporteEnvios() {

        for (Enviable e : inventario) {
            System.out.println(e.obtenerDetalle());
            System.out.println("Costo de envío: " + e.calcularCostoEnvio());
        }
    }

    public double calcularRecaudacionTotal() {

        double total = 0;

        for (Enviable e : inventario) {
            total += e.calcularCostoEnvio();
        }

        return total;
    }
}