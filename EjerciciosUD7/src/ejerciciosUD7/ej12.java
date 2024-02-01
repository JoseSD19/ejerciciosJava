/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD7;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class ej12 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        double km;
        
        System.out.println("Introduzca los Kms: ");
        km = sc.nextDouble();
        
        
        System.out.println(km+"Kms son "+kmMillas(km)+" millas");
        
    }
    
    public static double kmMillas(double a){
        double millas = a * 0.621371;
        return millas;
    }
}