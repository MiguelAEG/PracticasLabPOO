/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana5;
/**
 *
 * @author PC
 */
public class Semana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //AUTOMOVIL
        Automovil topaz= new Automovil();
        System.out.println("Automovil--_Clase Hija");
        topaz.marca("BMW");
        topaz.modelo("2020-R");
        System.out.println(topaz.encender(3));
        System.out.println(topaz.enciendeLuces());
        System.out.println(topaz.avanzar(3));
        System.out.println(topaz.retroceder(3));
        System.out.println(topaz.apagarLuces());
        topaz.apagar();
        System.out.println("\t");
          System.out.println("Transporte --Clase Padre");
          Transporte topazGuia = new Automovil();
          System.out.println(topazGuia.encender(0));
          topazGuia.apagar();
          System.out.println("\t");
          System.out.println("ISistemaElectrico --Interfaz");
          ISistemaElectrico topazX = new Automovil();
          System.out.println(topazX.enciendeLuces());
          System.out.println(topazX.apagarLuces());
          ISistemaFrenos topazF = new Automovil();
          System.out.println("\t");
          System.out.println("ISistemaFrenos --Interfaz");    
          System.out.println(topazF.frenar());
          //Automovil y Avion SISTEMA FRENOS Y ELECTRICO
          //AVION
          
          Avion avion= new Avion();
          System.out.println("\t");
          System.out.println("Avion--_Clase Hija");
          System.out.println(avion.encender(3));
          System.out.println(avion.enciendeLuces());
          ISistemaFrenos Frenos = new Automovil();
          System.out.println("\t");
          System.out.println("ISistemaFrenos --Interfaz");    
          System.out.println(Frenos.frenar());
          System.out.println(avion.volar());
          System.out.println(avion.apagarLuces());
          avion.apagar();
        
          System.out.println("\t");
          System.out.println("Transporte --Clase Padre");
          Transporte Guia = new Avion();
          System.out.println(Guia.encender(0));
          Guia.apagar();
          System.out.println("\t");
          System.out.println("ISistemaElectrico --Interfaz");
          ISistemaElectrico Electr = new Avion();
          System.out.println(Electr.enciendeLuces());
          System.out.println(Electr.apagarLuces());
    
          ISistemaFrenos IFrenar = new Avion();
          System.out.println("\t");
          System.out.println("ISistemaFrenos --Interfaz");    
          System.out.println(IFrenar.frenar());

    }
      
}
