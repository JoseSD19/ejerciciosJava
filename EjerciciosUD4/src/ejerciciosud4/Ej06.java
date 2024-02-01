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
public class Ej06 {
    public static void main(String[] args) {
        /*DATOS
            VARIABLES*/
        
        Double precio_vta, precio_real, descuento;
        Scanner entrada = new Scanner (System.in);
        
        //ALGORITMO
        
        System.out.println("Introduzca el precio de venta: ");
        precio_vta = entrada.nextDouble();
        System.out.println("Introduzca el precio real: ");
        precio_real = entrada.nextDouble();
        
        descuento = ((precio_real - precio_vta) * 100) / precio_real;
        
        System.out.println("El descuento aplicado ha sido del: " + descuento + "%");
    }
}
