/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practica9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author A
 */
public class Practica9App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        Scanner in = new Scanner(System.in);

        char[] listaC = new char[5];
        char[] sublistaC;
        char c;
        String[] listaS = new String[5];
        String[] sublista;

        do {
            switch (opcion) {
                case 1 -> {
                    int inicio, fin;
                    System.out.println("Introduzca 5 strings");
                    for (int i = 0; i < 5; i++) {
                        listaS[i] = in.next();
                    }
                    do {
                        System.out.println("Introduzca el indice (0-4) de donde empezar");
                        inicio = in.nextInt();
                    } while (inicio < 0 || inicio > 4);
                    do {
                        System.out.println("Introduzca el indice (0-4) en donde terminar");
                        fin = in.nextInt();
                    } while (fin < 0 || fin > 4);
                    sublista = miSublista(listaS, inicio, fin);
                    System.out.println("La sublista es: ");
                    for (String sublista1 : sublista) {
                        System.out.println(sublista1);
                    }
                }

                case 2 -> {
                    System.out.println("Introduzca 5 caracteres");
                    for (int i = 0; i < 5; i++) {
                        listaC[i] = in.next().charAt(0);
                    }

                    checartipochar(listaC);
                }

                case 3 -> {
                    char opcion2;
                    System.out.println("Introduzca 5 letras");
                    for (int i = 0; i < 5; i++) {
                        do {
                            listaC[i] = in.next().charAt(0);
                        } while (!Character.isLetter(listaC[i]));
                    }

                    System.out.println("Ingrese m para minuscula y M para mayuscula");
                    do {
                        opcion2 = in.next().charAt(0);
                    } while (opcion2 != 'm' && opcion2 != 'M');

                    sublistaC = conversion(listaC, opcion2);
                    System.out.println("Los caracteres convertidos son: ");
                    for (char listaC1 : sublistaC) {
                        System.out.println(listaC1);
                    }
                }

                case 4 -> {
                    System.out.println("Introduzca 5 strings");
                    for (int i = 0; i < 5; i++) {
                        listaS[i] = in.next();
                    }

                    System.out.println("Introduzca el caracter");
                    c = in.next().charAt(0);

                    sublista = elementosComienzanCon(listaS, c);
                    System.out.println("Elementos que comienzan con" + c + ": ");
                    for (String sublista1 : sublista) {
                        System.out.println(sublista1);
                    }
                }

                case 5 -> {
                    System.out.println("Introduzca 5 strings");
                    for (int i = 0; i < 5; i++) {
                        listaS[i] = in.next();
                    }

                    System.out.println("Introduzca el caracter");
                    c = in.next().charAt(0);

                    sublista = elementosTerminanCon(listaS, c);
                    System.out.println("Elementos que terminan con" + c + ": ");
                    for (String sublista1 : sublista) {
                        System.out.println(sublista1);
                    }
                }

                case 6 -> {
                    System.out.println("Fin del programa");
                }
            }
            System.out.println("""

                    Seleccione una opcion del menu:
                    1. Crear una sublista de strings
                    2. Checar tipo de caracteres de una lista
                    3. Convertir a minuscula o mayuscula
                    4. Checar elementos de una lista de strings que comienzan con un caracter
                    5. Checar elementos de una lista de strings que terminan con un caracter
                    6. Terminar el programa""");
            opcion = in.nextInt();
        } while (opcion != 6);
        in.close();
    }

    /**
     * Devuelve una sublista de una lista, empezando por el indice inicio y
     * terminando en el indice fin
     * 
     * @param listaS Lista de arrays de entrada
     * @param inicio Indice de inicio
     * @param fin    Indice de fin
     * @return Sublista empezando en inicio y terminando en fin
     */
    public static String[] miSublista(String[] listaS, int inicio, int fin) {
        ArrayList<String> sublista = new ArrayList<>();
        for (int i = inicio; i <= fin; i++) {
            sublista.add(listaS[i]);
        }
        return sublista.toArray(String[]::new);
    }

    /**
     * Checa el tipo de caracter de cada elemento
     * 
     * @param listaC Lista de caracteres
     */
    public static void checartipochar(char[] listaC) {
        for (int i = 0; i < listaC.length; i++) {
            if (Character.isLetter(listaC[i])) {
                System.out.println(listaC[i] + " es una letra");
            } else if (Character.isDigit(listaC[i])) {
                System.out.println(listaC[i] + " es un numero");
            } else if (Character.isWhitespace(listaC[i])) {
                System.out.println(listaC[i] + " es un espacio");
            } else {
                System.out.println(listaC[i] + " es otro caracter");
            }
        }
    }

    /**
     * Recibe un array de 5 caracteres y un caracter que es m para minuscula
     * o M para mayuscula, y devuelve un array de 5 caracteres con la conversion
     * 
     * @param listaC Array de caracteres
     * @param m      Caracter que indica si se quiere minuscula o mayuscula
     * @return Array de caracteres con la conversion
     */
    public static char[] conversion(char[] listaC, char m) {
        char[] listaC2 = new char[5];
        for (int i = 0; i < listaC.length; i++) {
            if (m == 'm') {
                listaC2[i] = Character.toLowerCase(listaC[i]);
            } else {
                listaC2[i] = Character.toUpperCase(listaC[i]);
            }
        }
        return listaC2;
    }

    /**
     * Recibe un array de 5 strings y un caracter, devuelve un array que contiene
     * a todos los elementos del primer array que empiezan con el caracter dado
     * 
     * @param listaS Array de strings
     * @param c      Caracter
     * @return Array de strings con los elementos que empiezan con el caracter dado
     */
    public static String[] elementosComienzanCon(String[] listaS, char c) {
        ArrayList<String> sublista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (listaS[i].charAt(0) == c) {
                sublista.add(listaS[i]);
            }
        }
        return sublista.toArray(String[]::new);
    }

    /**
     * Recibe un array de 5 strings y un caracter, devuelve un array que contiene
     * a todos los elementos del primer array que terminan con el caracter dado
     * 
     * @param listaS Array de strings
     * @param c      Caracter
     * @return Array de strings con los elementos que terminan con el caracter dado
     */
    public static String[] elementosTerminanCon(String[] listaS, char c) {
        ArrayList<String> sublista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (listaS[i].charAt(listaS[i].length() - 1) == c) {
                sublista.add(listaS[i]);
            }
        }
        return sublista.toArray(String[]::new);
    }
}
