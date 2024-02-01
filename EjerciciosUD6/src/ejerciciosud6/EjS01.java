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
public class EjS01 {
    void Ejecutar(){
        
        String cadena;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca una cadena de texto: ");
        cadena = sc.nextLine();
        
        String palabras[]= cadena.split(" ");
        //__x.replace(a,b)__ remplaza la cadena de 'a' por la cadena de 'b' sin guardarlo
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
            
        }
        
    }
    
}
