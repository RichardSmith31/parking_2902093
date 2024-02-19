    package org.parking.empresa.entities;

    public class Vehiculo {

    //atributos de clase
    //1. Modificador de accesos
    //2. Tipo de dato
    //3. Nombre del atributo

    public String placa;
    public TipoVehiculo tipoVehiculo;

    //Constructor
    //Sin parameteos: Constructor por defecto 
    public Vehiculo() {
    }

    //Constrcutor parametrizado 
    public Vehiculo(String placa, 
                    TipoVehiculo tipoVehiculo) {
                this.placa = placa;
                this.tipoVehiculo = tipoVehiculo;
    }

            

}
