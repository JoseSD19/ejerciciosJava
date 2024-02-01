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
public class Ej16 {
     public static void main(String[] args) {
         int nota;
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Introduzca una nota: ");
         nota = entrada.nextInt();
         if (nota <= 10 && nota>=0) {
            if (nota<9) {
                if (nota<6) {
                    if (nota<5) {
                        if (nota<3) {
                            System.out.println("Muy Deficiente");
                        } else {
                            System.out.println("Insuficiente");
                        }
                    } else {
                        System.out.println("Bien");
                    }
                } else {
                    System.out.println("Notable");
                }
            } else {
             System.out.println("Sobresaliente");
            }
         } else {
             System.out.println("Introduzca una nota valida");
         }
    }
}     
