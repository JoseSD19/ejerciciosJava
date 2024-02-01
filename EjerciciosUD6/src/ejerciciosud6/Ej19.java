/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej19 {
    void Ejecutar(){
        int puntos[] = new int [8];
        int puntosOrden[]=new int[8];
        Scanner sc = new Scanner(System.in);
        int num, pos=0;
        
        for(int i=0;i<puntos.length;i++){
            do{//bucle para comprobar que mete valores correctos entre los indicados
                System.out.println("Introduzca la puntuacion del jugador "+(i+1));
                num = sc.nextInt();
                if(num<1000||num>2800){
                    System.out.println("Puntuacion incorrecta, pruebe de nuevo");
                }
            }while(num<1000||num>2800);
            puntos[i]=num;
        }
        Arrays.sort(puntos);
        for(int i=puntos.length-1;i>=0;i--){
            puntosOrden[pos]=puntos[i];
            pos++;
        }
        System.out.println(Arrays.toString(puntosOrden));
    }
}
