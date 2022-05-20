/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana4;

/**
 *
 * @author PC
 */
public class Television extends DispositivoElectronico implements MenuConfig {

    @Override
    public void encender() {
        
        System.out.println("Television Encendida");
    }
    
    public void marca(String d){
        System.out.println(d+"La marca es: ");
    }
    
     public void modelo(String d){
        System.out.println("El modelo es: "+d);
    }
     
      public void Color(String d){
          System.out.println("El color es: "+d);
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
   
    @Override
    public void apagar(){
        System.out.println("Television Apagada");
    }   

    @Override
    public void mute() {
        System.out.println("El volumen ha sido silenciado");
    }

    @Override
    public void unmute() {
        System.out.println("El volumen ha vuelto");
    }

    @Override
    public void cambio() {
        System.out.println("Se ha desplazado al canal anterior");
    }

    @Override
    public void HDMI() {
        System.out.println("Activado el modo HDMI");
    }

    @Override
    public void TVAbierta() {
        System.out.println("Cambiando a TV abierta");
    }

    @Override
    public void cable() {
        System.out.println("Cambiando a Cable(TV paga)");
    }

    @Override
    public void Netflix() {
        System.out.println("Se ha abierto la aplicación Netflix");
    }
        
}
