/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrecursividad;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Fibonacci {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos pasos de la cadena quieres hacer: ");
        int n = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            System.out.print(cadena(i)+" ");
        }
        
    }

    public static int cadena(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return cadena(n - 1) + cadena(n - 2);
        }

    }
}
