package com.mycompany.semana11;


import com.mycompany.semana11.Empleado;
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class JefeZona extends Empleado {
    
    String coche;
    
    
    ArrayList<Vendedor> vendedores = new ArrayList<>();
    ArrayList<Secretario> secretarios = new ArrayList<>();
    
    
    public JefeZona(String coche,String nombre, String apellido, String dni, String direccion, int telefono, int edad, 
            int antiguedad, Empleado superior, double salario) {
        super(nombre, apellido, dni, direccion, telefono, edad, antiguedad, superior, salario);
        this.coche = coche;
    }
    
 
    
    public void asignarVendedor(Vendedor nuevoVendedor){
        this.vendedores.add(nuevoVendedor);
         nuevoVendedor.cambiarSuperior(this);
    }
    
    public void mostrarVendedores(){
        for(int i=0; i<this.vendedores.size(); i++){
            this.vendedores.get(i).mostrarDatos();
        }
    }
    
    public void asignarSecretario(Secretario nuevoSecretario){
       this.secretarios.add(nuevoSecretario);
       nuevoSecretario.cambiarSuperior(this);//DENTRO DEL PACKAGE EMPRESA2018
}
    
    public void mostrarSecretario(){
    for (int i=0; i< this.secretarios.size(); i++){
       this.secretarios.get(i).mostrarDatos();
   }    
}
    
    
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("El auto asignado es: "+this.coche);
    }
    
}
