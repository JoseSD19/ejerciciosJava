/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud5;

/**
 *
 * @author alumnot
 */
public class Ej09 {
    public static void main(String[] args) {
        int sum=0, mul=1;
        
        for(int i=1;i<=10;i++){
            sum = sum + i;
            mul = mul * i;
        }
        System.out.println("El valor de la suma es " + sum +
                " y el del producto es " + mul);
    }
}
