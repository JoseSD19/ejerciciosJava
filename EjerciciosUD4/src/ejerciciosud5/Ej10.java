/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud5;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej10 {
    public static void main(String[] args) {
        int diez=0, nota;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Introduzca una nota: ");
            nota = entrada.nextInt();
            if(nota==10){
                diez++;
            }
        }while(nota!=-1);
        if(diez>0){
            System.out.println("Hubo algun 10");
        }else{
            System.out.println("No hubo ningun 10");
        }
    }
}
