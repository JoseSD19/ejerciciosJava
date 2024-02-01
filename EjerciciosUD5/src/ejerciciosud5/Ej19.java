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
public class Ej19 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        String mensaje="";
        
        System.out.println("Dime un numero: ");
        num = sc.nextInt();
        
        if(num<0){
            System.out.println("*");
        }else{
            for(int i=1;i<=num;i++){
                mensaje = mensaje +"* ";
            }
        }
        System.out.println(mensaje);
    }
}
