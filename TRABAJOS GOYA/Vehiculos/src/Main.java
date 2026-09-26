import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    Concesionaria concesionaria = new Concesionaria("DanielS"); //creo una nueva concesionaria

    //CREEAR
    Vehiculo v1 = new Vehiculo("Toyota", "Corolla", 2000); //creo nuevos VEHICULOS
    Vehiculo v2 = new Vehiculo("Ford", "Focus", 1800);
    Vehiculo v3 = new Vehiculo("Chevrolet", "Cruze", 1700);
    Vehiculo auto1 = new Auto ("Toyota", "Corolla",2000, 4);
    Vehiculo moto1 = new Moto ("Ford", "Focus", 5000, 234);


    //AGREGO LOS VEHICULOS A LA CONCESIONARIA
    concesionaria.agregarVehiculo(v1);
    concesionaria.agregarVehiculo(v2);
    concesionaria.agregarVehiculo(v3);

    //BUSCAR
    System.out.println (concesionaria.buscarPorMarca("Toyota"));


    //BUSCAR VALOR NO EXISTENTE
    System.out.println (concesionaria.buscarPorMarca("Ferrari"));


    //STOCK
    System.out.println ("Valor total $ del Stock: " + concesionaria.valorTotalStock());

    System.out.println (auto1.toString());
    System.out.println (moto1.toString());
  }
}