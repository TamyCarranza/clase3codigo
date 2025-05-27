/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03;

/**
 *
 * @author Laboratorio
 */
public class VehiculoTerrestre extends Vehiculo {
    private String TipoVehiculo;
    private int cantidadRuedas;

    public VehiculoTerrestre(String TipoVehiculo, int cantidadRuedas, String identificador, int anio, String modelo, String marca) {
        super(identificador, anio, modelo, marca);
        this.TipoVehiculo = TipoVehiculo;
        this.cantidadRuedas = cantidadRuedas;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }
   
    @Override
    public void mostrarDetalles() {
        System.out.println("Vehiculo Terrestre");
        System.out.println("Id: " + super.getIdentificador());
        System.out.println("Marca: " + super.getMarca());
        System.out.println("Modelo: " + super.getModelo());
        System.out.println("Año: " + super.getAnio());
        System.out.println("Tipo: " + this.getTipoVehiculo());
        System.out.println("Cant. Ruedas: " + this.getCantidadRuedas());
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
