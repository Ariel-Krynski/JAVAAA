public class Main {

    public static void main(String[] args) {

        //FINAL hace que la variable sea constante
        int final EDAD = 18;

        // EDAD = 12; NO SE PUEDE PORQUE EDAD ES UNA CONSTANTE

        Animal animal = new Animal("Animal", 5);
        Perro perro = new Perro("Firulais", 3);

        animal.mostrarDatos();
        animal.hacerSonido();

        System.out.println();

        perro.mostrarDatos();
        perro.hacerSonido();
    }
}