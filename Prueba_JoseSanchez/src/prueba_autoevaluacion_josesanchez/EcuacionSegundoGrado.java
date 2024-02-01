/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_autoevaluacion_josesanchez;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class EcuacionSegundoGrado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Poniendo la ecuacion cuadratica de esta manera: ax\u00b2+bx+c=0");
        System.out.println("Indique la a de la ecuacion:");
        a = sc.nextDouble();
        System.out.println("Indique la b de la ecuacion:");
        b = sc.nextDouble();
        System.out.println("Indique la c de la ecuacion:");
        c = sc.nextDouble();

        resolverEcuacion(a, b, c);
    }

    public static void resolverEcuacion(double a, double b, double c) {
        double raiz, resultado1, resultado2;
        
        raiz = (b*b)-(4*a*c);
        
        if (raiz>0) {
            resultado1 = ((-b)+Math.pow(raiz, 2))/(2*a);
            resultado2 = ((-b)-Math.pow(raiz, 2))/(2*a);
        }else if(raiz <0){
            resultado1 = ((-b)+Math.pow((raiz*(-1)), 2))/(2*a);
            resultado2 = ((-b)-Math.pow((raiz*(-1)), 2))/(2*a);
        }else{
            resultado1 = ((-b)+1)/(2*a);
            resultado2 = ((-b)-1)/(2*a);
        }
        
        System.out.println("La X en esta ecuacion puede valer: "+resultado1+" o "+resultado2);
    }
}
