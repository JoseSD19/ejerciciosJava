/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud6;

/**
 *
 * @author alumnot
 */
public class EjM02 {
    void Ejecutar(){
        int tabla[][]=new int[10][10];
        
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[i].length;j++){
                tabla[i][j]=(i+1)*(j+1);
            }
        }
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[i].length;j++){
                System.out.print((j+1)+"*"+(i+1)+"="+tabla[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
