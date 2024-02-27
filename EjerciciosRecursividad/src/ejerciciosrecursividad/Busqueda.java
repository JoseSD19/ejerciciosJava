/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrecursividad;

import java.util.Scanner;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Busqueda {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        
        int [] numeros = generarArray(500000);
        
        int buscado = 256430;
        
        long iBinaria = System.nanoTime();
        int r1 = busquedaBinaria(numeros, buscado);
        long fBinaria = System.nanoTime();
        
        long tBinaria = fBinaria - iBinaria;
        
        
        long iLineal = System.nanoTime();
        int r2 = busquedaNormal(numeros, buscado);
        long fLineal = System.nanoTime();
        
        long tLineal = fLineal - iLineal;
        
        
        System.out.println("El numero "+buscado
                +" esta en la posicion "+ r1
                +"y ha tardado "+ tBinaria+ " milisegundos");
        
        
        System.out.println("El numero "+buscado
                +" esta en la posicion "+ r2
                +"y ha tardado "+ tLineal+ " milisegundos");
        
    }

    public static int busquedaBinaria(int[] numeros, int buscado) {
        
        
        int inicio = 0;
        int fin = (numeros.length - 1);

        while (inicio <= fin) {
            
            int mid = (inicio + fin) / 2;

            if (numeros[mid] == buscado) {
                return mid;
            } else if (numeros[mid] < buscado) {
                inicio = mid + 1;
            } else {
                fin = mid-1;
            }
        }
        
        return -1;
    }
    
    public static int busquedaNormal(int[] numeros, int buscado){
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==buscado) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static int[] generarArray(int limite){
        int[] numeros = new int[limite];
        
        for (int i = 0; i < limite; i++) {
            numeros[i]= i;
        }
        
        return numeros;
    }
}
