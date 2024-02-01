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
public class Ej17 {
    public static void main(String[] args) {
        int anterior, nuevo, total=0, fallo=0;
        Scanner entrada = new Scanner(System.in);
        boolean seguir=true;
        System.out.println("Dime el numero inicial: ");
        anterior = entrada.nextInt();
        
        do{
            System.out.print("Dime un numero: ");
            nuevo= entrada.nextInt();
            total++;
            
            if(nuevo == 0){
                seguir = false;
            }else if(anterior>nuevo && nuevo!=0){
                System.out.println("Fallo es menor");
                fallo++;
            }
            anterior = nuevo;
        }while(seguir);
        
        System.out.println("Total de numeros introducidos: "+total
                +"\nNumeros fallados: "+fallo);
    }
}
