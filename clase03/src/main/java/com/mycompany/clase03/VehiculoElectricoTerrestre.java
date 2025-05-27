/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03;

/**
 *
 * @author Laboratorio
 */
public class VehiculoElectricoTerrestre extends VehiculoTerrestre implements VehiculoElectrico {
    private int porcentajeBateria;

    public VehiculoElectricoTerrestre(int porcentajeBateria, String TipoVehiculo, int cantidadRuedas, String identificador, int anio, String modelo, String marca) {
        super(TipoVehiculo, cantidadRuedas, identificador, anio, modelo, marca);
        this.porcentajeBateria = porcentajeBateria;
    }

    public int getPorcentajeBateria() {
        return porcentajeBateria;
    }

    public void setPorcentajeBateria(int porcentajeBateria) {
        this.porcentajeBateria = porcentajeBateria;
    }
    
    @Override
    public void cargarBateria(){
        this.setPorcentajeBateria(100);
        System.out.println("Bateria Cargada al 100%");
    }
           
    @Override 
    public int obtenerPorcentajeBateria(){
        return porcentajeBateria;
    }
    
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Porcentaje Beteria: " + this.getPorcentajeBateria() + "%");
    }
    
    @Override
    public void encender(){
        System.out.println("Motor encendido");
    }
    
    @Override
    public void avanzar() {
        System.out.println("Vehiculo avanzando");
    }
    
    @Override
    public void detenerse() {
        System.out.println("El Vehiculo se detuvo");
    }
    
    @Override
    public void reversa() {
        System.out.println("Vehiculo avanzando en reversa");
    }
    
}
