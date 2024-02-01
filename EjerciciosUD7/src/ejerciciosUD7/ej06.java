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
public class ej06 {

    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        double precio;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca el precio sin IVA: ");
            precio = sc.nextDouble();

            System.out.println("Al aplicarle el IVA seria: " + precioConIva(precio));
        }

    }

    public static double precioConIva(double precio) {
        double total = precio * 1.21;
        return total;
    }
}
