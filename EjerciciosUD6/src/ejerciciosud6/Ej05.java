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
public class Ej05 {
    void Ejecutar(){
        double numeros[] = new double[20];
        double num, suma=0;
        Scanner sc = new Scanner(System.in);
        
        //Primer bucle para almacenar los valores
        for( int i=0;i<numeros.length;i++){
            System.out.println("Introduzca un numero: ");
            num = sc.nextInt();
            numeros[i]=num;
        }
        
        //Segundo bucle para ejecutar las acciones con el array
        for(int j=0;j<numeros.length;j++){
            suma += numeros[j];
        }
        
        double media = suma / numeros.length;
        System.out.println("La media de todos los numeros es: "+ media);
    }
}
