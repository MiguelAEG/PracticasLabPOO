/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8;

/**
 *
 * @author PC
 */
public class Autobus extends Transportes implements ISElectrico, IFrenos {

    public Autobus(int velocidad, int gas) {
        super(velocidad, gas);
    }

    @Override
    public void encender() {
        System.out.println("Autobus Encendiendo. El nivel de gasolina es: "+gas);
    }

    @Override
    public String prendeLuces() {
        return"Autobus Prende luces";
    }

    @Override
    public String bajaSubeVidrios(int i) {
       String res="";
        if(i>0){
            res = "Autobus sube vidrios";
        }
        else if(i<0){
            res = "Autobus baja vidrios";
        }
        else{
            res = "No se ha realizado nunguna acción";
        }
        return res;
    }
    
    public void estacionar(){
        System.out.println("Esperando a que suban pasajeros");
    }
    
    public void recorrido(){
        System.out.println("Siguiendo ruta establecida");
    }

    @Override
    public String frenar() {
        return"Autobus Frena";
    }

    @Override
    public void apagar() {
        System.out.println("Apagar Autobus");
    }

    @Override
    public String apagaLuces() {
        return"Autobus Apaga luces";
    }
    
}
