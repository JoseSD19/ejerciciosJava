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
public class Ej16 {
    void Ejecutar(){
        int secuencia[]=new int [1+2+3+4+5+6+7+8+9+10];
        int cont = 0;
        
        for(int i=1;i<=10;i++){
            Arrays.fill(secuencia,cont,cont+i, i);//rellena en la posicion cont con el valores de i
            cont+=i;
        }
        //__Arrays.toString()__ muestra el array de la siguiente manera [x, x, x]
        System.out.println(Arrays.toString(secuencia));
    }
}
