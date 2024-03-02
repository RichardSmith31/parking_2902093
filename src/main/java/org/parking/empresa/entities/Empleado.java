package org.parking.empresa.entities;

public class Empleado {

    public String nombre;
    public String apellidos;
    public int codigo;

    

    public Empleado() {
    }



    public Empleado(String nombre, 
                  String apellidos, 
                  int codigo) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.codigo = codigo;
  }

}
