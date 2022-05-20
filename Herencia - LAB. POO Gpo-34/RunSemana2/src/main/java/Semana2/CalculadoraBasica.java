/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

/**
 *
 * @author PC
 */

public class CalculadoraBasica extends Calculadora{
    
    private String color;

    public double div(double a, double b) {
        return a/b;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double mult(double a, double b) {
        return a*b;
    }
}
