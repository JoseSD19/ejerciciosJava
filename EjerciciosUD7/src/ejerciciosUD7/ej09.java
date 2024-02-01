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
public class ej09 {

    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Introduzca un numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca otro numero: ");
        num2 = sc.nextInt();
        System.out.println("Introduzca el ultimo numero: ");
        num3 = sc.nextInt();

        System.out.println("El mayor de los 3 numeros es " + mayor(mayor(num1, num2),num3));
    }

    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
