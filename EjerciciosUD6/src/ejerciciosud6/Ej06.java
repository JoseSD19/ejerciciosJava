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
public class Ej06 {
    void Ejecutar(){
        
        int tamaño, num;
        Scanner sc = new Scanner(System.in);
        
        //Pedimos el tamaño del array
        System.out.println("¿Cuantos numeros desea introducir?");
        tamaño = sc.nextInt();
        
        int numeros[] = new int[tamaño];
        
        System.out.println("Introduzca un numero: ");
        num = sc.nextInt();
        Arrays.fill(numeros, num);
        
        
        //Segundo bucle para ejecutar las acciones con el array
        for(int j=0;j<numeros.length;j++){
            System.out.print(numeros[j] + " ");
        }
    }
}
