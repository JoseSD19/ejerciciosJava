/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud6;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej04 {
    void Ejecutar(){
        int numeros[] = new int[20];
        int num, sumPos=0, sumNeg=0;
        Scanner sc = new Scanner(System.in);
        
        //Primer bucle para almacenar los valores
        for( int i=0;i<numeros.length;i++){
            System.out.println("Introduzca el "+(i+1)+"º: ");
            num = sc.nextInt();
            numeros[i]=num;
        }
        
        //Segundo bucle para ejecutar las acciones con el array
        for(int j=0;j<numeros.length;j++){
            if(numeros[j]>0){
                sumPos+=numeros[j];
            }else if(numeros[j]<0){
                sumNeg+=numeros[j];
            }
        }
        System.out.println("La suma de todos los numeros positivos es: "+sumPos+
                "\nLa suma de todos los nuemros negativos es: "+sumNeg);
    }
}
