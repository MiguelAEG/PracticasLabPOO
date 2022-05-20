/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana4;

import static java.lang.Math.sqrt;

/**
 *
 * @author PC
 */
public class Calculadora extends DispositivoElectronico implements IOperacioneStandar, IOperacioneAvanzadas{

    @Override
    public void encender() {
        System.out.println("Calculadora encendida");
    }
    
    public void marca(String d){
        System.out.println(d+"La marca es: ");
    }
    
    @Override
    public void apagar() {
        System.out.println("Calculadora Apagada");
    }

    @Override
    public double suma(double a, double b) {
       return a+b;
    }

    @Override
    public double resta(double a, double b) {
        return a-b;
    }

    @Override
    public double mult(double a, double b) {
        return a*b;
    }

    @Override
    public double div(double a, double b) {
        return a/b;
    }

    @Override
    public double raiz(double a) {
        return sqrt(a);
    }

    @Override
    public double residuo(double a) {
        return a%2;
    }
       
}
