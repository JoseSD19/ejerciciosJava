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
public class Ej05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero para calcular el factorial: ");
        int num = entrada.nextInt();
        
        if (num>=0){
            int factorial = 1;
            if(num>1){
                for(int i=1;i<=num;i++){
                    factorial = factorial * i;
                }
            }
            System.out.println("El factorial de "+num+" es: "+factorial);
        }else{
            System.out.println("Introduzca un numero positivo");
        }
    }
}
