/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud5;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej15 {
    public static void main(String[] args) {
        int multi=0, num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el numero: ");
        num = entrada.nextInt();
        
        for (int i = 1; i <= num;i++) {
            if (i%3==0) {
                multi++;
            }
        }
        System.out.println("Cantidad de multiplos de 3 entre 1 y "+num+": "+multi);
    }
}
