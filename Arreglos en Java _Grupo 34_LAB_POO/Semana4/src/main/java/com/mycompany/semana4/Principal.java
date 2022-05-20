/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana4;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner objCalM = new Scanner(System.in); //Marca calculadora
        Scanner objModCal = new Scanner(System.in); //Modelo calculadora
        Scanner objTel = new Scanner(System.in);   //Marca television
        Scanner objTelCol = new Scanner(System.in); //Color television
        Calculadora[] calcs = new Calculadora[5];
        Television[] tvs = new Television[5];
        
        for (int i=0;  i<5; i++){
            calcs[i]= new Calculadora();
            System.out.println("Introduce la marca de la calculadora #"+(i+1)+": ");
            String marCal = objCalM.next();
            calcs[i].setMarca(marCal);
            System.out.println("Introduce el modelo de la calculadora: ");
            String modCal = objModCal.next();
            calcs[i].setModelo(modCal);
            System.out.println("\n"); //Salto de linea
    }
        
        for(Calculadora cal: calcs){
            System.out.println("Calculadora Marca: "+cal.getMarca());
            System.out.println("Calculadora Modelo: "+cal.getModelo());
            cal.encender();
             System.out.println("Suma: "+cal.suma(3, 4));
             System.out.println("Resta: "+cal.resta(3, 4));
             System.out.println("Multiplicacion: "+cal.mult(3, 2));
             System.out.println("Division: "+cal.div(3, 2));
             System.out.println("Raiz: "+cal.raiz(9));
             System.out.println("Modulo: "+cal.residuo(13));
             cal.apagar();
             System.out.println("\n"); //Salto de linea
        }
        
        for (int i=0; i<5; i++){
            tvs[i]= new Television();
            System.out.println("Introduce la marca de la televison #"+(i+1)+": ");
            String marTel = objTel.next();
            tvs[i].setMarca(marTel); 
            System.out.println("Introduce el color de la television: ");
            String colTel = objTelCol.next();
            tvs[i].setColor(colTel);
            System.out.println("\n"); //Salto linea
        }
        
        for(Television Tv: tvs){
            System.out.println("Television marca: "+Tv.getMarca());
            System.out.println("Television color: "+Tv.getColor());
            Tv.encender();
            System.out.println(Tv.cambiarCanal(5));
            System.out.println(Tv.cambiarVolumen(3));
            Tv.apagar();
            System.out.println("\n"); //Salto linea
        }

    }  
    
}
    


 /*
        Calculadora casio = new Calculadora();

        System.out.println("Calculadora");

        casio.encender("Calculadora");
        
        System.out.println("Calculadora estandar ");
        
        System.out.println("Suma: "+casio.suma(3.2, 4.8));
        System.out.println("Resta: "+casio.resta(10.4, 5));
        System.out.println("Multiplicacion: "+casio.mult(3.5, 6.3));
        System.out.println("Division: "+casio.div(13, 2));
        
        System.out.println("Calculadora Avanzada ");
        
        System.out.println("Raiz: "+casio.raiz(9));
        System.out.println("Modulo: "+casio.residuo(13)); 
        
        casio.apagar("Casio ");
        
        Television Hitachi = new Television();
        
        System.out.println("Television");
        
        Hitachi.encender("Television  ");
        
        Hitachi.modelo("Hitachi");
        System.out.println(Hitachi.Color("Rojo"));
        System.out.println(Hitachi.cambiarCanal(5));
        System.out.println(Hitachi.cambiarVolumen(-2));
        Hitachi.mute();
        Hitachi.unmute();
        Hitachi.cambio();
        Hitachi.HDMI();
        Hitachi.TVAbierta();
        Hitachi.cable();
        Hitachi.Netflix();
        
        Hitachi.apagar("Television ");
     */
