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
public class Ej12 {
    public static void main(String[] args) {
        double num;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca un numero: ");
        num = entrada.nextDouble();
        
        if (num < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }
                
    }
    
}
