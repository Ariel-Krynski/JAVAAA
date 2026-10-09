public class Main {

    public static void main(String[] args) {

        CentroLogistico centro = new CentroLogistico();


        // 2 paquetes estándar
        PaqueteEstandar paqueteE1 = new PaqueteEstandar( "123", 2, "Resistencia", 3);

        PaqueteEstandar paqueteE2 = new PaqueteEstandar("E002", 2, "Corrientes", 5);

        // 2 paquetes frágiles
        PaqueteFragil paqueteF1 = new PaqueteFragil("F001", 5, "Formosa", "Alta");

        PaqueteFragil paqueteF2 =  new PaqueteFragil("F002", 8, "Posadas", "Media");

        // Registrar paquetes
        centro.registrarPaquete(paqueteE1);
        centro.registrarPaquete(paqueteE2);
        centro.registrarPaquete(paqueteF1);
        centro.registrarPaquete(paqueteF2);

        // Actualizar destino
        paqueteE1.actualizarDestino("Buenos Aires");
        paqueteF1.actualizarDestino("Santa Fe", true);

        // Mostrar reporte
        centro.mostrarReporteEnvios();

        // Recaudación total
        System.out.println("Recaudación total: " + centro.calcularRecaudacionTotal());

        //PROBAR METODOS
        System.out.println( "Es apto para envios Aereos? " + paqueteF1.esAptoParaEnvioAereo());
        System.out.println ("Es apto par envios Aereos? " + paqueteE1.esAptoParaEnvioAereo());


        //Otra manera de implementar el metodo esAptoParaEnvioAereo
        if (paqueteE1.esAptoParaEnvioAereo()) {
            System.out.println ("El paquete si es apto para envio aereo ");
        } else {
            System.out.println ("El paquete no es apto para envio Aereo");
        }

    }
}