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
public class Ej15 {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca un numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Introduzca un numero: ");
        num2 = entrada.nextDouble();
        System.out.println("Introduzca un numero: ");
        num3 = entrada.nextDouble();
        
        if (num1 != num2 || num1 != num3) {
            if (num1 > num2) {
                if (num1 > num3) {
                    System.out.println("El mayor es: " + num1);
                } else {
                    System.out.println("El mayor es: " + num3);
                }
            } else {
                if (num2 > num3) {
                    System.out.println("El mayor es: " + num2);
                } else {
                    System.out.println("El mayor es: " + num3);
                }
            }
        } else {
            System.out.println("Son iguales");
        }
    }
}
