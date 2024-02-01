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
public class Ej03 {
    public static void main(String[] args) {
        /*DATOS
            VARIABLES*/
        double area, lado;
        //---CREAR ENTRADA POR TECLADO---
        Scanner entrada = new Scanner(System.in);
        
        //ALGORITMO
        
        System.out.println("Introduce el lado del cuadrado: ");
        lado = entrada.nextDouble();//---LEER TECLADO---
        area = lado * lado;
        System.out.println("El arae del cuadrado de lado " + lado +
                " es igual a: " + area);
        
    }
    
}
