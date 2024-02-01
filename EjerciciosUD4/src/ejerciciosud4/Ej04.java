/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ej04 {
    public static void main(String[] args) {
        /*DATOS
            VARIABLES*/
        
        double num1, num2, sum, res, mul, div;
        
        //---crear entrada por teclado
        Scanner entrada = new Scanner(System.in);
        
        //ALGORITMO
        
        System.out.println("Introduzca un numero: ");
        num1 = entrada.nextDouble();//---se lee el teclado---
        System.out.println("Introduzca el segundo numero (distinto de 0)");
        num2 = entrada.nextDouble();//---se lee el teclado---
        
        sum = num1 + num2;
        res = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        
        System.out.println("La suma de los numeros es: " + sum + 
                //_\n_--- Salto de linea
                "\nLa resta de los numeros es: " + res +
                "\nLa multiplicacion de los numeros es: " + mul +
                "\nLa division es: " + div);
    }
}
