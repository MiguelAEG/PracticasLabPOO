/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana5;

/**
 *
 * @author PC
 */
public class Avion extends Transporte implements ISistemaElectrico, ISistemaFrenos, IVolar{
   
    double gas=0;
    public String despegar(){
       return"El avion despego"; 
    }

    @Override
    public String encender(double gas) {
        String msg;
        this.gas=gas;
        if(this.gas>0)
            msg="Automovil Encendido";
        else
            msg="Sin Gasolina";
        return msg;
    }
    

    @Override
    public void apagar() {
        System.out.println("Avion apagado");
    }

    @Override
    public String enciendeLuces() {
       return"Luces encendidas";
    }

    @Override
    public String apagarLuces() {
       return"Luces apagadas";
    }

    @Override
    public String frenar() {
        return"El avion frena";
    }

    @Override
    public String volar() {
        return"Volando";
    }

}

