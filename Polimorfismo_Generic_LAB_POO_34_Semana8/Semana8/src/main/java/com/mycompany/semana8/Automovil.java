/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8;

/**
 *
 * @author PC
 */
public class Automovil extends Transportes implements IFrenos, ISElectrico {

    public Automovil(int velocidad, int gas) {
        super(velocidad, gas);
    }

    @Override
    public void encender() {
        System.out.println("Automovil Encendiendo. El nivel de gasolina es: "+gas);
    }

    @Override
    public String frenar() {
        return "Automovil frena";
    }

    @Override
    public String prendeLuces() {
        return "Automovil enciende luces";
    }

    @Override
    public String bajaSubeVidrios(int i) {
        String res="";
        if(i>0){
            res = "Automovil sube vidrios";
        }
        else if(i<0){
            res = "Automovil baja vidrios";
        }
        else{
            res = "No se ha realizado nunguna acción";
        }
        return res;
    }

    @Override
    public void apagar() {
        System.out.println("Apagar Automovil");
    }

    @Override
    public String apagaLuces() {
        return "Automovil Apaga luces";
    }
 
    public String manobriar(){
        return "Automovil manobriando";
    }
}
