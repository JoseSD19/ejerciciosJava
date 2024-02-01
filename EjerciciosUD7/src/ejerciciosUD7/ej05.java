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
public class ej05 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int millas;
        
        System.out.println("Introduzca el cuantas millas: ");
        millas=sc.nextInt();
        
        System.out.println("Los Kms son: "+convierteMillasEnKms(millas));
    }
    
    public static double convierteMillasEnKms(int millas){
        double km = millas * 1.60934;
        return km;
    }
}
