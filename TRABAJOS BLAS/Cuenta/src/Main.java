public class Main {

    public static void main(String[] args) {

        Cuenta cta1 = new Cuenta("Beto Acosta");

        cta1.deposito(50000);

        System.out.println(cta1.getSaldo());
    }
}