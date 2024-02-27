/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosrecursividad;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Binario {
    public static void ejecutar() {
        
        pasarBinario(60);
        System.out.println("");
        
    }
    
    public static void pasarBinario(int numero){
        
        
        if (numero<2) {
            System.out.print(numero);
        }else{
            pasarBinario(numero/2);
            System.out.print(numero%2);
        }
    }
}
