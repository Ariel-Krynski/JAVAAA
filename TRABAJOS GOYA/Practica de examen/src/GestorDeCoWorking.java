import java.util.ArrayList;

public class GestorDeCoWorking {

    ArrayList<Contrato> espacios = new ArrayList<>();



    public void RegistrarEspacios (Contrato n) {
        espacios.add(n);
    }


    public void MostrarReporte() {
        for (Contrato e : espacios) {
            System.out.println("Costo de reserva: " + e.costoTotalReserva());
        }
    }



    public double montoTotalRecaudar()  {
        double montoTotalRecaudado = 0;

        for (Contrato e : espacios ) {
            montoTotalRecaudado += e.costoTotalReserva();
        }
        return montoTotalRecaudado;

    }

}

