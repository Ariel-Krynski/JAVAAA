import java.util.Scanner;
import java.time.LocalDate;  // Importamos específicamente LocalDate.

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona ("Ariel", "Krynski", "47720167");
        Persona persona2 = new Persona ("Emmanuel", "Medina", "44720167");
        persona1.setDinero(0);



        //ASIGNAR UNA EDAD
        persona2.setEdad(23);
        //MOSTRAR EDAD ASIGNADA, SI ANTES NO LE ASIGNE UN VALOR, SU VALOR PREDETERMINADO ASIGANDO POR NOSOTROS SERA 9
        System.out.println(persona2.getEdad());



        //TECLADO
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = (teclado.nextLine()); //guardamos lo ingresado por teclado en la variable nombre



        //MODIFICAR NOMBRE CON LO INGRESADO POR TECLADO
        persona1.setNombre(nombre); //Lo que hemos guardado en la var "nombre" nos sirve para poder modificar el nombre
        //en este caso de persona1, pero podriamos hacer que tambien se guarde en el nombre de persona2.
        persona2.setNombre(nombre);
        System.out.println("La persona2 se llama: " + persona2.getNombre());



        //Provocamos una excepcion. Aunque ocurra un error, el código no se va a detener. Nos sirve para testear código
        try {
            int numero = 100/persona1.getDinero();
            System.out.println(numero);
        } catch (ArithmeticException e) {
            System.out.println ("Error de division por 0" + e.getMessage());
        }

        try {
            persona1.setNombre(nombre);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }



        //INGRESAR FECHA DE NACIMIENTO POR TECLADO
        System.out.print("Ingrese su fecha de nacimiento (AAAA-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(teclado.nextLine());



        //ASIGNAMOS LA FECHA DE NACIMIENTO INGRESADA A LA PERSONA1 (ser para MODIFICAR)
        persona1.setFechaNacimiento(fechaNacimiento);



        //CREAMOS UNA VARIABLE Y ADENTRO DE LA MISMA LEM ASIGNAMOS EL METODO SALUDAR CON LA INSTANCIA QUE DESEE
        String saludo = persona1.saludar();
        System.out.println(saludo);
    }



//como compartir el git de cada uno al profesor

}