package org.parking.empresa;

import org.parking.empresa.entities.TipoVehiculo;
import org.parking.empresa.entities.Vehiculo;


import org.parking.empresa.entities.Cliente;

public class Main {
    public static void main(String[] args) {
        //sistema de gestion de entradas y salidas de vehiculos en un parking
        //1. Dos carritos:
        //Objetos (instancias)
        //Tipo de clase
        //2. Nombre del objeto
        //3. asignacion y new
        //4.Constructor del objeto
        Vehiculo carrito1 = new Vehiculo("ASD 789", TipoVehiculo.PARTICULAR);
        carrito1.placa = "ASD 789";
        carrito1.tipoVehiculo = TipoVehiculo.PARTICULAR;
        System.out.println(carrito1.placa);

        Vehiculo carrito2 = new Vehiculo();
        carrito2.placa = "ZXC 345";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;

        System.out.println(carrito2.placa);

        //Crear (instanciar) cliente
        Cliente Cliente1 = new Cliente(null, null, null);
        Cliente1.nombres = "Julian";
        Cliente1.apellidos = "Ospina";
        Cliente1.numeroIdentificacion = "10131055L";

        //INVOCAR EL METODO CAR
        Cliente1.addVehicle(carrito1);
        Cliente1.addVehicle(carrito2);
        Cliente1.addVehicle( "TSD 312", TipoVehiculo.MOTO );                  
        for(Vehiculo v:Cliente1.misVehiculos){
            System.out.println(v.placa);
            System.out.println(v.tipoVehiculo);
            System.out.println("---------");
        }
    }
}