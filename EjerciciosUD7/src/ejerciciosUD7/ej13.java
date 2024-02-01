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
public class ej13 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        double  precio, descontado;
        
        System.out.println("Introduzca el precio del producto");
        precio = sc.nextDouble();
        System.out.println("Introduzca el precio con el descuento aplicado: ");
        descontado = sc.nextDouble();
        
        System.out.println("El descuento aplicado ha sido del "+porcentaje(precio, descontado)+"%");
    }
    public static double porcentaje(double precio, double descontado){
        double descuento;
        descuento = ((precio - descontado)/precio)*100;
        return descuento;
    }
}
