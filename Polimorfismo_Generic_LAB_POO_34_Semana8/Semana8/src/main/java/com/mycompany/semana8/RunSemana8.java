/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class RunSemana8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner mrca = new Scanner(System.in);
         Scanner mdl = new Scanner(System.in);
      
         ArrayList<Transportes> tra = new ArrayList<Transportes>();
        
        tra.add(new Automovil(100,50));
        tra.add(new Avion(800,200));
        tra.add(new Barco(300,100));
        tra.add(new Helicoptero(200,200));
        tra.add(new Autobus(300,500));
              
        //Individual
        for(Transportes tr: tra){

            if(tr instanceof Automovil){
                Automovil coche =(Automovil)tr;
                System.out.println("Introduzca la marca del Automovil: ");
                coche.setMarca(mrca.nextLine());
                System.out.println("Introduzca el modelo del Automovil: ");
                coche.setModelo(mdl.nextLine());
        
                coche.encender();
                System.out.println(coche.prendeLuces());
                System.out.println(coche.apagaLuces());
                coche.acelerar();
                System.out.println(coche.manobriar());
                System.out.println(coche.bajaSubeVidrios(3));
                System.out.println(coche.frenar());
                coche.apagar();
                System.out.println("La marca del Automovil es: "+coche.getMarca());
                System.out.println("El modelo del Automovil es: "+coche.getModelo());
                System.out.println("******************");

            
        }
            if(tr instanceof Autobus){
                Autobus bus =(Autobus)tr;
                System.out.println("Introduzca la marca del Autobus: ");
                bus.setMarca(mrca.nextLine());
                System.out.println("Introduzca el modelo del Autobus: ");
                bus.setModelo(mdl.nextLine());
        
                bus.encender();
                System.out.println(bus.prendeLuces());
                System.out.println(bus.apagaLuces());
                bus.acelerar();
                bus.estacionar();
                bus.recorrido();
                System.out.println(bus.bajaSubeVidrios(-3));
                System.out.println(bus.frenar());
                bus.apagar();
                System.out.println("La marca del Autobus es: "+bus.getMarca());
                System.out.println("El modelo del Autobus es: "+bus.getModelo());
                System.out.println("***********************");
            
        }
            if(tr instanceof Barco){
                Barco bar =(Barco)tr;
                System.out.println("Intrduzca la marca del barco: ");
                bar.setMarca(mrca.nextLine());
                System.out.println("Introduzca el modelo del barco: ");
                bar.setModelo(mdl.nextLine());
        
                bar.encender();
                System.out.println(bar.prendeLuces());
                System.out.println(bar.apagaLuces());
                bar.acelerar();
                System.out.println(bar.bajaSubeVidrios(2));
                bar.girar();
                bar.anclar();
                bar.apagar();
                System.out.println("La marca del Barco es: "+bar.getMarca());
                System.out.println("La marca del Barco es: "+bar.getModelo());
                System.out.println("******************************");
            
        }
            if(tr instanceof Helicoptero){
                Helicoptero hel =(Helicoptero)tr;
                System.out.println("Intrduzca la marca del Helicoptero: ");
                hel.setMarca(mrca.nextLine());
                System.out.println("Introduzca el modelo del Helicoptero: ");
                hel.setModelo(mdl.nextLine());
        
                hel.encender();
                System.out.println(hel.prendeLuces());
                System.out.println(hel.apagaLuces());
                hel.acelerar();
                System.out.println(hel.volar());
                System.out.println(hel.despegar());
                System.out.println(hel.descender());
                System.out.println(hel.bajaSubeVidrios(5));
                hel.apagar();
                System.out.println("La marca del helicoptero es: "+hel.getMarca());
                System.out.println("El modelo del helicoptero es: "+hel.getModelo());
                System.out.println("******************************");
            
        }
            if(tr instanceof Avion){
                Avion av =(Avion)tr;

                av.encender();
                System.out.println("Introduzca la marca del avion: ");
                av.setMarca(mrca.nextLine());
                System.out.println("Introduzca el modelo del avion: ");
                av.setModelo(mrca.nextLine());
                av.encender();
                System.out.println(av.prendeLuces());
                System.out.println(av.apagaLuces());
                av.ascender();
                av.descender();
                av.acelerar();
                av.volar();
                System.out.println(av.frenar());
                System.out.println(av.bajaSubeVidrios(3));
                av.apagar();
                System.out.println("**************************");
        }
      
      }
    

    }
  
}
/*

 //Indice de marca y modelo
        int i=1;
        System.out.println("1.-Automovil,2.-Avion,3.-Barco,"
                    + "4.- Helicoptero,5.- Autobus");
        
        for(Transportes tr: tra){
            
            System.out.println("Introduzca la marca #"+i);
            tr.setMarca(mrca.nextLine());
            System.out.println("Introduzca el modelo #"+i);
            tr.setModelo(mdl.nextLine());
            i++;
        }

         
            System.out.println(tr.getClass().toString());
            System.out.println("La marca es: "+tr.getMarca());
            System.out.println("El modelo es: "+tr.getModelo());
            tr.encender();
            tr.acelerar();
            System.out.println("*******************************");

       
    //Avion
        Avion av = new Avion(100,230);
        
        System.out.println("Introduzca la marca del avion: ");
        av.setMarca(mrca.nextLine());
        System.out.println("Introduzca el modelo del avion: ");
        av.setModelo(mrca.nextLine());
        
        av.encender();
        System.out.println(av.prendeLuces());
        System.out.println(av.apagaLuces());
        av.ascender();
        av.descender();
        av.acelerar();
        av.volar();
        System.out.println(av.frenar());
        System.out.println(av.bajaSubeVidrios(3));
        av.apagar();
       
     //Automovil
        Automovil coche = new Automovil(100,200);
        
        
        System.out.println("Introduzca la marca del Automovil: ");
        coche.setMarca(mrca.nextLine());
        System.out.println("Introduzca el modelo del Automovil: ");
        coche.setModelo(mdl.nextLine());
        
        coche.encender();
        System.out.println(coche.prendeLuces());
        System.out.println(coche.apagaLuces());
        coche.acelerar();
        System.out.println(coche.bajaSubeVidrios(3));
        System.out.println(coche.frenar());
        coche.apagar();
        System.out.println("La marca del Automovil es: "+coche.getMarca());
        System.out.println("El modelo del Automovil es: "+coche.getModelo());
        System.out.println("******************");

  
  //Autobus        
        Autobus bus = new Autobus(300,200);
        
        System.out.println("Introduzca la marca del Autobus: ");
        bus.setMarca(mrca.nextLine());
        System.out.println("Introduzca el modelo del Autobus: ");
        bus.setModelo(mdl.nextLine());
        
        bus.encender();
        System.out.println(bus.prendeLuces());
        System.out.println(bus.apagaLuces());
        bus.acelerar();
        bus.estacionar();
        bus.recorrido();
        System.out.println(bus.bajaSubeVidrios(-3));
        System.out.println(bus.frenar());
        bus.apagar();
        System.out.println("La marca del Autobus es: "+bus.getMarca());
        System.out.println("El modelo del Autobus es: "+bus.getModelo());
        System.out.println("***********************");

         
         
       
        
        
           //Helicoptero
        Helicoptero hel = new Helicoptero(150,300);
        
        System.out.println("Intrduzca la marca del Helicoptero: ");
        hel.setMarca(mrca.nextLine());
        System.out.println("Introduzca el modelo del Helicoptero: ");
        hel.setModelo(mdl.nextLine());
        
        hel.encender();
        System.out.println(hel.prendeLuces());
        System.out.println(hel.apagaLuces());
        hel.acelerar();
        System.out.println(hel.volar());
        System.out.println(hel.bajaSubeVidrios(5));
        hel.apagar();
        System.out.println("La marca del helicoptero es: "+hel.getMarca());
        System.out.println("El modelo del helicoptero es: "+hel.getModelo());
        System.out.println("******************************");
        
         //  Barco
        Barco bar = new Barco(322,33);
        
        System.out.println("Intrduzca la marca del barco: ");
        bar.setMarca(mrca.nextLine());
        System.out.println("Introduzca el modelo del barco: ");
        bar.setModelo(mdl.nextLine());
        
        bar.encender();
        System.out.println(bar.prendeLuces());
        System.out.println(bar.apagaLuces());
        bar.acelerar();
        System.out.println(bar.bajaSubeVidrios(2));
        bar.girar();
        bar.anclar();
        bar.apagar();
        System.out.println("La marca del Barco es: "+bar.getMarca());
        System.out.println("La marca del Barco es: "+bar.getModelo());
        System.out.println("******************************");

      

   */

