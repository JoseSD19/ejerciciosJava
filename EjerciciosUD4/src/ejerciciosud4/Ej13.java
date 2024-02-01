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
public class Ej13 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca un numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Introduzca un numero: ");
        num2 = entrada.nextDouble();
        
        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println("Los numeros ordenados son: " +num2+", "+num1);
            } else {
                System.out.println("Los numeros ordenados son: "+num1+", "+num2);
            }
        } else {
            System.out.println("Son iguales");
        }
    }
}
