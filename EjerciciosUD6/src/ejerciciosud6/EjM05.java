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
public class EjM05 {
    void Ejecutar(){
        
        Scanner sc = new Scanner(System.in);
        int tamaño, genero;
        int hombres=0, mujeres=0;
        int sueldH=0, sueldM=0;
        double medH,medM;
        
        System.out.println("¿Cuantos empleados vas a introducir?");
        tamaño=sc.nextInt();
        
        int empleados[][]=new int[tamaño][2];
        for(int i=0;i<empleados.length;i++){
            
            do{
            System.out.println("El empleado "+(i+1)+" es Hombre(0) o Mujer(1)");
            genero=sc.nextInt();
            if(genero<0||genero>1){
                System.out.println("Genero incorrecto");
            }
            }while(genero<0||genero>1);
            empleados[i][0]=genero;
            
            System.out.println("Introduzca el sueldo del emplado "+(i+1)+": ");
            empleados[i][1]=sc.nextInt();
        }
        
        for(int i=0;i<empleados.length;i++){
            if(empleados[i][0]==0){
                hombres++;
                sueldH+=empleados[i][1];
            }else{
                mujeres++;
                sueldM+=empleados[i][1];
            }
        }
        medH=sueldH/hombres;
        medM=sueldM/mujeres;
        
        System.out.println("La media de la empresa queda asi: "
                        + "\nTrabajan "+hombres+" hombres y "+mujeres+" mujeres"
                        + "\nLa media de sueldos de hombres es: "+medH+""
                        + "\nLa media de sueldos de mujeres es: "+medM);
    }
}
