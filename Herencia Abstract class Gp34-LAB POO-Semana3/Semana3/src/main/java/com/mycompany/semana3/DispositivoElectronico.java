/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;
/**
 *
 * @author PC
 */
public abstract class DispositivoElectronico {
    
        private String marca;
        private String modelo;
    /**
     * @return the modelo
     */
    public  String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }   
    
    public abstract void encender(String d);
    
    public String apagar(){
       return "Dispositivo Apagado";
    }
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
}
