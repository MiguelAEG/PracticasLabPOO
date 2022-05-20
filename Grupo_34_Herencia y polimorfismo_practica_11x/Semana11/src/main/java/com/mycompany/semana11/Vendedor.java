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
public class Vendedor extends Empleado {
    
    //Atributos
    String coche;
    String Matricula;
    String Marca;
    String Modelo;
    String AreaVenta;
    int Celular;
    double Comision;
    
    public Vendedor(String coche, String Matricula, String Marca, String Modelo, String AreaVenta, int Celular, 
            double Comision, String nombre, String apellido, String dni, String direccion, int telefono, int edad, int antiguedad, 
            Empleado superior, double salario) {
        super(nombre, apellido, dni, direccion, telefono, edad, antiguedad, superior, salario);
        this.coche = coche;
        this.Matricula = Matricula;
        this.Marca= Marca;
        this.Modelo = Modelo;
        this.AreaVenta = AreaVenta;
        this.Celular = Celular;
        this.Comision = Comision;
              
    }
    
    public void Daralta (Empleado nuevoCliente){
        this.superior = nuevoCliente;
        System.out.println("Dar alta a un nuevo cliente: "+nuevoCliente);
    }
    
    public void Darbaja (Empleado nuevoCliente){
        this.superior = nuevoCliente;
        System.out.println("Dar de baja a un nuevo cliente: "+nuevoCliente);
    }
    
    public void cambiarCoche (String nuevoAuto){
        System.out.println("El nuevo auto del cliente es: "+nuevoAuto);
    }
    
    public void mostrarDatos(){
        System.out.println("Coche: "+this.coche);
        System.out.println("Marca: "+this.Marca);
        System.out.println("Modelo: "+this.Modelo);
        System.out.println("Matricula: "+this.Matricula);
        System.out.println("Su celular es: "+Celular+"\nSu area es: "+AreaVenta+"\nSu comision es: "+Comision);
    }

    void cambiar(JefeZona aThis) {
        System.out.println("Vendedor cambiado");
    }
    
}
