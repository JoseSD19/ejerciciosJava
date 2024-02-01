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
public class Ej07 {
    public static void main(String[] args) {
        /*DATOS
            VARIABLES*/
        
        double millas, m;
        Scanner entrada = new Scanner(System.in);
        
            //FIJOS
            
        int equivalencia = 1852;
        
        //ALGORITMO
        
        System.out.println("Introduzca las millas marinas: ");
        millas = entrada.nextDouble();
        m = millas * equivalencia;
        System.out.println("Los metros recorridos son: " + m);
        
        
    }
}
