//CLASE 6 - TEMA 1 - EJERCICIO 2
public class Circulo extends Figura {

    private double radio;

    public Circulo( double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }
}


