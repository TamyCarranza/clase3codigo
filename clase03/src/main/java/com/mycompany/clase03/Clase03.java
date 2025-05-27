/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase03;

import java.util.ArrayList;

/**
 *
 * @author Laboratorio
 */
public class Clase03 {

    public static void main(String[] args) {
        
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        
        VehiculoTerrestre carro = new VehiculoTerrestre("Pickup",4,"CAR01",2019,"Dmax","Isuzu");
        VehiculoElectricoTerrestre scooter = new VehiculoElectricoTerrestre(20,"Scooter",2,"SCO01",2025,"Yamaha","PRO");
        
        vehiculos.add(carro);
        vehiculos.add(scooter);
        
        System.out.println("Carga de la bateria: " + scooter.getPorcentajeBateria() + "%");
        scooter.cargarBateria();
        
        for(Vehiculo vehiculo: vehiculos){
            vehiculo.mostrarDetalles();
            vehiculo.encender();
            vehiculo.avanzar();
            vehiculo.detenerse();
            System.out.println("--------------------------");
        }
    }
}
