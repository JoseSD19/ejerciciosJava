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
public class EjM04 {
    void Ejecutar(){
        double notas[][]=new double[4][5];
        double medias[][]=new double[4][3];
        double sum=0,media, nota;
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<notas.length;i++){
            for(int j=0;j<notas[i].length;j++){
                do{
                    System.out.println("Introduzca la "+(j+1)+"a nota del alumno "+(i+1)+": ");
                    nota=sc.nextDouble();
                    if(nota<0||nota>10){
                        System.out.println("Nota incorrecta, metala de nuevo");
                    }
                }while(nota<0||nota>10);
                notas[i][j]=nota;
            }
        }
        
        for(int i=0;i<notas.length;i++){
            double max=notas[i][0], min=notas[i][0];
            for(int j=0;j<notas[i].length;j++){
                sum+=notas[i][j];
                if (notas[i][j]<min){
                    min = notas[i][j];
                } else if(notas[i][j]>max){
                    max = notas[i][j];
                }
            }
            media=sum/notas.length;
            medias[i][0]=media;
            medias[i][1]=max;
            medias[i][2]=min;
            sum=0;
        }
        for(int i=0;i<medias.length;i++){
            System.out.println("-------------------"
                                +"\nLa media del alumno "+(i+1)+ " es "+medias[i][0]
                                +"\nLa nota maxima del alumno "+(i+1)+ " es "+medias[i][1]
                                +"\nLa nota minima del alumno "+(i+1)+ " es "+medias[i][2]);
        }
    }
}
