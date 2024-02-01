/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej17 {
    public static void main(String[] args) {
        int sec, min, hor;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca la hora: ");
        hor = entrada.nextInt();
        System.out.println("Introduzca los minutos: ");
        min = entrada.nextInt();
        System.out.println("Introduzca los segundos: ");
        sec = entrada.nextInt();
        
        if (sec<=60 && min<=60 && hor<=24){
            
            sec += 1;
                
            if(sec==60){
                sec = 00;
                min += 1;
            }
            if(min==60){
                min = 00;
                hor += 1;
            }
            if(hor == 24){
                hor = 00;
            }
            System.out.println("Transcurrido un segundo serian las: "
                    + hor+":"+min+":"+sec);
        }
        else{
            System.out.println("Introduzca un formato valido.");
        }
        
    }
}
