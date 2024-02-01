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
public class EjM03 {
    void Ejecutar(){
        int tabla[][] ,filas, columnas;
        int pos=0,neg=0,cero=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el numero de columnas: ");
        columnas = sc.nextInt();
        System.out.println("Introduzca el numero de filas: ");
        filas = sc.nextInt();
        
        tabla = new int[filas][columnas];
        
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[i].length;j++){
                System.out.println("Introduzca un valor: ");
                tabla[i][j]=sc.nextInt();
                
            }
        }
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[i].length;j++){
                if(tabla[i][j]>0){
                    pos++;
                }else if(tabla[i][j]<0){
                    neg++;
                }else{
                    cero++;
                }
            }
        }
        System.out.println("De los numeros introducidos:"
                + "\n"+pos+" son positivos"
                + "\n"+neg+" son negatios"
                + "\n"+cero+" son cero");
    }
}
