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
public class ej08 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Indique un numero: ");
        num=sc.nextInt();
        
        System.out.println("El sumatorio desde 1 hasta "+num+" es: "+suma1aN(num)
                +"\nEl producto desde 1 hasta "+num+" es: "+producto1aN(num)
                +"\nEl valor intermedio entre 1 y "+num+" es : "+intermedio1aN(num));
        
        
    }
    
    public static int suma1aN(int n){
        int suma=0;
        for (int i = 1; i <= n; i++) {
            suma +=i;
        }
        return suma;
    }
    
    public static int producto1aN(int n){
        int prod=1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }
    
    public static double intermedio1aN(int n){
        double mitad = n/2.0;
        return mitad;
    }
}
