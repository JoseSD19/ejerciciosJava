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
public class Ej17 {
    void Ejecutar(){
        int array1[]=new int[10], array2[]=new int[10];
        Scanner sc = new Scanner (System.in);
        
        for(int i=0;i<array1.length;i++){
            System.out.println("Introduzca el nuemro "+(i+1)+" del 1er vector");
            array1[i]=sc.nextInt();
        }
        for(int i=0;i<array2.length;i++){
            System.out.println("Introduzca el nuemro "+(i+1)+" del 2o vector");
            array2[i]=sc.nextInt();
        }
        //__Arrays.equals()__ compara los 2 arrays devolviendo _true_ si son exactamente iguales, si no lo son devuelve _false_
        if (Arrays.equals(array1, array2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
    }
}
