/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8;

/**
 *
 * @author PC
 */
public class Barco extends Transportes implements ISElectrico{

    public Barco(int velocidad, int gas) {
        super(velocidad, gas);
    }

    @Override
    public void encender() {
        System.out.println("El nivel de gasolina: "+gas);
    }
    
    public void girar(){
        System.out.println("El barco cambia de dirección");
    }
    
    public void anclar(){
        System.out.println("Anclando barco a tierra");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar Barco");
    }

    @Override
    public String prendeLuces() {
        return"Barco Prende luces";
    }

    @Override
    public String bajaSubeVidrios(int i) {
        String res="";
        if(i>0){
            res = "Barco sube vidrios";
        }
        else if(i<0){
            res = "Barco baja vidrios";
        }
        else{
            res = "No se ha realizado nunguna acción";
        }
        return res;
    }

    @Override
    public String apagaLuces() {
        return"Barco Apaga luces";
    }
    
}
