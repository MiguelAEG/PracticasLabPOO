/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author PC
 */
public class Calculadora extends DispositivoElectronico{

    @Override
    public void encender(String d) {
        System.out.println(d + "Enciendida");
    }
    
    public void marca(String d){
        System.out.println(d+"La marca es: ");
    }
    
    public void modelo(String d){
        System.out.println("El modelo es: "+d);
    }
    
    public double suma(double a, double b){
        return a+b;
    }
     public double resta(double a, double b){
        return a-b;
    }
      public double mult(double a, double b){
        return a*b;
    }
       public double div(double a, double b){
        return a/b;
    }
    public void apagar(String d) {
        System.out.println(d+ "Apaga");
    }
       
}
