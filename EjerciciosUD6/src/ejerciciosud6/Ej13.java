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
public class Ej13 {
    void Ejecutar(){
        int valor, incremento, tamaño;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuantos valores quieres en la secuencia?");
        tamaño=sc.nextInt();
        int secuencia[]=new int[tamaño];
        
        System.out.println("¿Con que valor quieres empezar?");
        valor = sc.nextInt();
        secuencia[0]=valor;
        
        System.out.println("¿Cuanto quieres que se incremente?");
        incremento = sc.nextInt();
        
        for(int i=1;i<secuencia.length;i++){
            secuencia[i]=secuencia[i-1]+incremento;
        }
        System.out.println("La secuencia es:");
        for(int j=0;j<secuencia.length;j++){
            System.out.print(secuencia[j]+" ");
        }
    }
}
