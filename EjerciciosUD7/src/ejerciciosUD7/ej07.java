/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD7;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class ej07 {
    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        double ancho, alto;
        
        System.out.println("Indica el alto del rectangulo: ");
        alto=sc.nextDouble();
        System.out.println("Indica el ancho del rectangulo: ");
        ancho=sc.nextDouble();
        
        System.out.println("El permietro es: "+perimetroRectangulo(ancho, alto)
                +"\nEl area es: "+areaRectangulo(ancho, alto));
        
    }
    public static double perimetroRectangulo(double ancho, double alto){
        double perimetro = 2*ancho+2*alto;
        return perimetro;
    }
    public static double areaRectangulo(double ancho, double alto){
        double area = ancho*alto;
        return area;
    }
}
