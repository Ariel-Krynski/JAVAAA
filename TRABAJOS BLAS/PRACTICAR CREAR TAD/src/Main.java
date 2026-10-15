public class Main {

    public static void main(String[] args) {

        //Ejercitacion = Diseño de Interfaz, no pensar en como se implementa
        //Playlist de musica
        //Pausar, reproducir, agregar a favoritos,eliminar de favoritos

        //  PlayList playlist = new PlayList;
        //
        //        playlist.agregarAFavoritos(1);
        //        playlist.eliminarDeFavoritos(3);
        //        playlist.pausar();
        //        playlist.reproducir();

        MiLista lista = new MiLista();

        lista.agregar(1);
        lista.agregar(7);
        lista.agregar(8);

        lista.recorrer();
    }

}
