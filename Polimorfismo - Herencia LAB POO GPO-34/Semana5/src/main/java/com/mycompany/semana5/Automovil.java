/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana5;

/**
 *
 * @author PC
 */
public class Automovil extends Transporte implements ISistemaElectrico, ISistemaFrenos {
    double gas =0;
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

     public void marca(String d){
        System.out.println("La marca es: "+d);
    }
    
     public void modelo(String d){
        System.out.println("El modelo es: "+d);
    }
    
    public String avanzar(double gas) {
        String msg;
        this.gas=gas;
        if(this.gas>1)
            msg="Automovil avanza";
        else
            msg="Sin Gasolina";
        return msg;
    }

    public String retroceder(double gas) {
        String msg;
        this.gas=gas;
        if(this.gas>1)
            msg="Automovil reversa";
        else
            msg="Sin Gasolina";
        return msg;
    }
    
    @Override
    public void apagar() {
        System.out.println("Automovil Apagado");
    }

    @Override
    public String enciendeLuces() {
        return"Luces Encendidas";
    }

    @Override
    public String apagarLuces() {
        return"Luces Apagadas";
    }

    @Override
    public String frenar() {
        return"Automovil frena";
    }
    
}
