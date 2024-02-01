/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej08 {
    public static void main(String[] args) {
        /*DATOS
            VARIABLES*/
        int edad;
        Scanner entrada = new Scanner(System.in);
        //ALGORITMO
        System.out.println("Introduzca su edad: ");
        edad = entrada.nextInt();
        
        if (edad >= 18) {//---se crea el if---
            System.out.println("Eres mayor de edad");
        }//---se cierra el if---
    }
}
