//CLASE 2 - TEMA 1 - EJERCICIO 2
public class CodigoConError {

    public static void main(String[] args) {

        MetodoIf(3);
        IfSuma(11);

    }

    public static void MetodoIf(int x) {

        int resultado;

        if (x > 0) {

            resultado = x * 2;

        } else {

            resultado = x * 3;

        }

        System.out.println(resultado);


    }

    public static void IfSuma(int x) {

        int suma = 0;

        if (x < 10)  {

            for (int i = 0; i <= 30; i++) {

                suma = suma + x;

            }

        } else  {

            for (int i = 0; i <= 20; i++) {

                suma = suma + x;

            }
        }

        System.out.println (suma);

    }



}



// APReENDIDO: JAVA SIEMPRE NECESITA QUE LE PROPORCIONES UN VALOR A LA VARIABLE, SIN IMPROTAR QUE ESA VARIABLE CUMPLA CON LA CONDICION O NO.
// CORRECCION: Se corrigió el ámbito de resultado al declararlo una sola vez antes del bloque if
//  y luego asignarle valores dentro del if y else

// Prevalece la variable que está dentro del método, porque tiene un ámbito más cercano y oculta a la variable externa con el mismo nombre.
// Esto se conoce como shadowing.
