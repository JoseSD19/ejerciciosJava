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
public class Ej18 {
    public static void main(String[] args) {
        int num, resultado=0;
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        //boolean repetir=false;
        
        do{
            System.out.println("Introduzca un numero entre el 1 y el 10: ");
            num = entrada.nextInt();
            if(num<1 || num>10){
                //repetir=true;
                System.out.println("Introduzca un numero valido.");
            }
        }while(num<1 || num>10);
        
        for(int i=1;i<=num;i++){
                resultado = (int) (resultado + Math.pow(i, 2));
                mensaje =mensaje + i + "^2 ";
        }
        System.out.println("La suma de ("+mensaje+") es "+resultado);
    }
}
