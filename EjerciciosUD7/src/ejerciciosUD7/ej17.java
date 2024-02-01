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
public class ej17 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do{
        System.out.println("Introduzca el numero (0 para salir): ");
        numero = sc.nextInt();
            if(numero<0){
                System.out.println("Por favor, numeros positivos");
            }else if (numero!=1&&numero!=0) {
                esPrimo(numero);
            }else if(numero==1){
                System.out.println("No es primo");
            }
            
        }while(numero!=0);
    }
    public static void esPrimo(int num){
        int divisores=0;
        for (int i = 1; i <=num; i++) {
            if ((num%i)==0) {
                divisores++;
            }
            if(divisores>2){
                System.out.println("No es primo");
                break;
            }
        }
        
        if (divisores==2){
            System.out.println("Es primo");
        }
    }
}
