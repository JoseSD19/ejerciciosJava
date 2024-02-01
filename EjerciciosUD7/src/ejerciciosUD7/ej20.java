/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUD7;

/**
 *
 * @author Jose Sanchez Diaz
 */
public class ej20 {
    public static void Ejecutar() {
        for (int i = 1; i <= 10; i++) {
            tabla(i);
        }
    }
    public static void tabla(int a){
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+"*"+a+"="+(a*i)+"\t");
        }
        System.out.println("");
    }
}
