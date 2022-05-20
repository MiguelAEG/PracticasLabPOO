/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author PC
 */
public class RunSemana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora casio = new Calculadora();

        System.out.println("Calculadora");
        
        casio.encender("Calculadora ");
        
        System.out.println("Suma: "+casio.suma(3.2, 4.8));
        System.out.println("Resta: "+casio.resta(10.4, 5));
        System.out.println("Multiplicacion: "+casio.mult(3.5, 6.3));
        System.out.println("Division: "+casio.div(13, 2));
        
        casio.apagar("Casio ");
        
        Television Hitachi = new Television();
        
        System.out.println("Television");
        
        Hitachi.encender("Television  ");
        
        Hitachi.modelo("Hitachi");
        System.out.println(Hitachi.Color("Rojo"));
        System.out.println(Hitachi.cambiarCanal(5));
        System.out.println(Hitachi.cambiarVolumen(-2));

        Hitachi.apagar("Television ");
      
    }
    
}
