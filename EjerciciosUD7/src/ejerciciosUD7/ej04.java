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
public class ej04 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Introduzca un numero entero: ");
        num=sc.nextInt();
        
        switch (dimeSigno(num)) {
            case 1:
                System.out.println("Es positivo");
                break;
            case -1:
                System.out.println("Es negativo");
                break;
            case 0:
                System.out.println("Es cero");
                break;
        }
    }
    
    public static int dimeSigno(int a){
        int signo;
        if (a>0) {
            signo=1;
        }else if(a<0){
            signo=-1;
        }else{
            signo=0;
        }
        return signo;
    }
}
