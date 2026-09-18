package herencia; //ESTO SOLO ES NECESARIO SI TENEMOS LOS ARCHIVOS UBICADOS EN PAQUETES DIFERENTES. NO ES EL CASO, PERO NO INFLUYE EN EL CODIGO
public class Main {

    public static void main(String[] args) {

        //Creamos una variable de tipo EMPLEADO, esa variable contendra otra clase. La clase padre es Empleado
        Empleado empleadoPorHoras = new EmpleadoPorHoras( "Daniel", 25000, 101, 90, 5000);

        System.out.println(empleadoPorHoras);
        System.out.println("Sueldo: " + empleadoPorHoras.getSueldo());
        System.out.println("Sueldo: " + empleadoPorHoras.calcularSueldo());


    }
}