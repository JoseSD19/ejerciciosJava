/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD7;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class ej15 {
    public static void ejecutar() {
        int vector[] = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i+1;
        }
        System.out.println("La suma de los primeros 100 numeros es: "+sumaArray(vector)+
                "\nY la media es: "+mediaArray(vector));
    }
    
    public static int sumaArray(int a[]){
        int suma=0;
        for (int i = 0; i < a.length; i++) {
            suma+=a[i];
        }
        return suma;
    }
    
    public static double mediaArray(int a[]){
        double media;
        media = sumaArray(a)/a.length;
        return media;
    }
}
