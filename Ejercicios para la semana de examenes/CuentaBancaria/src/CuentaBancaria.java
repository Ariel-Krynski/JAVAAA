public class CuentaBancaria {

    private String titular;
    private int NumeroCuenta;
    private double Saldo;

    public CuentaBancaria (String titular, int NumeroCuenta, double Saldo) {

        this.titular = titular;
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;

    }

    //GETTERS Y SETTERS
    public String getTitular() {
        return titular;
    }

    //VALIDAR QUE EL TITULAR NO SEA UNA CADENA VACIA
    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw  new IllegalArgumentException ("El nombre no puede estar vacio");
        }
        this.titular = titular;
    }

    public double getSaldo() {
       return Saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0 ) {
            throw  new IllegalArgumentException ("El Saldo no puede ser negativo");
        }
        this.Saldo = saldo;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        NumeroCuenta = numeroCuenta;
    }
}
