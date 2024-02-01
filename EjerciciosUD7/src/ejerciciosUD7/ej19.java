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
public class ej19 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        
        System.out.println("introduzca el primer numero:");
        num1 =sc.nextInt();
        System.out.println("introduzca el segundo numero:");
        num2 =sc.nextInt();
        System.out.println("introduzca el tercer numero:");
        num3 =sc.nextInt();
        
        if(pitagoras(num1, num2, num3)){
            System.out.println("Cumple la ecuacion de Pitagoras:"
                    + "\n"+num1+"\u00b2 + "+num2+"\u00b2 = "+num3+"\u00b2");
        }else{
            System.out.println("No cumple la ecuacion de Pitagoras");
        }
        
        
    }
    public static boolean pitagoras(int x, int y, int z){
        boolean cumple;
        
        cumple = ((x*x)+(y*y))==(z*z);
        
        return cumple;
    }
}
