package org.parking.empresa.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    public String nombres;
    public String apellidos;
    public String numeroIdentificacion;
    public List<Vehiculo> misVehiculos = 
                new ArrayList<Vehiculo>();

    //definir metodo de clase
    //addCar: vincular un carrito al cliente 
    public void addVehicle(Vehiculo Vehiculo){
            //añadir el carrito a la lista
            //this: Accerder a atributos y metodos
            //Usar al interior de metodos
        this.misVehiculos.add(Vehiculo);

    }
    //otra sobrecarga del metodo 
    //addvehicle:
    public void addVehicle(String placa,
                            TipoVehiculo tv){
           Vehiculo v = new Vehiculo();
           v.placa = placa;
           v.tipoVehiculo = tv;
           this.misVehiculos.add(v);

           
     }
    public Cliente() {
        
    }
    public Cliente(String nombres, String apellidos, String numeroIdentificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
    }


}
