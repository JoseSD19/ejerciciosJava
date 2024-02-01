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
public class Ej09 {
    public static void main(String[] args) {
        /*DATOS
            VARIABLES*/
        int edad;
        Scanner entrada = new Scanner(System.in);
        //ALGORITMO
        System.out.println("Introduzca su edad: ");
        edad = entrada.nextInt();
        //---se crea el 'if'---
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }//---Se cierra el 'if' antes de abrir el 'else'---
        else{//---se abre el 'else'---
            System.out.println("Eres menor de edad");
        }//---se cierra el else---
    }
}
