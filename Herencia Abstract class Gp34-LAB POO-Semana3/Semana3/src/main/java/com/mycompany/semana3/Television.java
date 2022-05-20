/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;
/**
 *
 * @author PC
 */
public class Television extends DispositivoElectronico {

    @Override
    public void encender(String d) {
        
        System.out.println("Television Encendida");
    }
    
    public void marca(String d){
        System.out.println(d+"La marca es: ");
    }
    
     public void modelo(String d){
        System.out.println("El modelo es: "+d);
    }
     
      public String Color(String d){
        return "Color: "+ d;
    }
    
    public String cambiarVolumen(int d){
        if (d>0){
            return "Television Sube de Volumen";
        }
        else if(d<0){
            return "Television Baja de Volumen";
        } 
        else{
            return"No hay cambio";
        }
    }
    
    public String cambiarCanal(int d){
        return "Television cambia de Canal al "+d;
    }
   
    public void apagar(String d) {
        System.out.println(d+ "Apagado");
    }   
        
}
