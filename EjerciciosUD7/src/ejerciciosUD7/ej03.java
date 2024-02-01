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
public class ej03 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Introduzca un numero: ");
        num1=sc.nextInt();
        System.out.println("Introduzca otro numero: ");
        num2=sc.nextInt();
        System.out.println("El menor de los dos es: "+minimo(num1,num2));
    }
    
    public static int minimo(int a, int b){
        int menor;
        if (a<b) {
            menor = a;
        }else{
            menor = b;
        }
        return menor;
    }
}
