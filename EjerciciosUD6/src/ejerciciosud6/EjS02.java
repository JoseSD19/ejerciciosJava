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
public class EjS02 {
    void Ejecutar(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca una cadena de texto: ");
        String cadena1 = sc.nextLine();
        
        System.out.println("Introduzca otra cadena de texto: ");
        String cadena2 = sc.nextLine();
        
        if(cadena1.equals(cadena2)){//__a.equals(b)__ solo si son exactas da true
            System.out.println("Son exactamente iguales");
        }else if(cadena1.equalsIgnoreCase(cadena2)){//__a.equalsIgnoreCase__ devuelve true si son iguales ignorando mayusculas y caracteres especiales
            System.out.println("Son iguales, ignorando mayusculas y minusculas");
        }else{
            System.out.println("No son iguales");
        }
    }
}
