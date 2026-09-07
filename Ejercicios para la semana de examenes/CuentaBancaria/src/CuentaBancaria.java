import java.time.LocalDate;

public class CuentaBancaria {

    private String titular;
    private int NumeroCuenta;
    private double Saldo;
    private double monto;

    public CuentaBancaria (String titular, int NumeroCuenta, double Saldo) {

        this.titular = titular;
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
        this.monto = monto;

    }




    public double depositar (double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo");
        }

        this.Saldo = this.Saldo + monto;
        return monto;
    }


    public void extraer(double monto) {

        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a extraer debe ser positivo");
        }

        if (monto > Saldo) {
            throw new IllegalArgumentException("No hay saldo suficiente");
        }

        this.Saldo = this.Saldo - monto;
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

    }

    public double getMonto() {
        return monto;
    }

    public void setmonto(double monto) {

    }

}



