/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud6;

import java.util.Arrays;

/**
 *
 * @author alumnot
 */
public class Ej18 {
    void Ejecutar(){
        double aleatorio[]=new double[30];
        
        for(int i=0;i<aleatorio.length;i++){
            aleatorio[i]=(Math.random()*10);
        }
        //__Arrays.sort()__ ordena el array de menor a mayor
        Arrays.sort(aleatorio);
        
        System.out.println(Arrays.toString(aleatorio));
    }
}
