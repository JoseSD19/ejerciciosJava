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
public class Ej20 {
    void Ejecutar(){
        int buscar[]=new int[1000];
        int num, veces=0, pos;
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<buscar.length;i++){
            buscar[i]=(int)(Math.random()*100);
        }
        Arrays.sort(buscar);//__Arrays.sort__ordena el array
        
        do{
        System.out.println("¿Que numero quiere buscar? (entre 0 y 99)");
        num=sc.nextInt();
        if(num<0||num>99){
            System.out.println("Numero incorrecto, introduzca otro.");
        }
        }while(num<0||num>99);
        
        for(int i=0;i<buscar.length;i++){
            if(buscar[i]==num){
                veces++;
            }
        }
        
        if(veces>0){
            System.out.println("El numero "+num+" esta en el array");
            if(veces>1){
                System.out.println("Concretamente esta "+veces+" veces");
            }else{
                System.out.println("Solo esta 1 vez");
            }
        }else{
            System.out.println("El numero "+num+" no esta en el array");
        }
    }
}
