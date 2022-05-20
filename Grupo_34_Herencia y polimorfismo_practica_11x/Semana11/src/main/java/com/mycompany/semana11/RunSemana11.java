/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana11;
import java.util.ArrayList;
    
/**
 *
 * @author PC
 */
public class RunSemana11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //SECRETARIO
        Secretario Secretario1 = new Secretario("Oficina N°234", 15123833, "Jose", "Enriquez", "EIGKHJHKI", 
                "Mexico NL", 81130999, 34, 8, null, 1000.00);
        
        System.out.println("Secretario: ");
        Secretario1.mostrarDatos();
        System.out.println("");
       
        Secretario Secretario2 = new Secretario("Oficina N°153", 22314, "Miguel", "Enriquez", "ARSRFJHKI", 
                "Mexico NL", 81130999, 254, 23, null, 5000.00);
       
        System.out.println("Secretario: ");
        Secretario1.mostrarDatos();
        System.out.println("");

        
        //VENDEDOR
        Vendedor Vendedor1 = new Vendedor("Camioneta", "RS153", "Chevrolet", "E15", "NL", 81143333, 200.4, 
                "Manuel", "Perez", "ERA234", "Mexico", 9123123, 34, 15, null, 3500);
        System.out.println("Vendedores: ");
        Vendedor1.mostrarDatos();
        System.out.println("");
        
        Vendedor Vendedor2 = new Vendedor("Carro", "LS153", "BWM", "A15", "Mexico, NL", 813143333, 500.4, 
                "Manuel", "Perez", "ERA234", "Mexico", 9123123, 54, 55, null, 8500);
       
        System.out.println("Vendedores: ");
        Vendedor2.mostrarDatos();
        System.out.println("");
        

        //JEFE ZONA
        JefeZona JefeZona1 = new JefeZona("Automovil", "Angel", "Garcia", "E153123", "Mexico, NL", 
                81143234, 44, 12, null, 20000.12);
        
        System.out.println("Jefe Zona: ");
        JefeZona1.mostrarDatos();
        System.out.println("");
        
        JefeZona JefeZona2 = new JefeZona("Camioneta", "Juan", "Hernandez", "H1253123", "Mexico, MX", 
                82243234, 33, 32, null, 18000.12);
        
        System.out.println("Jefe Zona: ");
        JefeZona2.mostrarDatos();
        System.out.println("");
    
        //ASIGNAR VENDEDORES
        System.out.println("Asignar vendedores");
        JefeZona1.asignarVendedor(Vendedor2);
        JefeZona2.asignarVendedor(Vendedor1);
        
        //MOSTRAR VENDEDORES
        System.out.println("Mostrar vendedores");
        JefeZona1.mostrarVendedores();
        System.out.println("");
        JefeZona2.mostrarVendedores();
        System.out.println("");
        
        //ASIGNAR SECRETARIO
        System.out.println("Asignar Secretarios");
        System.out.println("");
        JefeZona1.asignarSecretario(Secretario2);
        JefeZona2.asignarSecretario(Secretario1);
        
        //MOSTRAR SECRETARIO
        System.out.println("Mostrar Secretarios");
        JefeZona1.mostrarSecretario();
        System.out.println("");
        JefeZona2.mostrarSecretario();
        System.out.println("");
        
        //ASIGNAR JEFE
        System.out.println("Asignar JEFE");
        
        
        //AUMENTO SUELDO A VENDEDORES
        System.out.println("Aumentar sueldo a Vendedores");
        Vendedor1.incrementarSalario(0.15);
        Vendedor2.incrementarSalario(0.15);
        System.out.println("Sueldo incrementado en 0,15%");
        System.out.println("");
        
        //AUMENTAR SUELDO A SECRETARIOS
        System.out.println("Aumentar sueldo a Secretarios");
        Secretario1.incrementarSalario(0.12);
        Secretario2.incrementarSalario(0.12);
        System.out.println("Sueldo incrementado en 0,12%");
        System.out.println("");
        
        //AUMENTAR SUELDO A JEFE ZONA
        System.out.println("Aumentar sueldo a JefesZona");
        JefeZona1.incrementarSalario(0.17);
        JefeZona2.incrementarSalario(0.17);
        System.out.println("Sueldo incrementado en 0,17%");
        System.out.println("");
        
        //CAMBIAR AUTO
        System.out.println("SE LES ASIGNA NUEVO AUTO A LOS JEFES"+"\n");
        JefeZona1.cambiarAuto("Ferrari");
        JefeZona2.cambiarAuto("BWM");
        

    }
    
    
    
}
