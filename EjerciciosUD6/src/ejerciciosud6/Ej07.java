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
public class Ej07 {
    void Ejecutar(){
        
        int tamaño, num1, num2, min;
        Scanner sc = new Scanner(System.in);
        
        //Pedimos los limites del array
        System.out.println("Indique el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Indique el segundo numero: ");
        num2 = sc.nextInt();
        
        //Comprobamos cual es mayor y cual menor para ver el tamaño
        if(num1>num2){
            min = num2;
            tamaño = num1-num2+1;
        }else{
            min = num1;
            tamaño = num2-num1+1;
        }
        
        int numeros[] = new int[tamaño];
        
        //Primer bucle para almacenar los valores
        for(int i=0;i<numeros.length;i++){
            numeros[i]=min;
            min++;
        }
        
        //Segundo bucle para ejecutar las acciones con el array
        for(int j=0;j<numeros.length;j++){
            System.out.println(numeros[j] + " ");
        }
    }
}
