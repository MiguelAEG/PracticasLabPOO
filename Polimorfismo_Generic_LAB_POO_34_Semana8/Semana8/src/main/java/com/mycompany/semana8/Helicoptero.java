/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8;

/**
 *
 * @author PC
 */
public class Helicoptero extends Transportes implements ISElectrico, IVolar {

    public Helicoptero(int velocidad, int gas) {
        super(velocidad, gas);
    }

    @Override
    public void encender() {
        System.out.println("El nivel de gasolina "+gas);
    }

    @Override
    public String prendeLuces() {
        return"Prende luces";
    }

    @Override
    public String bajaSubeVidrios(int i) {
        String res="";
        if(i>0){
            res = "Helicoptero sube vidrios";
        }
        else if(i<0){
            res = "Helicoptero baja vidrios";
        }
        else{
            res = "No se ha realizado nunguna acción";
        }
        return res;
    }

    @Override
    public String volar() {
        return"Helicoptero volando";
    }

    @Override
    public void apagar() {
        System.out.println("Apagar Helicoptero");
    }

    @Override
    public String apagaLuces() {
        return"Helicoptero Apaga luces";
    }
    
    public String descender() {
        return"Helicoptero desciende";
    }
    
    public String despegar(){
        return "Helicoptero despega";
    }
    
}
