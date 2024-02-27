/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrecursividad;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class Rectangulo {

    public static void ejecutar() {

        rectangulo(3,5);
        
    }

    public static void rectangulo(int altura, int base) {
        if (altura > 0) {
            base(base);
            System.out.println("");
            rectangulo(altura - 1, base);
        }

    }
    
    public static void base (int base){
        for (int i = 0; i < base; i++) {
                System.out.print("*");
            }
    }
}
