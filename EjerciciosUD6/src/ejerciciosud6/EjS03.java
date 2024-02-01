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
public class EjS03 {
    void Ejecutar(){
        
        Scanner sc=new Scanner(System.in);
        String codigo;
        
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Inroduzca su 1er apellido: ");
        String apellido1 = sc.nextLine();
        System.out.println("Introduzca su 2o apellido: ");
        String apellido2 = sc.nextLine();
        
        //__x.substring(a,b)__ coge la cadena desde 'a' hasta el anterior a 'b'.
        codigo = nombre.substring(0, 3)+
                apellido1.substring(0, 3)+
                apellido2.substring(0, 3);
        
        //__x.toUpperCase()__ cambia 'x' a MAYUSCULAS
        System.out.println(codigo.toUpperCase());
    }
}
