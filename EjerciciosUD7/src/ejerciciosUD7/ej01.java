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
public class ej01 {
    
    public static void Ejecutar() {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero: ");
        num1=sc.nextDouble();
        System.out.println("Inroduzca el segundo numero: ");
        num2=sc.nextDouble();
        
        System.out.println("El producto de la multiplicacion es: "
                +multiplicar(num1, num2));
        
    }
    
    public static double multiplicar(double a, double b){
        double producto = a * b;
        return producto;
    }
}
