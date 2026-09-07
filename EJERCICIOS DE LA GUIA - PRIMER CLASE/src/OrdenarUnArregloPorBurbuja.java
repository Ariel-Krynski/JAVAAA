import java.util.Arrays;

//REALIZADO EN CLASE, DISTINTO A LO REALIZADO POR EL PROFESOR PK ESTABA PROBANDO MEZCLAR LOS BUCLES. FECHA: 28-08-26

public class OrdenarUnArregloPorBurbuja {

    public static void main(String[] args) {

        int[] Arreglo = {7, 2, 3, 21, 11};

        for (int i = 2; i < Arreglo.length; i++) {
            for (int  j = 0; j < Arreglo.length - 1 ; j++) {

                if (Arreglo[j] >  Arreglo [j+1] ) {
                    int aux = Arreglo[j];
                    Arreglo[j] = Arreglo[j + 1];
                    Arreglo[j + 1] = aux;
                    ////


                }
                System.out.println (i); //Para vizualizar los elementos que esta recorriendo.

            }

        }

        for (int i = 0; i < Arreglo.length; i++) {
            System.out.println(Arreglo[i]);
        }

        System.out.println(Arrays.toString (Arreglo)); //Metodo para poder imprimir sin tener que utilizar un for
    }
}
