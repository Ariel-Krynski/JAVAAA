//CLASE 6 - TEMA 3 - EJERCICIO 2
//CLASE 7 - TEMA 2 - EJERCICIO 1
public class Triangulo extends Figura {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        super("Triangulo");

        if (ladoA + ladoB <= ladoC ||
                ladoA + ladoC <= ladoB ||
                ladoB + ladoC <= ladoA) {

            throw new IllegalArgumentException("Los lados no forman un triángulo válido");
        }

        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {

        double semiperimetro = (ladoA + ladoB + ladoC) / 2;

        return Math.sqrt(
                semiperimetro *
                        (semiperimetro - ladoA) *
                        (semiperimetro - ladoB) *
                        (semiperimetro - ladoC)
        );
    }
}