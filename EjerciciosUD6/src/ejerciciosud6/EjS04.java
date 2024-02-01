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
public class EjS04 {
    void Ejecutar(){
        
        String cadena;
        int a=0, e=0, i=0, o=0, u=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca una frase: ");
        cadena = sc.nextLine().toLowerCase();
        
        char carac[]=cadena.toCharArray();
        
        for (int j = 0; j < carac.length; j++) {
            switch (carac[j]) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Hay "+a+" A's"
                        +"\nHay "+e+" E's"
                        +"\nHay "+i+" I's"
                        +"\nHay "+o+" O's"
                        +"\nHay "+u+" U's");
    }
}