/*
  ArrayList<Transportes> tra = new ArrayList<Transportes>();
        
        tra.add(new Automovil(100,50));
        tra.add(new Avion(800,200));
        tra.add(new Barco(300,100));
        tra.add(new Helicoptero(200,200));
        tra.add(new Autobus(300,500));
        
        //Indice de marca y modelo
        int i=1;
        System.out.println("1.-Automovil,2.-Avion,3.-Barco,"
                    + "4.- Helicoptero,5.- Autobus");
        
        for(Transportes tr: tra){
            
            System.out.println("Introduzca la marca #"+i);
            tr.setMarca(mrca.nextLine());
            System.out.println("Introduzca el modelo #"+i);
            tr.setModelo(mdl.nextLine());
            i++;
        }

        for(Transportes tr: tra){
            System.out.println(tr.getClass().toString());
            System.out.println("La marca es: "+tr.getMarca());
            System.out.println("El modelo es: "+tr.getModelo());
            tr.encender();
            tr.acelerar();
            System.out.println("*******************************");
        }


/*



/*
------------------------------------------------------------------------------------------

        ArrayList<ISElectrico> sel = new ArrayList<ISElectrico>();     
       
        sel.add(new Automovil(100,50));
        sel.add(new Avion(800,200));
        sel.add(new Barco(300,100));
        sel.add(new Helicoptero(200,200));
        sel.add(new Autobus(300,500));
        
        for(ISElectrico se: sel){
            se.bajaSubeVidrios(3);
            se.prendeLuces();
        }

        ArrayList<IFrenos> fre = new ArrayList<IFrenos>();     
        
        fre.add(new Automovil(100,50));
        fre.add(new Avion(800,200));
        fre.add(new Barco(300,100));
        fre.add(new Helicoptero(200,200));
        fre.add(new Autobus(300,500));
        
        for(IFrenos fr: fre){
            fr.frenar();
        }
        
         ArrayList<IVolar> vol = new ArrayList<IVolar>();     
        
        vol.add(new Automovil(100,50));
        vol.add(new Avion(800,200));
        vol.add(new Barco(300,100));
        vol.add(new Helicoptero(200,200));
        vol.add(new Autobus(300,500));
        
        for(IVolar vo: vol){
            vo.volar();
        }
       
     */   
       