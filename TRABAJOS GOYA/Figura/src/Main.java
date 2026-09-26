//CLASE 6 - TEMA 3 - EJERCICIO 2
//CLASE 6 - TEMA 1 - EJERCICIO 2
//CLASE 7 - TEMA 2 - EJERCICIO 1
//CLASE 7 - TEMA 2 - EJERCICIO 2

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Figura circulo = new Circulo(2);
        Figura rectangulo = new Rectangulo(7, 9);

        circulo.mostrar();
        rectangulo.mostrar();

        System.out.println(rectangulo.getNombre());

        // arreglo polimórfico
        Figura[] figuras = {
                circulo,
                rectangulo,
                new Circulo(1),
                new Rectangulo(3, 4),
                new Triangulo(3, 4, 4)
        };

        // Mostrar antes de ordenar
        System.out.println("\nANTES DE ORDENAR:");

        for (Figura f : figuras) {
            System.out.printf("%s - Área: %.2f%n",
                    f.getNombre(), f.calcularArea());
        }

        // Ordenar por área
        Arrays.sort(figuras);

        // Mostrar después de ordenar
        System.out.println("\nDESPUÉS DE ORDENAR:");

        for (Figura f : figuras) {
            System.out.printf("%s - Área: %.2f%n",
                    f.getNombre(), f.calcularArea());
        }
    }
}