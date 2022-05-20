/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana11;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Secretario extends Empleado {

    String despacho;
    int numFax;


    public Secretario(String despacho, int numFax, String nombre, String apellido, String dni, String direccion, 
            int telefono, int edad, int antiguedad, Empleado superior, double salario) {
        super(nombre, apellido, dni, direccion, telefono, edad, antiguedad, superior, salario);   
        this.despacho=despacho;
        this.numFax = numFax;
    }
    
    @Override
    public void mostrarDatos(){
        
        super.mostrarDatos();
        System.out.println("Despacho: "+this.despacho);
        System.out.println("El Fax es: "+this.numFax);
}
    

    
    
   
    
}
