public class hola {
    
    // 1. El método main es el punto de entrada, aquí estarán todas las funciones a ser ejcutadas. 
    // void = no devuelve ningún valor. Aunque si puede ejecutar una acción (para salir de un bucle donde existe una condición, por ej)
    public static void main(String[] args) {
        double suma = 0; // definimos la var suma como 0 demostrando que existen variables locales y globales. En este caso es una var local del main
        System.out.println(suma); //imprimimos lo que se almacena en suma (var global)
        saludarUsuario("Ariel"); // llamamos a la función/procedimiento saludarUsuario definida y le pasamos un argumento (Ariel)

        double promedio = calcularPromedio(9, 8, 10); // llamamos al procedimiento por medio de la definición de la var promedio. Le asignamos valores acordes (3 valores, no más)
        // imprimimos
        System.out.println("El promedio de los num es: " + promedio);

        double[] notas = {8,3,7}; //definimos la variable notas como un arreglo de 3 valores puntuales
        double promedioMatriz = promedioMatriz(notas); // llamamos al proced. promedioMatriz y le decimos que tome los valores almacenados en la var notas (como argumemtos)
        // imprimimos
        System.out.println("El promedio de la matriz es: " + promedioMatriz);

        System.out.println(notas[0]); // imprimimos la posición 0 del arreglo (no imprime 0, imprime el valor que se encuentre en esa posición)
    
    }
    // se cierra el main o el "CÓDIGO PRINCIPAL"

    // 2. Procedimiento: Realiza una acción y NO retorna valor (void)
    // Se declara FUERA del main, pero DENTRO de la clase
    // Definimos proced. SaludarUsuario. Definimos el tipo de la variable utilizada por el proc.
    public static void saludarUsuario(String nombre) {
        //Cuando el código llame a la función, imprimirá esto:
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Programación II."); 
        System.out.println("ADIOS"); //linea de prueba
    } // fin de la función

    // Función: Procesa datos y RETORNA un valor de un tipo específico (double)
    // Definimos proced. Definimos el tipo de las variables utilizadas por el proc.
    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        double suma = nota1 + nota2 + nota3;
        return suma / 3.0; // retornamos la var suma/3.0
    } //fin de la función  

    // Función PromedioMatriz
     public static double promedioMatriz (double[] valores){ 
        // valores [0] = 9; SI ESTE CODIGO ESTUVIERA ANTES DE LA SUMA, CAMBIARIA EL PROMEDIO 
      
        double suma = valores[0] + valores [1] + valores[2];
        valores [0] = 9; // Se modifica la posición 0 del arreglo. Como el arreglo fue pasado a la función, este cambio también se refleja en notas. 
        return suma / 3.0;
    }

    // NOTA ADICIONAL: Que las clases sean publicas (public) significa que pueden ser llamadas por cualquier parte del código, incluso otras funciones y/o clases. 

    

} // fin de la clase