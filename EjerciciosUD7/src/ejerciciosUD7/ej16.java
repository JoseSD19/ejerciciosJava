/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class ej16 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int tama�o;
        
        System.out.println("De que tama�o es el array: ");
        tama�o=sc.nextInt();
        
        double vector[]=new double [tama�o];
        
        rellenar(vector);
        
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(df.format(vector[i])+" ");
        }
        System.out.println("]");
        
    }
    public static void rellenar(double vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=Math.random();
        }
    }
}
