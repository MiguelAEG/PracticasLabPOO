/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8;

/**
 *
 * @author PC
 */
public class Avion extends Transportes implements IVolar, IFrenos, ISElectrico{

    public Avion(int velocidad, int gas) {
        super(velocidad, gas);
    }

    @Override
    public void encender() {
        System.out.println("El nivel de gasolina es: "+gas);
    }
    
    public void ascender(){
        System.out.println("Avion ascendiendo");
    }
    
    public void descender(){
        System.out.println("Avion descendiendo");
    }

    @Override
    public String volar() {
        return "Avion volando";
    }

    @Override
    public String frenar() {
        return "Avion frenando";
    }

    @Override
    public void apagar() {
        System.out.println("Apagar Avion");
    }

    @Override
    public String prendeLuces() {
        return"Avion Prende luces";
    }

    @Override
    public String apagaLuces() {
        return"Avion Apaga luces";
    }

    @Override
    public String bajaSubeVidrios(int i) {
        String res="";
        if(i>0){
            res = "Avion sube vidrios";
        }
        else if(i<0){
            res = "Avion baja vidrios";
        }
        else{
            res = "No se ha realizado nunguna acción";
        }
        return res;
    }

 

    
}
