
public class Main {


    public static void main(String[] args) {


        // Se resuelve en compilación
        // como recibe dos int, se selecciona operar(int, int)
        Calculadora calculadora = new Calculadora();

        // Se resuelve en compilación
        // como recibe dos double, se selecciona operar(double, double)
        System.out.println(calculadora.operar(10, 20));
        System.out.println(calculadora.operar(10.5, 20.5));

        // Se resuelve en compilación
        // como recibe un int[], se selecciona operar(int[])
        int[] numeros = {10, 20, 30, 40};
        System.out.println(calculadora.operar(numeros));



    }
}

//FIRMA = Nombre del método + tipos y orden de sus parámetros
// operar (double a, double b)  {