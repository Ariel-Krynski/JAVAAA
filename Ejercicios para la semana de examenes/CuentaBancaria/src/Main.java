import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria t1 = new CuentaBancaria ("Ariel", 123, 1000);
        CuentaBancaria t2 = new CuentaBancaria ("Emmanuel", 456, 2000);






        //TECLADO ingresar TITULAR
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre de titular: ");
        String titular = (teclado.nextLine()); //guardamos lo ingresado en la var titular

        //Excepcion si el nom de titular esta vacio
        try {
            t1.setTitular(titular); //lo ingresado se guarda en titular

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }





        //TECLADO ingresar SALDO
        System.out.print("Ingrese su saldo actual: ");
        String saldoIngresado = (teclado.nextLine()); //guardamos lo ingresado en la var saldoIngresado. PRESTAR ATENCION QUE NO ES LA MISMA QUE SALDO
        //es una var auxiliar por ahora

        try { //EXCEPCION SALDO VACIO

            if (saldoIngresado.trim().isEmpty()) { //verificar si esta vacio
                throw new IllegalArgumentException("El saldo no puede estar vacio"); //Si se cumple la condicion
            }

            double saldo = Double.parseDouble(saldoIngresado); //AHORA SI CONVERTIMOS EL VALOR DE SALDOINGRESADO A DOUBLE
            //LO PONEMOS DENTRO DE LA VAR SALDO QUE SI QUEREMOS USAR

            t1.setSaldo(saldo); //Lo ingresado se guarda en saldo, YA MODIFICADO

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }


    }
}