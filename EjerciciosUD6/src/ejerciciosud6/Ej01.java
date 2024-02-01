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
public class Ej01 {
    //Creamos el metodo ejecutar para poder ejecutarlo desde la clase Main
    void Ejecutar() {
        //Creamos el array numeros
        double numeros[] = new double[10];
        double num;
        Scanner sc = new Scanner(System.in);
        //Primer bucle para almacenar los valores
        for( int i=0;i<numeros.length;i++){
            System.out.println("Introduzca un numero: ");
            num = sc.nextInt();
            numeros[i]=num;
        }
        //Segundo bucle para escribir los valores
        for(int j=0;j<numeros.length;j++){
            System.out.print(numeros[j]+" ");
        }
    }
}
