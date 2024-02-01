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
public class Ej05 {
    public static void main(String[] args) {
        /*DATOS
            VARIABLES*/
        double radio, area, longitud, volumen;
        Scanner entrada = new Scanner(System.in);
        
        //ALGORITMO
        
        System.out.println("Introduzca el valor del radio: ");
        radio = entrada.nextDouble();
        
        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;
        volumen = (4/3) * Math.PI * Math.pow(radio,3);
        
        System.out.println("Dado el radio: " + radio +
                "\nLa longitud del circulo es: " + longitud +
                //_\n_---salto de linea---
                "\nEl area del circulo es: " + area +
                "\nEl volumen de la circunferencia es: " + volumen);
        
    }
}
