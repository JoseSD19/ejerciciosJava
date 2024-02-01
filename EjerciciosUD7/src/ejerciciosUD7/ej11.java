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
public class ej11 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Introduzca el numero");
        num =sc.nextInt();
        
        tablaMultiplicar(num);
    }
    
    public static void tablaMultiplicar(int a){
        for (int i = 1; i <= 10; i++) {
            int prod = a * i;
            System.out.println(a+"*"+i+"="+prod);
        }
    }
}
