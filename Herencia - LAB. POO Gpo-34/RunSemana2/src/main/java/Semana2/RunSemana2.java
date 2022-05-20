package Semana2;

import Semana2.CalculadoraBasica;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

/**
 *
 * @author PC
 */
public class RunSemana2 {
    
    Scanner sm = new Scanner (System.in);
    
    public static void main(String[] args) throws Exception {
        CalculadoraBasica casio = new CalculadoraBasica();
        double rs = casio.suma(2,2);
        System.out.println(rs);
        System.out.println(casio.mult(9, 9));
    }
}
