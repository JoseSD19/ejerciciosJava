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
public class Ej12 {
    public static void main(String[] args) {
        int base, exponente, resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("introduzca la base: ");
        base = entrada.nextInt();
        System.out.println("introduzca el exponente: ");
        exponente = entrada.nextInt();
        
        resultado = base;
        for(int i=1;i<exponente;i++){
            resultado = resultado * base;
        }
        if (base <0 && exponente%2 != 0){
            resultado = resultado * (-1);
        }
        System.out.println("El resultado es: "+resultado);
    }
}
