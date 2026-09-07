public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular) {
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
}