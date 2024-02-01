/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud6;

/**
 *
 * @author alumnot
 */
public class Ej11 {
    
    void Ejecutar(){
        int ordenados[]=new int[100];
        int inversos[]=new int[100];
        int pos=0;
        //se crea el array normal
        for(int i=0;i<ordenados.length;i++){
            ordenados[i]=(i+1);
        }
        
        //se invierte el array copiado
        for(int j=100;j>0;j--){
            inversos[pos]=j;
            pos++;
        }
        
        System.out.println("Ordenados:");
        for(int k=0;k<ordenados.length;k++){
            System.out.print(ordenados[k] + " ");
        }
        
        System.out.println("\nInversos:");
        for(int l=0;l<inversos.length;l++){
            System.out.print(inversos[l] + " ");
        }
    }
}
