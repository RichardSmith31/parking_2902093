package org.parking.empresa;

import org.parking.empresa.entities.Cliente;
import org.parking.empresa.entities.Cupo;
import org.parking.empresa.entities.Pago;
import org.parking.empresa.entities.TipoVehiculo;
import org.parking.empresa.entities.Vehiculo;
import org.parking.empresa.entities.Empleado;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //sistema de gestion de entradas y salidas de vehiculos en un parking
        //1. Dos carritos:
        //Objetos (instancias)
        //Tipo de clase
        //2. Nombre del objeto
        //3. asignacion y new
        //4.Constructor del objeto
        Vehiculo carrito1 = new Vehiculo("ASD 789", TipoVehiculo.PARTICULAR);
        carrito1.setPlaca( "ASD 789");
        carrito1.setTipoVehiculo(TipoVehiculo.PARTICULAR);
        System.out.println(carrito1.getPlaca()); 
        Vehiculo carrito2 = new Vehiculo();
        carrito2.setPlaca("ZXC 345");
        carrito2.setTipoVehiculo(TipoVehiculo.TAXI);
        System.out.println(carrito2.getPlaca());

        Vehiculo motico = new Vehiculo();
        motico.setPlaca("XS 439");
        motico.setTipoVehiculo(TipoVehiculo.MOTO);


        //Crear (instanciar) cliente
        Cliente cliente1 = new Cliente("Julian", "Ospina", 10131055L);
        cliente1.setNombres( "Julian");
        cliente1.setApellidos( "Ospina");
        cliente1.setNumeroIdentificacion(10131055L);

        //invocar el metodo addCar
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle( "TSD 312",
                 TipoVehiculo.MOTO );
                 
        //insticiar cupos 
        Cupo cupito1 = new Cupo('A');
        Cupo cupito2 = new Cupo('B');   
        
        //crear fechas:
        
            LocalDateTime fechaHorainicio = LocalDateTime.of(2024,
                                                            Month.FEBRUARY ,
                                                            1 ,
                                                            15 ,
                                                            30 ,
                                                            0  );
            LocalDateTime fechaHoraFin = LocalDateTime.of(2024,
                                                            Month.FEBRUARY ,
                                                            10 ,
                                                            6 ,
                                                            15 ,
                                                            0  );
                                                            
        //hacer registros(pagos) E/S de vehiculos
        //instanciar empleados en el main 

        Empleado empleado1 = new Empleado("Juan", "Valencia", "1");
        empleado1.setNombre("Juan");
        empleado1.apellidos = "Valencia";
        empleado1.codigo = "1";

        Pago pago1 = new Pago( 
                            fechaHorainicio, 
                            fechaHoraFin ,
                            5000.0, 
                            cliente1.misVehiculos.get(0),
                            cupito1,  
                            empleado1);

        Pago pago2 = new Pago(
                            fechaHorainicio, 
                            fechaHoraFin,
                            10000.0,
                            cliente1.misVehiculos.get(1),  
                            cupito2, 
                            empleado1);
                              
            //añadir pagos a una lista de pagos

            List<Pago> misPagos = new ArrayList<Pago>();
            misPagos.add(pago1);
            misPagos.add(pago2);
            
            //recorrer los pagos para mostrar informacion
            for( Pago p: misPagos){
                //evidencia:
                //mostrar
                //    - PLaca del vehiculo
                //    - valor pagado
                //    - fecha y hora de inicio
                //    - fecha y hora fin 
                //    - cupo (nombre)
                //    - Mostrar codigo de pago
                System.out.println( "Pago:|Placa:" + p.getVehiculo().getPlaca() + "|" +
                                    "|valor:" + p.getValor() + "|" +
                                    "|fecha y hora entrada:"  +
                                    p.getFechaHoraInicio().toString() + "|" +
                                    "|fecha y hora salida:"  +
                                    p.getfechaHoraFin().toString() + "|" +
                                    "|Cupo:" + p.getCupo().getNombre() + "|" +
                                    "|Empleado: " + p.geCodigo() + "|");
        }
    }

