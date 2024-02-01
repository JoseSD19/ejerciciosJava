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
public class ej18 {

    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Introduzca su numero de DNI: ");
        numero = sc.nextInt();
        
        System.out.println("El DNI es: "+numero+"-"+letraDNI(numero));
       
    }

    public static char letraDNI(int a) {
        int resto = a%23;
        
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[resto];
    }
}
