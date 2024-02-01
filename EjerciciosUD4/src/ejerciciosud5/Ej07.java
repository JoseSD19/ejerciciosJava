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
public class Ej07 {
    public static void main(String[] args) {
        int neg=0, pos=0, i=1;
        Scanner entrada = new Scanner(System.in);
        
        while(i<=10){
        System.out.println("Introduzca un numero: ");
        int num= entrada.nextInt();
        if (num<0){
            neg++;
        }else{
            pos++;
        }
        i++;
        }
        System.out.println("Se han leido: "+pos
                + " numeros positivos"
                + " y "+neg+" numeros negativos");
    }
}
