/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud6;

/**
 *
 * @author alumnot
 */
public class Ej14 {
    void Ejecutar(){
        int secuencia[]=new int [1+2+3+4+5+6+7+8+9+10];
        int cont = 0;
        
        for(int i=0;i<10;i++){
            for(int j=cont;j<55;j++){
                secuencia[j]=i;
            }
            cont+=i;
        }
        for(int k=0;k<secuencia.length;k++){
            System.out.print(secuencia[k]+" ");
        }
    }
}
