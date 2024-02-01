/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej10 {
    void Ejecutar(){
        DecimalFormat df = new DecimalFormat("#.##");
        int tamaño, altos=0, bajos=0;
        double altura, sum=0, media;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("¿Cuantos personas ha medido?");
            tamaño = sc.nextInt();
            if(tamaño<=0){
                System.out.println("Tamaño incorrecto, debe ser positivo y de al menos 1 persona");
            }
        }while(tamaño<=0);
        
        double alturas[] = new double[tamaño];
      
        //Primer bucle para meter cada elemento de alturas
        for( int i=0;i<alturas.length;i++){
            System.out.println("Introduzca la "+(i+1)+"ª altura: ");
            altura = sc.nextDouble();
            alturas[i]=altura;
        }
        double max=alturas[0], min=alturas[0];
        //Segundo bucle para calcular la suma el maximo y el minimo
        for(int j=0;j<alturas.length;j++){
            sum += alturas[j];
            if(alturas[j]>max){
                max = alturas[j];
            }else if(alturas[j]<min){
                min = alturas[j];
            }
        }
        
        //Se calcula la media
        media = (sum/alturas.length);
        
        //Tercer bucle para ver cuantos miden mas que la media y cuantos menos
        for(int k=0;k<alturas.length;k++){
            if(alturas[k]>media){
                altos++;
            }else if(alturas[k]<media){
                bajos++;
            }
        }
        
        System.out.println("la media es: "+ df.format(media)
                + "\nLa altura maxima es: "+df.format(max)
                +"\nLa altura minima es: "+df.format(min)
                +"\nHay "+altos+" por encima de la media"
                +"\nHay "+bajos+" por debajo de la media");
    }
}
