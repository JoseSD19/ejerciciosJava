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
public class Ej20 {
    public static void main(String[] args) {
        int num, i;
        Scanner sc = new Scanner(System.in);
        String mensaje="";
        
        do{
        System.out.println("Dime un numero entre 0 y 20: ");
        num = sc.nextInt();
        
        if(num<0 || num>20){
            System.out.println("Numero no valido");
        }
        }while(num<0 || num>20);
        
        for(i=1;i<=num;i++){
            for(int repetir=1;repetir<=i;repetir++){
                mensaje = mensaje + i;
            }//Segundo bucle para aumentar --mensaje-- tantas veces como valga el numero --i--
            mensaje = mensaje + " ";
        }
        System.out.println(mensaje);
    }
}
