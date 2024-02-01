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
public class ej02 {

    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();

        if (esMayorEdad(edad)) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
    }

    public static boolean esMayorEdad(int a) {
        boolean mayor = (a >= 18);
        return mayor;
    }
}
