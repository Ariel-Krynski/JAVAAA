public class Main {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan");
        Pato pato = new Pato("Donald");

        empleado.nadar();
        pato.nadar();
    }
}

//Ambos implementan la interfaz nadar (que hace, que rol obtiene), pero son de diferentes clases (persona) (animal)