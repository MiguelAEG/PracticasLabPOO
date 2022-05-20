/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana10;

import java.io.*;

/**
 *
 * @author PC
 */

public class WriteAFile {
    
    public WriteAFile(String fileN){
        this.wfiles(fileN);
    }
    
    private void wfiles(String fileN){
    
        FileWriter fw;
        FileReader fr;
        try
        {
            fw = new FileWriter(fileN);
            //Escribimos en el fichero un String y un caracter 97 (a)
            fw.write("Esto es una prueb");
            fw.write(97);
            //Cierro el stream
            fw.close(); 
                //Abro el stream, el fichero debe existir
            fr=new FileReader(fileN);
            //Leemos el fichero y lo mostramos por pantalla
            int valor=fr.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
            }
            //Cerramos el stream
             fr.close();
        }
        //File not found es una sub-class de IOExpection
        catch(IOException ex) 
                {
            System.out.println(ex.getMessage());
        }
        finally
        {
       
        }
        
    }
    
}