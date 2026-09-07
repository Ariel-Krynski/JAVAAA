public class CuentaRegresiva {

    public static void main(String[] args) {
        // Imprimimos un mensaje para indicar que comienza el conteo
        System.out.println("Iniciando conteo...");

        // Llamamos al procedimiento conteoRecursivo y le pasamos un valor (5)
        conteoRecursivo(5); // Llamada inicial con el número 5 
    }

    // Procedimiento recursivo: realiza una acción. No retorna ningún valor
    // Recursivo significa que el procedimiento se llama a sí mismo 
    // Definimos el tipo y la variable utilizada por el procedimiento (int en este caso).
    public static void conteoRecursivo(int numero) {

        // Ponemos un condicional: si el num es igual a 0. Cuando se cumpla, se detendrá la recursividad
        if (numero == 0) {
            System.out.println("0. ¡IGNICIÓN! 🚀"); //se imprime solo si la condición se cumple
            
            return; // se retorna y termina la llamada al proc
        }

        // Se imprime si el num no es igual a 0
        System.out.println(numero + "...");

        // LLAMADA RECURSIVA: volvemos a llamar al mismo procedimiento restándole -1 al num para que se vaya reduciendo
        conteoRecursivo(numero - 1);
        // se realizará todo de nuevo hasta que la condición sea verdadera (num == 0)
    } 
} // fin de la clase