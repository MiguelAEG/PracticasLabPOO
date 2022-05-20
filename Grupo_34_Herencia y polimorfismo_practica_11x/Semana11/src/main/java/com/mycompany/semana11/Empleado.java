/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana11;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public  abstract class Empleado {
    

        private String nombre;
        private String apellido;
        private String dni;
        private String direccion;
        private int telefono;
        private int edad;
        private int antiguedad;
        Empleado superior;
        
        double salario;
        
        public Empleado(String nombre, String apellido, String dni, String direccion, int telefono, int edad, int antiguedad, 
                Empleado superior, double salario){
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.direccion = direccion;
            this.telefono = telefono;
            this.edad = edad;
            this.antiguedad = antiguedad;
            this.salario = salario;
            this.superior = superior;
        }
        
        public void mostrarDatos(){
            System.out.println("");
            System.out.println("Nombre: "+this.nombre);
            System.out.println("Antiguedad: "+this.antiguedad);
            System.out.println("Salario: "+this.salario);
        }
        
        public void cambiarSuperior(Empleado nuevoSuperior){
            this.superior = nuevoSuperior;
        }
        
        public void cambiarSecretario(Empleado nuevoSecretario){
            this.superior = nuevoSecretario;
        }
        
        public void cambiarAuto(String nuevoAuto){
            System.out.println("El nuevo auto asignado de "+this.nombre+" es "+nuevoAuto);
        }
        
        public void incrementarSalario(Double incrementoSalarial){
            System.out.println("");
            System.out.println("El sueldo previo al aumento: $"+this.salario);
            this.salario = this.salario+incrementoSalarial*this.salario;
            System.out.println("El sueldo con el aumento de: "+this.nombre+" es $"+this.salario);
        }
        

        /**
         * @return the nombre
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * @param nombre the nombre to set
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * @return the apellido
         */
        public String getApellido() {
            return apellido;
        }

        /**
         * @param apellido the apellido to set
         */
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        /**
         * @return the dni
         */
        public String getDni() {
            return dni;
        }

        /**
         * @param dni the dni to set
         */
        public void setDni(String dni) {
            this.dni = dni;
        }

        /**
         * @return the direccion
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * @param direccion the direccion to set
         */
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        /**
         * @return the telefono
         */
        public int getTelefono() {
            return telefono;
        }

        /**
         * @param telefono the telefono to set
         */
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        /**
         * @return the edad
         */
        public int getEdad() {
            return edad;
        }

        /**
         * @param edad the edad to set
         */
        public void setEdad(int edad) {
            this.edad = edad;
        }

        /**
         * @return the antiguedad
         */
        public int getAntiguedad() {
            return antiguedad;
        }

        /**
         * @param antiguedad the antiguedad to set
         */
        public void setAntiguedad(int antiguedad) {
            this.antiguedad = antiguedad;
        }

        /**
         * @return the salario
         */
        public double getSalario() {
            return salario;
        }

        /**
         * @param salario the salario to set
         */
        public void setSalario(double salario) {
            this.salario = salario;
        }
        
        
    }
    
    
    

