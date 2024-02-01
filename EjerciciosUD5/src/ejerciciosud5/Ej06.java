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
public class Ej06 {
    public static void main(String[] args) {
        int neg=0, i=1;
        Scanner entrada = new Scanner(System.in);
        
        while(i<=10){
        System.out.println("Introduzca un numero: ");
        int num= entrada.nextInt();
        if (num<0){
            neg++;
        }
        i++;
        }
        if(neg>0){
            System.out.println("Se ha leido algun negativo.");
        }else{
            System.out.println("No se ha leido ningun negativo.");
        }
    }
}
