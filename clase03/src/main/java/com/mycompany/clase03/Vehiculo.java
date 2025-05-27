/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03;

/**
 *
 * @author Laboratorio
 */
public abstract class Vehiculo {
    
    private String identificador;
    private int anio;
    private String modelo;
    private String marca;

    public Vehiculo(String identificador, int anio, String modelo, String marca) {
        this.identificador = identificador;
        this.anio = anio;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public abstract void mostrarDetalles();
    public abstract void encender();
    public abstract void avanzar();
    public abstract void detenerse();
    public abstract void reversa();
}
