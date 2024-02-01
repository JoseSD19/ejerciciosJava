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
public class Ej11 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca un numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Introduzca otro numero: ");
        num2 = entrada.nextDouble();
        
        if (num1!= num2) {
            if (num1 > num2) {
                System.out.println("El mayor es: " + num1);
            } else {
                System.out.println("El mayor es: " + num2);
            }
        } else {
            System.out.println("Son iguales");
        }
    }
}
