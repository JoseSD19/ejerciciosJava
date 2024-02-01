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
public class Ej08 {
    public static void main(String[] args) {
        int neg=0, pos=0, num;
        Scanner entrada = new Scanner(System.in);
        
        do {
        System.out.println("Introduzca un numero: ");
        num= entrada.nextInt();
        if (num<0){
            neg++;
        }else if(num>0){
            pos++;
        }
        }while(num!=0);
        if(neg>0){
            System.out.println("Se ha leido algun negativo.");
        }
        System.out.println("Se han leido: "+pos
                + " numeros positivos"
                + " y "+neg+" numeros negativos");
    }
}
