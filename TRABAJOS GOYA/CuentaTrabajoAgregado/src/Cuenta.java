package CuentaTrabajoAgregado;
public class Cuenta {

    private Cliente titular;
    private double saldo;
    private int numCuenta;

    public Cuenta(Cliente titular) {
        this.titular = titular;
    }

    public void deposito(double monto) {
        if (monto >= 0) {
            this.saldo = this.saldo + monto;
        } else {
            return;
        }
    }

    public void extraer(double monto) {
        double resto = saldo - monto;

        if (resto < 0) {
            this.saldo = 0;
        } else {
            this.saldo = resto;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    //METODO PARA BUSCAR CUENTAS. Esto no se podria hacer sin ASOCIACION
    public static void buscarCuentas(Cliente cliente, Cuenta[] cuentas) {

        for (Cuenta cuenta : cuentas) {

            if (cuenta.getTitular() == cliente) {
                System.out.println("Titular: " + cuenta.getTitular().nombre);
                System.out.println("Saldo: " + cuenta.getSaldo());


            }
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
}