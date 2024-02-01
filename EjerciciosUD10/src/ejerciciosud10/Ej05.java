/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosud10;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Ej05 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero positivo");
        int num=sc.nextInt();
        
        try{
            imprimePositivo(num);
        }catch(Exception e){
            System.out.println("No es un numero positivo");
        }
        
        System.out.println("Introduzca un numero negativo");
        num=sc.nextInt();
        
        try{
            imprimeNegativo(num);
        }catch(Exception e){
            System.out.println("No es un numero negativo");
        }
        
        
    }
    
    public static void imprimePositivo(int p) throws Exception{
        
        if(p<0){
            throw new Exception ("Numero negativo");
        }
        System.out.println("El numero positivo es: "+p);
    }
    
    public static void imprimeNegativo(int p) throws Exception{
        
        if (p>0) {
            throw new Exception("Numero positivo");
        }
        System.out.println("El numero negativo es: "+p);
    }
}
