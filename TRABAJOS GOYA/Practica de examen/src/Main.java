public class Main {

    public static void main(String[] args) {

        //  Diseña una clase ejecutable (Main) donde se instancien al menos 2 escritorios y 2
        //salas, se prueben las sobrecargas de métodos, se capture una excepción tras un
        //intento de inicialización inválida y se imprima el reporte final.

        GestorDeCoWorking gestor = new GestorDeCoWorking();

        //PRUEBA TRY-CATCH
        EscritorioIndividual ei1 = new EscritorioIndividual("", 3, 2000, 4,true);

        EscritorioIndividual ei2 = new EscritorioIndividual( "345", 3, 3000, 2, false);
        SalaDeReuniones s1 = new SalaDeReuniones("168", 5, 6000, 2, 4000, true);
        SalaDeReuniones s2 = new SalaDeReuniones("186", 2, 2000, 2, 2000, false);

        gestor.RegistrarEspacios(ei1);
        gestor.RegistrarEspacios(ei2);
        gestor.RegistrarEspacios(s1);
        gestor.RegistrarEspacios(s2);

        gestor.MostrarReporte();
        System.out.println (gestor.montoTotalRecaudar());
        System.out.println (gestor.montoTotalRecaudar());
        System.out.println (s1.costoTotalReserva());

    }
}
