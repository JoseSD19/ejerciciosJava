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
public class Ej16 {
    public static void main(String[] args) {
        int num, divisores=0;
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca un numero: ");
            num = entrada.nextInt();
            if(num<=0){
                System.out.println("Introduzca un numero positivo.");
            }
        }while(num<=0);
        
        for (int i = 1; i<=num; i++){
            if(num%i == 0){
                divisores++;
            }
        }
        if (divisores >2){
            System.out.println("No es primo");
        }else{
            System.out.println("Es primo");
        }
    }
}
