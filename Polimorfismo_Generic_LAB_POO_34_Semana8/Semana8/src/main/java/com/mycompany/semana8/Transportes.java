/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8;

/**
 *
 * @author PC
 */
public abstract class Transportes {
    public int velocidad, gas;
    private String marca;
    private String modelo;
  
   
    
    public Transportes(int velocidad, int gas){
        this.velocidad = velocidad;
        this.gas=gas;
    } 
    
    public void acelerar(){
        if(gas>10){
           System.out.println("Transporte acelerando "+velocidad); 
        }
        else{
            System.out.println("No hay gas");
        }
    }
    
    /**
     *
     */
    public abstract void encender();
    public abstract void apagar();
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

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
