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
public class Ej13 {
    public static void main(String[] args) {
        int num, min=1, max=100;
        Scanner entrada = new Scanner(System.in);
        String acierto,mayor;
        boolean seguir = true;
                
        System.out.println("Piense un numero entre 1 y 100");
        
        do{
            num = (min+max)/2;
            System.out.println("¿El numero que has pensado es: "+num+"?(S/N): ");
            acierto = entrada.next();
            if("S".equals(acierto) || "s".equals(acierto)){
                seguir = false;
                System.out.println("¡Aciertoo!");
            }else{
                System.out.println("El numero es Mayor (+) o Menos (-): ");
                mayor = entrada.next();
                if ("+".equals(mayor)){
                    min = num;
                }else{
                    max = num;
                }
            }
        }while(seguir==true);
    }
}
